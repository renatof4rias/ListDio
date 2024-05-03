package Desafio19;
/*
19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
*/
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

    for (int i=1; i<=10;i++){
       for (int j=1; j<=10;j++){
           int resultado = i*j;
           System.out.println(i + " * " + j + " = " + resultado);
       }
        System.out.println();
    }






    }
}