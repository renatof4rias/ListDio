package Desafio05;
/*
5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
*/


import java.util.Locale;
import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        final double salarioBase = 1293.20;

        System.out.print("Qual o Valor do Seu Salario -> ");
        double salario = sc.nextDouble();

        double qntdSalarios = salario / salarioBase;

        if (salario >= salarioBase){
            System.out.printf("Quantidades de Salarios = %.1f", qntdSalarios);
        } else if (salario < salarioBase) {
            System.out.printf("Quantidades de Salarios = 0");
        }
        sc.close();
    }
}