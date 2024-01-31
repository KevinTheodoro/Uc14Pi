package com.senac.Uc15pi.data;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Kevin
 */
@Getter
@Setter
public class Paciente {
    private String nome;
    private Date dataNasc;
    private char sexo;
    private String cpf;
    private Terapeuta terapeuta;
}
