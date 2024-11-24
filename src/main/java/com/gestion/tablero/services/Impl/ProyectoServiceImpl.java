package com.gestion.tablero.services.Impl;

import com.gestion.tablero.entities.Proyecto;
import com.gestion.tablero.repositories.BaseRepository;
import com.gestion.tablero.services.Base.BaseServiceImpl;
import com.gestion.tablero.services.ProyectoService;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl extends BaseServiceImpl<Proyecto, Long> implements ProyectoService {
    public ProyectoServiceImpl(BaseRepository<Proyecto, Long> baseRepository) {
        super(baseRepository);
    }
}
