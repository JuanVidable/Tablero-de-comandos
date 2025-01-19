package com.gestion.tablero.services.Impl;

import com.gestion.tablero.domain.entities.CentroDeCosto;
import com.gestion.tablero.repositories.BaseRepository;
import com.gestion.tablero.services.Base.BaseServiceImpl;
import com.gestion.tablero.services.CentroDeCostoService;
import org.springframework.stereotype.Service;

@Service
public class CentroDeCostoServiceImpl extends BaseServiceImpl<CentroDeCosto, Long> implements CentroDeCostoService {

    public CentroDeCostoServiceImpl(BaseRepository<CentroDeCosto, Long> baseRepository) {
        super(baseRepository);
    }
}
