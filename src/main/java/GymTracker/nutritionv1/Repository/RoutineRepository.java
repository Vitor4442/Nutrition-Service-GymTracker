package GymTracker.nutritionv1.Repository;

import GymTracker.nutritionv1.Model.Routine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutineRepository extends JpaRepository<Routine, Long> {
}
