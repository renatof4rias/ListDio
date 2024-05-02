package Desafio11;
/*
 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
 se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
 */
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a Primeira Nota -> ");
        double primeiraNota = sc.nextDouble();

        System.out.print("Insira a Segunda Nota -> ");
        double segundaNota = sc.nextDouble();

        System.out.print("Insira a Terceira Nota -> ");
        double terceiraNota = sc.nextDouble();

        System.out.print("Insira a Quarta Nota -> ");
        double quartaNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if (media >= 7.0){
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }
        sc.close();
    }
}