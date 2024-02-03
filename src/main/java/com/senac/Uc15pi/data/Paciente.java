package com.senac.Uc15pi.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Data;


/**
 *
 * @author Kevin
 */
@Data
@Entity
@Table(name="Paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private LocalDate dataNasc;
    private char sexo;
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "terapeuta_id", referencedColumnName = "id")
    private Terapeuta terapeuta;
}
