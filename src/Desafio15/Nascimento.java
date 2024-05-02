package Desafio15;

/*
15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida)
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Nascimento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ano de Nascimento -> ");
        int ano = sc.nextInt();

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(ano, 1, 1);

        Period periodo = Period.between(dataNascimento, dataAtual);

        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        System.out.printf("A pessoa viveu %d anos, %d meses e %d dias.\n", anos, meses, dias);
        sc.close();
    }
}