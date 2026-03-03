package com.seunome.projeto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IbgeFoodSimpleDTO implements Serializable {

    private Long id;
    private Integer codigo;
    private String descricaoDoAlimento;
    private String categoria;
    private String descricaoDaPreparacao;
    private String slug;

    private Double energiaKcal;
    private Double proteinaG;
    private Double lipidiosTotaisG;
    private Double carboidratoG;
    private Double fibraAlimentarTotalG;
    private Double colesterolMg;
    private Double sodioMg;
    private Double vitaminaCMg;

}