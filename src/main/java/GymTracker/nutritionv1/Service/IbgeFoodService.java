package GymTracker.nutritionv1.Service;

import GymTracker.nutritionv1.DTO.IbgeFoodDTO;
import GymTracker.nutritionv1.Mapper.IbgeFoodMapper;
import GymTracker.nutritionv1.Model.IbgeFood;
import GymTracker.nutritionv1.Repository.IbgeFoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IbgeFoodService {

    private final IbgeFoodRepository repository;
    private final IbgeFoodMapper mapper;

    public IbgeFoodDTO create (IbgeFoodDTO food, double porcaoGramas ){
        return mapper.toDTO(repository.save(mapper.toEntity(food).calcularPorcao(porcaoGramas)));
    }





}
