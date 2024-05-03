package Desafio22;
/*
22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
*/
import java.util.Scanner;

public class Quociente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A -> ");
        int a = sc.nextInt();

        System.out.print("B -> ");
        int b = sc.nextInt();
        int resto = a % b ;
        int quociente = a/b;
        System.out.println("Quociente da Divisão = "+ quociente+ " Resto da Divisao " + resto );

        sc.close();
    }
}
