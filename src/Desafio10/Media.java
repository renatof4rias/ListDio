package Desafio10;
/*
10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
*/
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a Primeira Nota-> ");
        double primeiraNota = sc.nextDouble();

        System.out.print("Informe a Segunda Nota-> ");
        double segundaNota = sc.nextDouble();

        System.out.print("Informe a Terceira Nota-> ");
        double terceiraNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.printf("A Media do Aluno é : %.2f ", media);
        sc.close();
    }
}