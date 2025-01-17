package com.gestion.tablero.domain.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CentroDeCosto extends Base{
    private String nombre;
    private float IngresoMensual;
    private float EgresoMensual;
    private float IngresoAcumulado;
    private float EgresoAcumulado;
}
