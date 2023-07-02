import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        Login login;

        Scanner scanner = new Scanner(System.in);

        String escolha;
        do {
            //clearConsole();
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
        System.out.println("\n1. Cadastrar Medico");
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
}
