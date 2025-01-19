package com.gestion.tablero.controllers;

import com.gestion.tablero.controllers.Base.BaseControllerImpl;
import com.gestion.tablero.domain.entities.GastoCdC;
import com.gestion.tablero.services.Impl.GastoCdCServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/gasto-centro-de-costo")
public class GastoCdCController extends BaseControllerImpl<GastoCdC, GastoCdCServiceImpl> {
}
