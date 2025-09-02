import java.util.Scanner;

public class somaNumeros {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = calculo.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = calculo.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos dois números é: " + soma);

        calculo.close();
    }
}
