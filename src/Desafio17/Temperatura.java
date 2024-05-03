package Desafio17;
/*
17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
Fórmula: C = (5 * ( F-32) / 9)
*/
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Fahrenheit -> ");
        double fahrenheit = sc.nextDouble();

        double celsius = (5*(fahrenheit-32)/9);

        System.out.printf("Temperatura em Fahrenheit -> %.2f\n", fahrenheit);
        System.out.printf("Temperatura em Celsius -> %.2f", celsius);

        sc.close();
    }
}