package Desafio23;
/*
23- Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
*/
import java.util.Scanner;

public class CalculoINSS {    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Valor por Hora -> ");
    double a = sc.nextDouble();

    System.out.print("Horas Lecionadas por Mes -> ");
    double b = sc.nextDouble();

    double horas = (a * b);
    double salarioLiquido = horas - (horas *0.15);

    System.out.printf("Salario Liquido com Desconto de (15%% - INSS) = R$ %.2f",salarioLiquido );

    sc.close();
    }
}