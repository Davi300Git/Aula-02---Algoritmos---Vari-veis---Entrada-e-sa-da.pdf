import java.util.Scanner;
//1- Faça um algoritmo que solicite ao usuário o nome de um funcionário, a quantidade
//de dependentes e o cargo ocupado pelo funcionário. Mostre os dados (nome,
//quantidade de dependentes e cargo) digitados
public class DadosFuncionario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita o nome do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = input.nextLine();

        System.out.print("Digite a quantidade de dependentes: ");
        int dependentes = input.nextInt();
        input.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = input.nextLine();

        System.out.println("\n--- Dados do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de dependentes: " + dependentes);
        System.out.println("Cargo: " + cargo);

        input.close();
    }
}
