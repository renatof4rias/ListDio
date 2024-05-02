package Desafio14;
/*
14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
 */
import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int valorA = sc.nextInt();

        System.out.print("Valor de B: ");
        int valorB = sc.nextInt();

        int valorC = valorA;
        valorA = valorB;
        valorB = valorC;

        System.out.println("Valores Trocados "+ valorA + " " + valorB);

        sc.close();
    }
}