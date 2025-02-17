package com.gestion.tablero.services.Impl;

import com.gestion.tablero.domain.entities.CentroDeCosto;
import com.gestion.tablero.domain.entities.GastoCdC;
import com.gestion.tablero.repositories.BaseRepository;
import com.gestion.tablero.repositories.CentroDeCostoRepository;
import com.gestion.tablero.repositories.GastoCdCRepository;
import com.gestion.tablero.services.Base.BaseServiceImpl;
import com.gestion.tablero.services.GastoCdCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoCdCServiceImpl extends BaseServiceImpl<GastoCdC, Long> implements GastoCdCService {

    @Autowired
    private GastoCdCRepository gastoCdCRepository;

    @Autowired
    private CentroDeCostoRepository centroDeCostoRepository;
    public GastoCdCServiceImpl(BaseRepository<GastoCdC, Long> baseRepository) {
        super(baseRepository);
    }

    public GastoCdC registrarGasto(GastoCdC gasto){
        CentroDeCosto centro = centroDeCostoRepository
    }
}
