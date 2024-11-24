package com.gestion.tablero.services.Impl;

import com.gestion.tablero.entities.GastoOficina;
import com.gestion.tablero.repositories.BaseRepository;
import com.gestion.tablero.services.Base.BaseServiceImpl;
import com.gestion.tablero.services.GastoOficinaService;
import org.springframework.stereotype.Service;

@Service
public class GastoOficinaServiceImpl extends BaseServiceImpl<GastoOficina, Long> implements GastoOficinaService {

    public GastoOficinaServiceImpl(BaseRepository<GastoOficina, Long> baseRepository) {
        super(baseRepository);
    }
}
