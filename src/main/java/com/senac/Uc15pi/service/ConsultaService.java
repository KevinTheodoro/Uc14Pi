package com.senac.Uc15pi.service;

import com.senac.Uc15pi.data.Consulta;
import com.senac.Uc15pi.data.ConsultaRepository;
import com.senac.Uc15pi.data.Terapeuta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin
 */
@Service
public class ConsultaService {
    @Autowired
    ConsultaRepository consultaRepository;

    public Consulta criarConsulta(Consulta consulta) {
        consulta.setId(null);

        consulta = consultaRepository.save(consulta);

        return consulta;
    }

    public List<Consulta> listarConsultas(Terapeuta terapeuta) {
        return consultaRepository.findByTerapeuta(terapeuta);
    }
}
