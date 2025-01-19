package com.gestion.tablero.repositories;

import com.gestion.tablero.domain.entities.Proyecto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends BaseRepository<Proyecto, Long> {
}
