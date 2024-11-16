package com.gestion.tablero.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class CentroDeCosto extends Base{
    private String nombre;
    private float IngresoMensual;
    private float EgresoMensual;
    private float IngresoAcumulado;
    private float EgresoAcumulado;
}
