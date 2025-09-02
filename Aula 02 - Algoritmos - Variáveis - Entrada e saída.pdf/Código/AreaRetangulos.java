import java.util.Scanner;

public class AreaRetangulos {
    //Elaborar um algoritmo que solicite os dados de 2
    //retângulos para calcular e visualizar três áreas: AT (área total
    //das duas figuras), A1 e A2 (áreas dos retângulos superior e
    //inferior). Os únicos dados conhecidos são os valores a, b, d
    
     public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        // Solicita os dados
        System.out.print("Digite o valor de a (base do retângulo superior): ");
        double a = dados.nextDouble();

        System.out.print("Digite o valor de b (base do retângulo inferior): ");
        double b = dados.nextDouble();

        System.out.print("Digite o valor de d (altura dos retângulos): ");
        double d = dados.nextDouble();

        // Calcula as áreas
        double A1 = a * d;
        double A2 = b * d;
        double AT = A1 + A2;

        // Mostra os resultados
        System.out.println("\n--- Áreas Calculadas ---");
        System.out.println("Área do retângulo superior (A1): " + A1);
        System.out.println("Área do retângulo inferior (A2): " + A2);
        System.out.println("Área total (AT): " + AT);

        dados.close();
    }
    
}