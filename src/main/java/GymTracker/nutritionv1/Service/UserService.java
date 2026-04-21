package GymTracker.nutritionv1.Service;

import GymTracker.nutritionv1.DTO.AuthRequest;
import GymTracker.nutritionv1.Mapper.UserMapper;
import GymTracker.nutritionv1.Model.User;
import GymTracker.nutritionv1.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public User createUser(AuthRequest authRequest) {

        User user = userMapper.toEntityRequest(authRequest);
        user.setPassword(passwordEncoder.encode(authRequest.getPassword()));
        user.setEnabled(true);
        user.setRole("USER");

        return userRepository.save(user);
    }
}