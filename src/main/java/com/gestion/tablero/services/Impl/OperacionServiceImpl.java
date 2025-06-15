package com.gestion.tablero.services.Impl;

import com.gestion.tablero.domain.entities.Operacion;
import com.gestion.tablero.repositories.BaseRepository;
import com.gestion.tablero.services.Base.BaseServiceImpl;
import com.gestion.tablero.services.OperacionService;

public class OperacionServiceImpl extends BaseServiceImpl<Operacion, Long> implements OperacionService {

    public OperacionServiceImpl(BaseRepository<Operacion, Long> baseRepository) {
        super(baseRepository);
    }
}
