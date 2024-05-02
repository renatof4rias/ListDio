package Desafio01;
/*
1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
*/
import java.util.Scanner;

public class SomaAeB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o Valor de A -> ");
        double valorA = sc.nextDouble();

        System.out.print("Insira o Valor de B -> ");
        double valorB = sc.nextDouble();

        System.out.print("Insira o Valor de C -> ");
        double valorC = sc.nextDouble();

        double somaAeB = valorA + valorB;

        if(somaAeB < valorC){
            System.out.println("A Soma de A e B é Menor que o Valor de C");
        }else if(somaAeB > valorC) {
            System.out.println("A Soma de A e B é Maior que o Valor de C");
        } else {
            System.out.println("A Soma de A e B é igual ao Valor de C");
        }

        sc.close();
    }
}