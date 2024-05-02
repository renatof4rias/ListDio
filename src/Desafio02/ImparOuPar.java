package Desafio02;

import java.util.Scanner;

/*
2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
*/
public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um Valor -> ");
        double valor = sc.nextDouble();

        if (valor % 2 == 0){
            System.out.print("O Valor Informado é PAR");
        }else {
            System.out.print("O Valor Informado é IMPAR");
        }
    }
}
