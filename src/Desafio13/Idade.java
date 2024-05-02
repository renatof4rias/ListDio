package Desafio13;
/*
13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
*/

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.printf("%s é maior de idade", nome);
        } else {
            System.out.printf("%s é menor de idade", nome);
        }

    sc.close();
    }
}
