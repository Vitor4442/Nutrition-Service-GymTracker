package GymTracker.nutritionv1.DTO;

import GymTracker.nutritionv1.Model.RoutineStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoutineDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private RoutineStatus mealName;
    @Builder.Default
    private List<IbgeFoodDTO> foods = new ArrayList<>();
    private LocalDateTime routineAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
