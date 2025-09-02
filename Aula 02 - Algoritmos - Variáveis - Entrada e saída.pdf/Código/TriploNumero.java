import java.util.Scanner;

public class TriploNumero {
    //Crie um algoritmo que obtenha um número real, calcule e mostre o valor de seu triplo.
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = ob.nextDouble();

        double triplo = numero * 3;

        System.out.println("O triplo do número é: " + triplo);

        ob.close();
    }
}
