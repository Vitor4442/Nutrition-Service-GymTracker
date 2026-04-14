package GymTracker.nutritionv1.Mapper;

import GymTracker.nutritionv1.DTO.IbgeFoodDTO;
import GymTracker.nutritionv1.Model.IbgeFood;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface IbgeFoodMapper {
    @Mapping(source = "vitaminaAraemcg", target = "vitaminaARaeMcg")
    IbgeFoodDTO toDTO(IbgeFood entity);

    List<IbgeFoodDTO> toDTOAll (List<IbgeFood> entity);

    default Double map(String value) {
        if (value == null || value.isBlank() || "-".equals(value)) {
            return null;
        }
        return Double.parseDouble(value.replace(",", "."));
    }
}
