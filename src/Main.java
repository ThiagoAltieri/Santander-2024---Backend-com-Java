import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Numero;
        String Agencia;
        String NomeCliente;
        Double Saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua Conta (apenas números)!");
        Numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agência (apenas números)!");
        Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome (apenas letras)!");
        NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu Saldo (separe as casas decimais com ponto)!");
        Saldo = scanner.nextDouble();

        System.out.println("Número da Conta: " + Numero);
        System.out.println("Agência: " + Agencia);
        System.out.println("Nome do Cliente: " + NomeCliente);
        System.out.println("Saldo: " + Saldo);
    }
}
