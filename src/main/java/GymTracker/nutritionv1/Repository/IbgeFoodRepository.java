package GymTracker.nutritionv1.Repository;

import GymTracker.nutritionv1.Model.IbgeFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IbgeFoodRepository extends JpaRepository<IbgeFood, Long> {

    @Query("SELECT i FROM IbgeFood i WHERE i.descricaoDoAlimento ILIKE %:name%")
    List<IbgeFood> searchFood(@Param("name") String name);
}
