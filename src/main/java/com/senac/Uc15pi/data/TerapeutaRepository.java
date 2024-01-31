package com.senac.Uc15pi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kevin
 */
@Repository
public interface TerapeutaRepository extends JpaRepository<Terapeuta, Integer> {
    
}
