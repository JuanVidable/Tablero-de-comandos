package com.gestion.tablero.services.Base;

import com.gestion.tablero.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base, ID extends Serializable> {

    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;


}
