package com.senac.Uc15pi.service;

import com.senac.Uc15pi.data.Paciente;
import com.senac.Uc15pi.data.Ficha;
import com.senac.Uc15pi.data.FichaRepository;
import com.senac.Uc15pi.exception.ResourceNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin
 */
@Service
public class FichaService {
    @Autowired
    FichaRepository fichaRepository;

    public Ficha criarFicha(Ficha ficha) {
        ficha.setId(null);

        ficha = fichaRepository.save(ficha);

        return ficha;
    }

    public List<Ficha> listarFichas(Paciente paciente) {
        return fichaRepository.findByPaciente(paciente);
    }

    public Ficha getFichaId(Integer fichaId) {
        return fichaRepository.findById(fichaId).orElseThrow(() -> new ResourceNotFoundException("Ficha não encontrado "+ fichaId));
    }
}
