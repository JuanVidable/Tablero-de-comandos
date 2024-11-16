package com.gestion.tablero.entities;

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
public class GastoOficina extends Base{
    private String fecha;
    private String tipo;
    private float monto;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="fk_oficina")
    private Oficina oficina;
}
