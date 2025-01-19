package com.gestion.tablero.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class GastoProyecto extends Base{
    private String descripcion;
    private float monto;
    private String fecha;

    @ManyToOne
    @JoinColumn(name="fk_proyecto")
    private Proyecto proyecto;
}
