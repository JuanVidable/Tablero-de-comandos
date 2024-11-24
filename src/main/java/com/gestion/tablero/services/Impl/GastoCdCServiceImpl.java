package com.gestion.tablero.services.Impl;

import com.gestion.tablero.entities.GastoCdC;
import com.gestion.tablero.repositories.BaseRepository;
import com.gestion.tablero.services.Base.BaseServiceImpl;
import com.gestion.tablero.services.GastoCdCService;
import org.springframework.stereotype.Service;

@Service
public class GastoCdCServiceImpl extends BaseServiceImpl<GastoCdC, Long> implements GastoCdCService {

    public GastoCdCServiceImpl(BaseRepository<GastoCdC, Long> baseRepository) {
        super(baseRepository);
    }
}
