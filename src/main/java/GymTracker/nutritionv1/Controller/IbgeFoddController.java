package GymTracker.nutritionv1.Controller;

import GymTracker.nutritionv1.DTO.IbgeFoodDTO;
import GymTracker.nutritionv1.Service.IbgeFoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nutrition")
@RequiredArgsConstructor
public class IbgeFoddController {

    private final IbgeFoodService service;

    @GetMapping
    public ResponseEntity<List<IbgeFoodDTO>> GetALL(){
        return ResponseEntity.ok(service.findAllFoods());
    }
}
