package ContaBanco;

import java.util.Scanner;

public class AgenciaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        // Solicita o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        // Solicita o nome do titular
        System.out.print("Por favor, digite o nome do Titular: ");
        String titular = scanner.nextLine();

        // Solicita o saldo inicial
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Exibe os dados inseridos pelo usuário
        System.out.println("\nDados da Conta:");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}