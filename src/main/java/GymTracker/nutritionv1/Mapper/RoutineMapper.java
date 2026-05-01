package GymTracker.nutritionv1.Mapper;

import GymTracker.nutritionv1.DTO.IbgeFoodDTO;
import GymTracker.nutritionv1.DTO.RoutineDTO;
import GymTracker.nutritionv1.Model.IbgeFood;
import GymTracker.nutritionv1.Model.Routine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class RoutineMapper {

    @Autowired
    protected IbgeFoodMapper ibgeFoodMapper;

    @Mapping(target = "foods", expression = "java(toEntityFoods(dto.getFoods()))")
    public abstract Routine toEntity(RoutineDTO dto);

    @Mapping(target = "foods", expression = "java(toDtoFoods(routine.getFoods()))")
    public abstract RoutineDTO toDTO(Routine routine);

    protected List<IbgeFood> toEntityFoods(List<IbgeFoodDTO> foods) {
        return ibgeFoodMapper.toEntityAll(foods);
    }

    protected List<IbgeFoodDTO> toDtoFoods(List<IbgeFood> foods) {
        return ibgeFoodMapper.toDTOAll(foods);
    }
}
