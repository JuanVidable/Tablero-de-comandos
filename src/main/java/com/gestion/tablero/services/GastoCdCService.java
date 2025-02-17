package com.gestion.tablero.services;

import com.gestion.tablero.domain.entities.GastoCdC;
import com.gestion.tablero.services.Base.BaseService;

public interface GastoCdCService extends BaseService<GastoCdC, Long> {
    public GastoCdC registrarGasto(GastoCdC gasto);
}
