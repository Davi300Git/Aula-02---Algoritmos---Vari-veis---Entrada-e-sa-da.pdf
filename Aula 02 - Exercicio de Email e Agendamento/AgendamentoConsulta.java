import java.util.Scanner;

public class AgendamentoConsulta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        System.out.print("Digite a data da consulta (ex: 10/09/2025): ");
        String dataConsulta = scanner.nextLine();

        System.out.print("Digite o horário da consulta (ex: 14:30): ");
        String horarioConsulta = scanner.nextLine();

        System.out.print("Digite o nome do médico: ");
        String nomeMedico = scanner.nextLine();

        // Simulação do agendamento
        System.out.println("\nAgendamento realizado com sucesso!");
        System.out.println("Paciente: " + nomePaciente);
        System.out.println("Data: " + dataConsulta);
        System.out.println("Horário: " + horarioConsulta);
        System.out.println("Médico: " + nomeMedico);

        scanner.close();
    }
}
