package Desafio07;
/*
7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
*/
import java.util.Scanner;

public class Booleanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite True ou False -> ");
        boolean valorA = sc.nextBoolean();

        System.out.print("Digite True ou False -> ");
        boolean valorB = sc.nextBoolean();

        if (valorA == true && valorB == true){
            System.out.println("Valor de A e B Sao VERDADEIROS");
        } else if (valorA == false && valorB == false) {
            System.out.println("Valor de A e B Sao FALSO");
        }else if (valorA == true && valorB == false) {
            System.out.println("Valor de A é VERDADEIRO e Valor de B é FALSO");
        }else if (valorA == false && valorB == true) {
            System.out.println("Valor de A é FALSO e Valor de B é VERDADEIRO");
        }
        sc.close();
    }
}