import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        //Administrador administrador = new Administrador("Otaviano", "31/07/1990", 31, "03969237394", "2002030061587", "Rua A", "88992784105", 'M', 411631, "Engenheiro");
        

        Login login;

        Scanner scanner = new Scanner(System.in);

        String escolha;
        do {
            clearConsole();
            exibirMenu();
            escolha = scanner.nextLine();

            if (escolha.matches("^[1-7]$")) {
                int opcao = Integer.parseInt(escolha);
                switch (opcao) {
                    case 1:
                        clearConsole();
                        cadastro.cadastrarMedico();
                        break;
                    case 2:
                        clearConsole();
                        cadastro.cadastrarSecretario();
                        break;
                    case 3:
                        clearConsole();
                        cadastro.cadastrarAdministrador();
                        break;
                    case 4:
                        clearConsole();
                        login = fazerLogin(scanner);
                        login.fazerLoginMedico(cadastro.getListaMedicos());
                        break;
                    case 5:
                        clearConsole();
                        login = fazerLogin(scanner);
                        login.fazerLoginSecretario(cadastro.getListaSecretarios());
                        break;
                    case 6:
                        clearConsole();
                        login = fazerLogin(scanner);
                        login.fazerLoginAdministrador(cadastro.getListaAdministradores());
                        break;
                    case 7:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            }
        } while (!escolha.equals("7"));
    }

    private static void exibirMenu() {
        System.out.println("===== Sistema de Cadastro e Login =====");
        System.out.println("1. Cadastrar Medico");
        System.out.println("2. Cadastrar Secretario");
        System.out.println("3. Cadastrar Administrador");
        System.out.println("4. Fazer login como Medico");
        System.out.println("5. Fazer login como Secretario");
        System.out.println("6. Fazer login como Administrador");
        System.out.println("7. Sair");
        System.out.print("\nDigite a opcao desejada: ");
    }

    private static Login fazerLogin(Scanner scanner) {
        System.out.println("===== Login =====");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matricula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); 

        return new Login(nome, matricula);
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

   //base para calendario
    Calendario calendario = new Calendario();

        Medico medico = new Medico("Dr. João", "01/01/1980", 40, "12345678901",
                "1234567", "Rua A, 123", "123456789", 'M', 12345, "Cardiologia", 5000.0, "CRM12345");

        Paciente paciente = new Paciente("Maria", "02/02/1990", 30, "98765432109",
                "7654321", "Rua B, 456", "987654321", 'F', "ConvenioX");

        try {
            calendario.registrarHorario(medico, "01/07/2023", "09:00", paciente);
            calendario.registrarHorario(medico, "01/07/2023", "14:30", paciente);
            calendario.registrarHorario(medico, "01/07/2023", "11:30", paciente);
        } catch (Calendario.HorarioOcupadoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        calendario.imprimirAgendamentosDoDia("01/07/2023");
}
