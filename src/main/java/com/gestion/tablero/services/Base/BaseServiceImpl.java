package com.gestion.tablero.services.Base;

import com.gestion.tablero.domain.entities.Base;
import com.gestion.tablero.repositories.BaseRepository;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try{
            List<E> entities = baseRepository.findAll();
            return entities;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = baseRepository.save(entity);
            return entity;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            E ent = entityOptional.get();
            ent = baseRepository.save(entity);
            return ent;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);

            if (entityOptional.isPresent()) {
                E entity = entityOptional.get();
                if (entity instanceof Base) {
                    ((Base) entity).setEliminado(true);
                    baseRepository.save(entity);
                    return true;
                } else {
                    throw new Exception("La entidad no soporta eliminación lógica.");
                }
            } else {
                throw new Exception("Entidad no encontrada.");
            }
        } catch (Exception e) {
            throw new Exception("Error al eliminar lógicamente la entidad: " + e.getMessage());
        }
    }
}
