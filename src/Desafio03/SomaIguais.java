package Desafio03;
/*
3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.
*/
import java.util.Scanner;
public class SomaIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o Valor de A -> ");
        int valorA = sc.nextInt();

        System.out.print("Insira o Valor de B -> ");
        int valorB = sc.nextInt();

        if (valorA == valorB){
            int valorC =  valorA + valorB;
            System.out.println("Valores Iguais São Somados total = " + valorC);
        } else {
            int valorC =  valorA * valorB;
            System.out.println("Valores Diferentes São Multiplicados total = " + valorC);
        }
        sc.close();
    }
}