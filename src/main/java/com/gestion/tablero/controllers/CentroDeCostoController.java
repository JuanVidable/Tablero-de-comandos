package com.gestion.tablero.controllers;

import com.gestion.tablero.controllers.Base.BaseControllerImpl;
import com.gestion.tablero.domain.entities.CentroDeCosto;
import com.gestion.tablero.services.Impl.CentroDeCostoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/centro-de-costo")
public class CentroDeCostoController extends BaseControllerImpl<CentroDeCosto, CentroDeCostoServiceImpl> {

}
