package GymTracker.nutritionv1.Mapper;

import GymTracker.nutritionv1.DTO.AuthRequest;
import GymTracker.nutritionv1.DTO.AuthResponse;
import GymTracker.nutritionv1.Model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntityResponse (AuthResponse authResponse);
    User toEntityRequest (AuthRequest authRequest);
    AuthRequest toUserRequest (User user);
    AuthResponse toUserResponse (User user);
}
