package Desafio12;
/*
 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
 Tabela de Código de Condições de Pagamento

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 2 - À Vista no cartão de crédito, recebe 10% de desconto
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o Valor do Produto -> ");
        double valor = sc.nextDouble();

        System.out.println("Qual a forma de Pagamento -> ");
        System.out.println("1- Dinheiro - 15% OFF");
        System.out.println("2- 1x Credito - 10% OFF");
        System.out.println("3- 2x Credito - 0% OFF");
        System.out.println("4- 3x Credito - 10% Juros");
        int opcaoPagamento = sc.nextInt();

        double valorTotal = 0.0;
        String formaPagamento = "";

        if (opcaoPagamento == 1){
            valorTotal = valor - (valor * 0.15);
            formaPagamento = "Dinheiro";
        }else if (opcaoPagamento == 2) {
            valorTotal = valor - (valor * 0.10);
            formaPagamento = "1x Credito S/Juros";
        }else if (opcaoPagamento == 3){
            valorTotal = valor;
            formaPagamento = "2x Credito S/Juros";
        }else if (opcaoPagamento == 4){
            valorTotal = valor + (valor * 0.10);
            formaPagamento = "3x Credito C/Juros";
        }

        System.out.printf("SubTotal: R$ %.2f\n", valor);
        System.out.println("Forma de Pagamento: "+ formaPagamento);
        System.out.printf("Total: R$ %.2f", valorTotal );
        sc.close();
    }
}