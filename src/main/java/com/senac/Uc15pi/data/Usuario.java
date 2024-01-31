package com.senac.Uc15pi.data;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Kevin
 */
@Getter
@Setter
public class Usuario {    
    private String login;
    private String senha;
    private Terapeuta terapeuta;
}
