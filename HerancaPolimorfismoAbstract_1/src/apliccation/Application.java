package apliccation;

import entities.Imposto;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o numero de taxação: ");
        int numeroDeTaxas = sc.nextInt();
        ArrayList<Imposto> tiposImposto = new ArrayList<>();

        for (int i = 1; numeroDeTaxas >= i; i++){
            System.out.println("Entre com o " + i + "º" + " cadastro: ");
            System.out.print("Será um cadastro de Pessoa Juridica ou Fisica (J/F): ");
            char juridicaFisica = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Renda Anual: ");
            double rendaAnual = sc.nextDouble();
            if (Objects.equals(juridicaFisica, 'J')){
                System.out.print("Qual o numero de Funcionarios: ");
                int numeroFuncionario = sc.nextInt();
                tiposImposto.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionario));
            }else {
                System.out.print("Qual o gasto com saude: ");
                double gastoSaude = sc.nextInt();
                tiposImposto.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
            }
        }
        System.out.println("Relatorio de taxas: ");
        double soma = 0;
        for (Imposto tipo: tiposImposto) {
            System.out.printf(tipo.getNome() + ": $" + "%.2f", tipo.taxa());
            System.out.println();
            soma += tipo.taxa();
        }
        System.out.printf("Arrecadação Total: " + "%.2f", soma);
    }
}