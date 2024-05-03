package Desafio18;
/*
18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
 */

public class Altura {
    public static void main(String[] args) {
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int contadorAnos= 0;

        while (!(alturaFrancisco < alturaSara)){
            System.out.println("a");
            contadorAnos++;
            alturaSara += 0.03;
            alturaFrancisco += 0.02;
        }
        System.out.printf("Levará %d Anos para Sara ter a mesma Altura que Francisco", contadorAnos);
    }
}