package Desafio20;
/*
20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
 */
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um Valor -> ");
        int valor = sc.nextInt();

        for (int i = 1; i <=10; i++) {
            int resultado = i*valor;
            System.out.println(i + " * " + valor + " = " + resultado);
        }

        sc.close();
    }
}