import java.util.Scanner;

public class MinutosDesdeInicioDoDia {
    //Faça um algoritmo que leia dois valores inteiros representando, respectivamente,
    //um valor de hora e um de minutos e informe quantos minutos se passaram desde o
    //início do dia. Exemplo:
    //valores lidos: 13 e 15
    //impressão: 795 minutos
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora (0 a 23): ");
        int hora = scanner.nextInt();

        System.out.print("Digite os minutos (0 a 59): ");
        int minutos = scanner.nextInt();

        int minutosTotais = (hora * 60) + minutos;

        System.out.println("Minutos desde o início do dia: " + minutosTotais);

        scanner.close();
    }
}
