package GymTracker.nutritionv1.Service;

import GymTracker.nutritionv1.DTO.IbgeFoodDTO;
import GymTracker.nutritionv1.Mapper.IbgeFoodMapper;
import GymTracker.nutritionv1.Repository.IbgeFoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IbgeFoodService {

    private final IbgeFoodRepository repository;
    private final IbgeFoodMapper mapper;

    @Transactional(readOnly = true)
    public List<IbgeFoodDTO> findAllFoods (){
       return mapper.toDTOAll(repository.findAll());
    }

    @Transactional(readOnly = true)
    public List<IbgeFoodDTO> searchFood (String descricacao_do_alimento){
        return mapper.toDTOAll(repository.searchFood(descricacao_do_alimento));
    }






}
