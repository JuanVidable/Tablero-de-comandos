package com.gestion.tablero.controllers;

import com.gestion.tablero.controllers.Base.BaseControllerImpl;
import com.gestion.tablero.domain.entities.GastoCdC;
import com.gestion.tablero.services.Impl.GastoCdCServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/gasto-centro-de-costo")
public class GastoCdCController extends BaseControllerImpl<GastoCdC, GastoCdCServiceImpl> {

    @PostMapping("/registrar")
    public ResponseEntity<GastoCdC> registrarGasto(@RequestBody GastoCdC gasto) {
        GastoCdC nuevoGasto = servicio.registrarGasto(gasto);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoGasto);
    }
}
