package com.gestion.tablero.domain.entities;

import com.gestion.tablero.domain.enums.TipoTransaccion;
import jakarta.persistence.*;
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
@Table
@SuperBuilder
public class GastoCdC extends Base{
    private String fecha;

    @Enumerated(EnumType.STRING)
    private TipoTransaccion tipo;

    private float monto;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="fk_centersDeCosto")
    private CentroDeCosto centroDeCosto;
}
