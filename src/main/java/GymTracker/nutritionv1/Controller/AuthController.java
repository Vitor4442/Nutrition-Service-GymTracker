package GymTracker.nutritionv1.Controller;

import GymTracker.nutritionv1.DTO.AuthRequest;
import GymTracker.nutritionv1.DTO.AuthResponse;
import GymTracker.nutritionv1.Security.JwtUtil;
import GymTracker.nutritionv1.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil, UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return userService.login(request);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody AuthRequest request){
        userService.createUser(request);
       return ResponseEntity.status(201).body("usuario criado com sucesso!");
    }
}