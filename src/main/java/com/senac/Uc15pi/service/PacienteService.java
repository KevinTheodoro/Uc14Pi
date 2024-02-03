package com.senac.Uc15pi.service;

import com.senac.Uc15pi.data.Terapeuta;
import com.senac.Uc15pi.data.Paciente;
import com.senac.Uc15pi.data.PacienteRepository;
import com.senac.Uc15pi.exception.ResourceNotFoundException;
import java.util.List;
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

    public List<Paciente> listarPacientes(Terapeuta terapeuta) {
        return pacienteRepository.findByTerapeuta(terapeuta);
    }

    public Paciente getPacienteId(Integer pacienteId) {
        return pacienteRepository.findById(pacienteId).orElseThrow(() -> new ResourceNotFoundException("Paciente não encontrado "+ pacienteId));
    }
}
