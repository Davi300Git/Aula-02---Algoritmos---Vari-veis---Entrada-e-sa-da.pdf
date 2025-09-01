import java.util.Scanner;

public class EnviarEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o e-mail do destinatário: ");
        String destinatario = scanner.nextLine();

        System.out.print("Digite o assunto do e-mail: ");
        String assunto = scanner.nextLine();

        System.out.print("Digite a mensagem do e-mail: ");
        String mensagem = scanner.nextLine();

        // Simulação do envio de e-mail
        System.out.println("\nEnviando e-mail...");
        System.out.println("Para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("E-mail enviado com sucesso!");

        scanner.close();
    }
}
