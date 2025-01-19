package com.gestion.tablero.services.Impl;

import com.gestion.tablero.domain.entities.GastoProyecto;
import com.gestion.tablero.repositories.BaseRepository;
import com.gestion.tablero.services.Base.BaseServiceImpl;
import com.gestion.tablero.services.GastoProyectoService;
import org.springframework.stereotype.Service;

@Service
public class GastoProyectoServiceImpl extends BaseServiceImpl<GastoProyecto, Long> implements GastoProyectoService {
    public GastoProyectoServiceImpl(BaseRepository<GastoProyecto, Long> baseRepository) {
        super(baseRepository);
    }
}
