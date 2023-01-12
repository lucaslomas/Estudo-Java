package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Date;

public class Application {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o numero de produtos: ");
        int numeroProdutos = sc.nextInt();
        ArrayList<Product> produtos = new ArrayList<>();

        for (int i = 1; i <= numeroProdutos; i++){
            System.out.println("Cadastro do produto numero " + i);
            System.out.print("O produto é usado, comum ou importado? (c/u/i): ");
            char tipoProduto = sc.next().charAt(0);
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Preço: ");
            double price = sc.nextDouble();
            if (Objects.equals(tipoProduto, 'c')) {
                produtos.add(new Product(name, price));
            }
            else if (Objects.equals(tipoProduto, 'i')) {
                System.out.print("Qual a taxa de alfandega? ");
                double customsFee = sc.nextDouble();
                produtos.add(new ImportedProduct(name, price, customsFee));
            }
            else if (Objects.equals(tipoProduto, 'u')) {
                System.out.print("Qual o data de fabricação: (dd/MM/yyyy) ");
                Date dataFab = sdf.parse(sc.next());
                produtos.add(new UsedProduct(name, price, dataFab));
            }
        }
        for (Product produto: produtos) {
            System.out.println(produto.priceTag());
        }

    }
}