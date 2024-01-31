package com.senac.Uc15pi.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Kevin
 */
@Getter
@Setter
@Data
@Entity
@Table(name="Paciente")
public class Paciente {
    private Integer id;
    private String nome;
    private Date dataNasc;
    private char sexo;
    private String cpf;
    private Terapeuta terapeuta;
}
