import java.util.Scanner;

public class OperacoesAritmeticas {
    
    //Faça um algoritmo que leia dois números inteiros e calcule e mostre o resultado
    //das seguintes operações aritméticas: soma, subtração e multiplicação.

    public static void main(String[] args) {
        Scanner operacoes = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = operacoes.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = operacoes.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        operacoes.close();
    }
}
