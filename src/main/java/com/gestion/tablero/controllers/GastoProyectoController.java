package com.gestion.tablero.controllers;

import com.gestion.tablero.controllers.Base.BaseControllerImpl;
import com.gestion.tablero.domain.entities.GastoProyecto;
import com.gestion.tablero.services.Impl.GastoProyectoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/gasto-proyecto")
public class GastoProyectoController extends BaseControllerImpl<GastoProyecto, GastoProyectoServiceImpl> {
}
