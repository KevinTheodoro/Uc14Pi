package com.senac.Uc15pi.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kevin
 */
@Repository
public interface FichaRepository extends JpaRepository<Ficha, Integer> {
    List<Ficha> findByPaciente(Paciente paciente);
}
