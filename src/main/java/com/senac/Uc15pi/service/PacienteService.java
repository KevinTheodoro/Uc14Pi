package com.senac.Uc15pi.service;

import com.senac.Uc15pi.data.Paciente;
import com.senac.Uc15pi.data.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin
 */
@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    public Paciente criarPaciente(Paciente paciente) {
        paciente.setId(null);

        paciente = pacienteRepository.save(paciente);

        return paciente;
    }
}
