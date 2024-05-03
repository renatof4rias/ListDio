package Desafio16;
/*
16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
equilátero, isósceles ou escaleno.
 */
import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado A -> ");
        double ladoA = sc.nextDouble();

        System.out.print("Lado B -> ");
        double ladoB = sc.nextDouble();

        System.out.print("Lado C -> ");
        double ladoC = sc.nextDouble();

        if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC ){
            System.out.println("TRIANGULO EQUILÁTERO");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("TRIANGULO ISOSCELES");
        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            System.out.println("TRIANGULO ESCALENO");
        }

        sc.close();
    }
}