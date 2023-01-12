package ControleEstoque;

import Produto.produtosEstoques;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Qual o nome do produto a ser cadastrado no estoque? ");
        
        String nomeProduto = sc.next();

        System.out.print("Quantidade: ");

        int quantidadeProduto = sc.nextInt();

        System.out.print("Preço unitario: ");

        double precoProduto = sc.nextDouble();

        produtosEstoques produto = new produtosEstoques(nomeProduto, quantidadeProduto, precoProduto);

        System.out.printf("Dados do produto: %s\n", produto);

        System.out.println("Quantidade de produtos a serem adicionados: ");

        int quantidadeAdicionada = sc.nextInt();

        produto.addProduct(quantidadeAdicionada);

        System.out.printf("Dados do produto: %s\n", produto);

        System.out.println("Quantidade de produtos a serem removidos: ");

        int quantidadeRemovida = sc.nextInt();

        produto.removeProduct(quantidadeRemovida);

        System.out.printf("Dados do produto: %s\n", produto);

    }
}