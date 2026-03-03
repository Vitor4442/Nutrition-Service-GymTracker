package GymTracker.nutritionv1.Mapper;

import GymTracker.nutritionv1.DTO.IbgeFoodDTO;


import GymTracker.nutritionv1.Model.IbgeFood;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IbgeFoodMapper {
    IbgeFood toEntity (IbgeFoodDTO dto);
    IbgeFoodDTO toDTO (IbgeFood entity);
}
