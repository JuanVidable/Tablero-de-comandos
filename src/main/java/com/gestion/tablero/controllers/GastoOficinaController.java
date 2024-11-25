package com.gestion.tablero.controllers;

import com.gestion.tablero.controllers.Base.BaseControllerImpl;
import com.gestion.tablero.entities.GastoOficina;
import com.gestion.tablero.services.Impl.GastoOficinaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/gasto-oficina")
public class GastoOficinaController extends BaseControllerImpl<GastoOficina, GastoOficinaServiceImpl> {
}
