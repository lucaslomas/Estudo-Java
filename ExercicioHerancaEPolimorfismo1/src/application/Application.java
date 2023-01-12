package application;

import entities.Employee;
import entities.OutsoucedEmployee;

import java.util.Objects;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de funcionarios da empresa: ");
        int numeroDeFuncionarios = sc.nextInt();
        Employee[] funcionario = new Employee[numeroDeFuncionarios];

        for (int i = 0; i <= (funcionario.length - 1); i++){
            System.out.print("Agregado (s/n): ");
            char agregado = sc.next().charAt(0);
            System.out.println();
            System.out.print("Nome do funcionarios: ");
            String nome = sc.next();
            System.out.println();
            System.out.print("Horas trabalhadas: ");
            int horasTrabalhadas = sc.nextInt();
            System.out.println();
            System.out.print("Valor da hora: ");
            double valorHora = sc.nextDouble();
            System.out.println();
            if (Objects.equals(agregado, 's')){
                System.out.print("Bonus: ");
                double bonus = sc.nextDouble();
                funcionario[i] = new OutsoucedEmployee(nome, horasTrabalhadas, valorHora, bonus);
            }
            else {
                funcionario[i] = new Employee(nome, horasTrabalhadas, valorHora);
            }
        }
        for (Employee funcionarios: funcionario) {
            System.out.println(funcionarios.toString() + funcionarios.payment());
        }
    }
}