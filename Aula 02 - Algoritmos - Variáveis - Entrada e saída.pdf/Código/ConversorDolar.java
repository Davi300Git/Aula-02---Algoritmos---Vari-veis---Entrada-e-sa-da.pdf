import java.util.Scanner;

public class ConversorDolar {
    //Faça um algoritmo que leia a cotação do dólar (taxa de conversão), leia um valor
    //em dólares e converta e mostre o valor equivalente em Reais
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar (R$): ");
        double cotacao = scanner.nextDouble();

        System.out.print("Digite o valor em dólares: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = valorDolar * cotacao;

        System.out.printf("O valor equivalente em Reais é: R$ %.2f%n", valorReal);

        scanner.close();
    }
}
