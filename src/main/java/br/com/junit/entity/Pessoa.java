package br.com.junit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private LocalDate nascimento;

    public boolean maiorDeIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(nascimento, dataAtual);

        return periodo.getYears() >= 18;
    }

}
