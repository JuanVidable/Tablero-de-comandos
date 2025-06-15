package com.gestion.tablero.domain.dto;

import com.gestion.tablero.domain.enums.TipoTransaccion;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperacionDTO {
    private String fecha;
    private TipoTransaccion tipo;
    private float monto;
    private String descripcion;

    private Long proyectoId;
    private Long centroDeCostoId;
    private Long oficinaId;
}
