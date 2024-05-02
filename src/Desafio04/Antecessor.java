package Desafio04;
/*
4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
*/
import java.util.Scanner;
public class Antecessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um Valor -> ");
        int valor = sc.nextInt();

        System.out.println("Antecessor = " + (valor - 1));
        System.out.println("Sucessor = " + (valor + 1));
        sc.close();
    }
}
