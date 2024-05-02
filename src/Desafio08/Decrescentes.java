package Desafio08;
/*
8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
*/
import java.util.Scanner;

public class Decrescentes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o Valor de A-> ");
        int valorA = sc.nextInt();

        System.out.print("Informe o Valor de B-> ");
        int valorB = sc.nextInt();

        System.out.print("Informe o Valor de C-> ");
        int valorC = sc.nextInt();

        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;

        if(valorA > valorB && valorA > valorC){
         if (valorB > valorC){
             System.out.println("Ordem Decrescente "+ valorA +", "+valorB + ", "+ valorC);
         }else{
             System.out.println("Ordem Decrescente "+ valorA +", "+valorC + ", "+ valorB);
         }
        }else if (valorB > valorA && valorB > valorC){
            if (valorA > valorC){
                System.out.println("Ordem Decrescente "+ valorB +", "+valorA + ", "+ valorC);
            }else {
                System.out.println("Ordem Decrescente "+ valorB +", "+valorC + ", "+ valorA);
            }
        }else {
            if (valorA > valorB){
                System.out.println("Ordem Decrescente "+ valorC +", "+valorA + ", "+ valorB);
            }else{
                System.out.println("Ordem Decrescente "+ valorC +", "+valorB + ", "+ valorA);
            }
        }
        sc.close();
    }
}
