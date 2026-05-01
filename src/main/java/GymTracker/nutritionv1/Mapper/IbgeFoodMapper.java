package GymTracker.nutritionv1.Mapper;

import GymTracker.nutritionv1.DTO.IbgeFoodDTO;
import GymTracker.nutritionv1.Model.IbgeFood;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface IbgeFoodMapper {
    @Mapping(source = "vitaminaAraemcg", target = "vitaminaARaeMcg")
    IbgeFoodDTO toDTO(IbgeFood entity);

    List<IbgeFoodDTO> toDTOAll (List<IbgeFood> entity);

    @InheritInverseConfiguration(name = "toDTO")
    IbgeFood toEntity(IbgeFoodDTO dto);

    List<IbgeFood> toEntityAll(List<IbgeFoodDTO> dto);

    default Double map(String value) {
        if (value == null || value.isBlank() || "-".equals(value)) {
            return null;
        }
        return Double.parseDouble(value.replace(",", "."));
    }

    default String map(Double value) {
        return value == null ? null : String.valueOf(value);
    }
}
