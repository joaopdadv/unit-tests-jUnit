package br.com.junit;

import br.com.junit.entity.Pessoa;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.time.LocalDate;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class PessoaTeste {

    @BeforeAll
    static void rodaAntesDeTudo(){
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void rodaDepoisDeTudo(){
        System.out.println("AfterAll");
    }

    @BeforeEach
    void rodaAntesDeCadaTeste(){
        System.out.println("BeforeEach");
    }

    @AfterEach
    void rodaDepoisDeCadaTeste(){
        System.out.println("AfterEach");
    }

    @DisplayName("B")
    @Test
    void validaCalculoDeMaiorDeIdadePessoa(){
        Pessoa pessoa = new Pessoa("João", LocalDate.of(2010, 04, 23));
        Assertions.assertFalse(pessoa.maiorDeIdade());
    }

    @DisplayName("A")
    @Test
    @EnabledOnOs(OS.MAC)
    void teste2(){
        Assumptions.assumeTrue("joaopedro".equals(System.getenv("USER")));
        Assertions.assertFalse(false);
        //Assertions.assertThrows(); Trata exceptions no codigo - pqara true precisa dar a exceção
    }
}
