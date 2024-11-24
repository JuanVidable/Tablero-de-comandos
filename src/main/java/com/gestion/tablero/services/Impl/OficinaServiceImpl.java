package com.gestion.tablero.services.Impl;

import com.gestion.tablero.entities.Oficina;
import com.gestion.tablero.repositories.BaseRepository;
import com.gestion.tablero.services.Base.BaseServiceImpl;
import com.gestion.tablero.services.OficinaService;
import org.springframework.stereotype.Service;

@Service
public class OficinaServiceImpl extends BaseServiceImpl<Oficina, Long> implements OficinaService {
    public OficinaServiceImpl(BaseRepository<Oficina, Long> baseRepository) {
        super(baseRepository);
    }
}
