package Desafio06;
/*
6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
*/
import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um Valor -> ");
        double valor = sc.nextDouble();
        double resultado = valor + (valor * 0.05);


        System.out.println("Valor Informado com Reajuste de 5% = " + resultado);
        sc.close();
    }
}