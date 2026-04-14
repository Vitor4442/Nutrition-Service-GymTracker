package GymTracker.nutritionv1.Service;

import GymTracker.nutritionv1.DTO.IbgeFoodDTO;
import GymTracker.nutritionv1.Mapper.IbgeFoodMapper;
import GymTracker.nutritionv1.Repository.IbgeFoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IbgeFoodService {

    private final IbgeFoodRepository repository;
    private final IbgeFoodMapper mapper;

    public List<IbgeFoodDTO> findAllFoods (){
       return mapper.toDTOAll(repository.findAll());
    }





}
