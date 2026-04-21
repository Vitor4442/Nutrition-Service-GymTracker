package GymTracker.nutritionv1.Service;

import GymTracker.nutritionv1.DTO.AuthRequest;
import GymTracker.nutritionv1.DTO.AuthResponse;
import GymTracker.nutritionv1.Mapper.UserMapper;
import GymTracker.nutritionv1.Model.User;
import GymTracker.nutritionv1.Repository.UserRepository;
import GymTracker.nutritionv1.Security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    public User createUser(AuthRequest authRequest) {

        User user = userMapper.toEntityRequest(authRequest);
        user.setPassword(passwordEncoder.encode(authRequest.getPassword()));
        user.setEnabled(true);
        user.setRole("USER");

        return userRepository.save(user);
    }

    public AuthResponse login (AuthRequest request) {

        User user = userRepository.findByUsername(request.getUsername()).orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        if(user.getEnabled() == false){
            throw new RuntimeException("Usuario desabilitado");
        }
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        String token = jwtUtil.generateToken(request.getUsername());

        return new AuthResponse(token);

    }
}