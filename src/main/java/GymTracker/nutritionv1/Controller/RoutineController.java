package GymTracker.nutritionv1.Controller;

import GymTracker.nutritionv1.DTO.RoutineDTO;
import GymTracker.nutritionv1.Service.RoutineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rotina")
@RequiredArgsConstructor
public class RoutineController {
    private final RoutineService service;

    @PostMapping("/adicionar")
    public ResponseEntity<RoutineDTO> addRoutine(@RequestBody RoutineDTO dto){
        RoutineDTO rotina = service.addRoutine(dto);
        return ResponseEntity.status(201).body(rotina);
    }
}
