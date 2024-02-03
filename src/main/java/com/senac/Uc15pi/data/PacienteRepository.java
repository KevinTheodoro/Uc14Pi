package com.senac.Uc15pi.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kevin
 */
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
    public Paciente findByNome(String nome);
    public List<Paciente> findByTerapeuta(Terapeuta terapeuta);
}
