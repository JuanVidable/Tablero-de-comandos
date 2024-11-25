package com.gestion.tablero.controllers;

import com.gestion.tablero.controllers.Base.BaseControllerImpl;
import com.gestion.tablero.entities.Oficina;
import com.gestion.tablero.services.Impl.OficinaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/oficina")
public class OficinaController extends BaseControllerImpl<Oficina, OficinaServiceImpl> {
}