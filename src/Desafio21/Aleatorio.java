package Desafio21;
/*
21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
*/
import java.util.Scanner;
import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int max = 100;
        int min = 1;

        int valorSorteado = random.nextInt((max - min) + 1) + min;

        System.out.println("Valor Sorteado " + valorSorteado);

        sc.close();
    }
}