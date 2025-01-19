package com.gestion.tablero.controllers;

import com.gestion.tablero.controllers.Base.BaseControllerImpl;
import com.gestion.tablero.domain.entities.Proyecto;
import com.gestion.tablero.services.Impl.ProyectoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/proyecto")
public class ProyectoController extends BaseControllerImpl<Proyecto, ProyectoServiceImpl> {
}
