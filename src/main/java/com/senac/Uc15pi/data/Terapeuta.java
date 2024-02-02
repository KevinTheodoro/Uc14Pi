package com.senac.Uc15pi.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name="Terapeuta")
public class Terapeuta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String especialidade;
    private String cpf;
    private String email;
}
