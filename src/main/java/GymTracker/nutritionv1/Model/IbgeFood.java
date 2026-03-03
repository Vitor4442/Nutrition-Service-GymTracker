package GymTracker.nutritionv1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ibge_foods2")
public class IbgeFood implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Codigo")
    private Integer codigo;

    @Column(name = "descricacao_do_alimento")
    private String descricaoDoAlimento;

    @Column(name = "Categoria")
    private String categoria;

    @Column(name = "Codigo_de_preparacao")
    private Integer codigoDePreparacao;

    @Column(name = "descricao_da_preparacao")
    private String descricaoDaPreparacao;

    @Column(name = "Energia_kcal")
    private String energiaKcal;

    @Column(name = "Proteina_g")
    private String proteinaG;

    @Column(name = "Lipidios_totais_g")
    private String lipidiosTotaisG;

    @Column(name = "Carboi_drato_g")
    private String carboidratoG;

    @Column(name = "Fibra_alimentar_total_g")
    private String fibraAlimentarTotalG;

    @Column(name = "Coles_terol_mg")
    private String colesterolMg;

    @Column(name = "AG_Satura_dos_g")
    private String agSaturadosG;

    @Column(name = "AG_Mono_g")
    private String agMonoG;

    @Column(name = "AG_Poli_g")
    private String agPoliG;

    @Column(name = "AG_Lino_leico_g")
    private String agLinoleicoG;

    @Column(name = "AG_Linole_nico_g")
    private String agLinolenicoG;

    @Column(name = "AG_Trans_total_g")
    private String agTransTotalG;

    @Column(name = "Acucar_total_g")
    private String acucarTotalG;

    @Column(name = "Acucar_de_adicacao_g")
    private String acucarDeAdicaoG;

    @Column(name = "Calcio_mg")
    private String calcioMg;

    @Column(name = "Mag_nesio_mg")
    private String magnesioMg;

    @Column(name = "Man_ganes_mg")
    private String manganesMg;

    @Column(name = "Fosforo_mg")
    private String fosforoMg;

    @Column(name = "Ferro_mg")
    private String ferroMg;

    @Column(name = "Sodio_mg")
    private String sodioMg;

    @Column(name = "Sodio_de_adicao_mg")
    private String sodioDeAdicaoMg;

    @Column(name = "Potas_sio_mg")
    private String potassioMg;

    @Column(name = "Co_bre_mg")
    private String cobreMg;

    @Column(name = "Zinco_mg")
    private String zincoMg;

    @Column(name = "Sele_nio_mcg")
    private String selenioMcg;

    @Column(name = "Reti_nol_mcg")
    private String retinolMcg;

    @Column(name = "Vitami_na_A_RAE_mcg")
    private String vitaminaAraemcg;

    @Column(name = "Tiami_na_mg")
    private String tiaminaMg;

    @Column(name = "Ribofla_vina_mg")
    private String riboflavinaMg;

    @Column(name = "Niaci_na_mg")
    private String niacinaMg;

    @Column(name = "Niaci_na_NE_mg")
    private String niacinaNeMg;

    @Column(name = "Pirido_xina_mg")
    private String piridoxinaMg;

    @Column(name = "Coba_lami_na_mcg")
    private String cobalaminaMcg;

    @Column(name = "Folato_DFE_mcg")
    private String folatoDfeMcg;

    @Column(name = "Vitami_na_D_mcg")
    private String vitaminaDMcg;

    @Column(name = "Vitami_na_E_mg")
    private String vitaminaEMg;

    @Column(name = "Vitami_na_C_mg")
    private String vitaminaCMg;

    private String slug;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}