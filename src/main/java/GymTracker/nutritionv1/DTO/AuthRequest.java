package GymTracker.nutritionv1.DTO;

import lombok.Data;

@Data
public class AuthRequest {

    private String username;
    private String password;
    private String email;


}
