package Desafio24;
/*
Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
Fórmula: distância = tempo x velocidade.
litros usados = distância / 12.
 */
import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tempo de Viagem -> ");
        double tempo = sc.nextDouble();
        System.out.print("Velocidade Media -> ");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;
        double litros = distancia/12;

        System.out.println("Distancia = " + distancia);
        System.out.println("Litros = " + litros);

        sc.close();
    }
}