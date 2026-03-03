package GymTracker.nutritionv1.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IbgeFoodDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer codigo;
    private String descricaoDoAlimento;
    private String categoria;
    private Integer codigoDePreparacao;
    private String descricaoDaPreparacao;
    private String slug;

    // Macronutrientes e Calorias
    private Double energiaKcal;
    private Double proteinaG;
    private Double lipidiosTotaisG;
    private Double carboidratoG;
    private Double fibraAlimentarTotalG;
    private Double colesterolMg;

    // Ácidos Graxos
    private Double agSaturadosG;
    private Double agMonoG;
    private Double agPoliG;
    private Double agLinoleicoG;
    private Double agLinolenicoG;
    private Double agTransTotalG;

    // Açúcares
    private Double acucarTotalG;
    private Double acucarDeAdicaoG;

    // Minerais
    private Double calcioMg;
    private Double magnesioMg;
    private Double manganesMg;
    private Double fosforoMg;
    private Double ferroMg;
    private Double sodioMg;
    private Double sodioDeAdicaoMg;
    private Double potassioMg;
    private Double cobreMg;
    private Double zincoMg;
    private Double selenioMcg;

    // Vitaminas
    private Double retinolMcg;
    private Double vitaminaARaeMcg;
    private Double tiaminaMg;
    private Double riboflavinaMg;
    private Double niacinaMg;
    private Double niacinaNeMg;
    private Double piridoxinaMg;
    private Double cobalaminaMcg;
    private Double folatoDfeMcg;
    private Double vitaminaDMcg;
    private Double vitaminaEMg;
    private Double vitaminaCMg;
}