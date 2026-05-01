package GymTracker.nutritionv1.Service;

import GymTracker.nutritionv1.DTO.IbgeFoodDTO;
import GymTracker.nutritionv1.DTO.RoutineDTO;
import GymTracker.nutritionv1.Mapper.RoutineMapper;
import GymTracker.nutritionv1.Model.IbgeFood;
import GymTracker.nutritionv1.Model.Routine;
import GymTracker.nutritionv1.Repository.IbgeFoodRepository;
import GymTracker.nutritionv1.Repository.RoutineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoutineService {

    private final RoutineMapper mapper;
    private final RoutineRepository repository;
    private final IbgeFoodRepository repositoryFood;
    @Transactional()
    public RoutineDTO addRoutine(RoutineDTO dto){
        List<Long> idFoods = dto.getFoods().stream().map(IbgeFoodDTO::getId).toList();
        List<IbgeFood> foods = repositoryFood.findAllById(idFoods);

        Routine routine = repository.save(mapper.toEntity(dto));
        routine.setFoods(foods);

       return mapper.toDTO(routine);
    }


}
