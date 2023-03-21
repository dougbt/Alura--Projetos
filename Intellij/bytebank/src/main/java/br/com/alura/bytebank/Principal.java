package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao ByteBank");
        Funcionario douglas = new Funcionario("Douglas", 1, LocalDate.of(1997, 02,9));
        Funcionario oliver = new Funcionario("Oliver", 2, LocalDate.of(2000, 02,24));
        System.out.println(oliver);
        System.out.println(douglas);

    }
}
