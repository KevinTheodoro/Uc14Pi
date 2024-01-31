package com.senac.Uc15pi.service;

import com.senac.Uc15pi.data.Terapeuta;
import com.senac.Uc15pi.data.TerapeutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin
 */
@Service
public class TerapeutaService {
    @Autowired
    TerapeutaRepository terapeutaRepository;

    public Terapeuta criarTerapeuta(Terapeuta terapeuta) {
        terapeuta.setId(null);

        terapeuta = terapeutaRepository.save(terapeuta);

        return terapeuta;
    }
}
