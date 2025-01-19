package com.gestion.tablero.domain.entities;

import com.gestion.tablero.domain.enums.TipoTransaccion;
import jakarta.persistence.*;
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

    @Enumerated(EnumType.STRING)
    private TipoTransaccion tipo;

    private float monto;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="fk_oficina")
    private Oficina oficina;
}
