package com.gestion.tablero.services.Impl;

import com.gestion.tablero.domain.entities.CentroDeCosto;
import com.gestion.tablero.domain.entities.GastoCdC;
import com.gestion.tablero.domain.enums.TipoTransaccion;
import com.gestion.tablero.repositories.BaseRepository;
import com.gestion.tablero.repositories.CentroDeCostoRepository;
import com.gestion.tablero.repositories.GastoCdCRepository;
import com.gestion.tablero.services.Base.BaseServiceImpl;
import com.gestion.tablero.services.GastoCdCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoCdCServiceImpl extends BaseServiceImpl<GastoCdC, Long> implements GastoCdCService {

    @Autowired
    private GastoCdCRepository gastoCdCRepository;

    @Autowired
    private CentroDeCostoRepository centroDeCostoRepository;
    public GastoCdCServiceImpl(BaseRepository<GastoCdC, Long> baseRepository) {
        super(baseRepository);
    }

    public GastoCdC registrarGasto(GastoCdC gasto){

        // Buscar Centro de Costo por ID
        CentroDeCosto centro = centroDeCostoRepository.findById(gasto.getCentroDeCosto().getId()).orElseThrow(() -> new RuntimeException("Centro de Costo no encontrado"));

        // Verifico que sea ingreso o egreso
        if(gasto.getTipo().equals(TipoTransaccion.EGRESO)){
            centro.setEgresoAcumulado(gasto.getMonto() + centro.getEgresoAcumulado());
            centro.setEgresoMensual(gasto.getMonto() + centro.getEgresoMensual());
        }else if(gasto.getTipo().equals(TipoTransaccion.INGRESO)){
            centro.setIngresoAcumulado(gasto.getMonto() + centro.getIngresoAcumulado());
            centro.setIngresoMensual(gasto.getMonto() + centro.getIngresoMensual());
        }

        centroDeCostoRepository.save(centro);
        return gastoCdCRepository.save(gasto);

    }
}
