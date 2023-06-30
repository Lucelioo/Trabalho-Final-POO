import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Login login;

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastro.cadastrarMedico();
                    break;
                case 2:
                    cadastro.cadastrarSecretario();
                    break;
                case 3:
                    cadastro.cadastrarAdministrador();
                    break;
                case 4:
                    login = fazerLogin(scanner);
                    login.fazerLoginMedico(cadastro.getListaMedicos());
                    break;
                case 5:
                    login = fazerLogin(scanner);
                    login.fazerLoginSecretario(cadastro.getListaSecretarios());
                    break;
                case 6:
                    login = fazerLogin(scanner);
                    login.fazerLoginAdministrador(cadastro.getListaAdministradores());
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 7);
    }

    private static void exibirMenu() {
        System.out.println("===== Sistema de Cadastro e Login =====");
        System.out.println("1. Cadastrar Médico");
        System.out.println("2. Cadastrar Secretário");
        System.out.println("3. Cadastrar Administrador");
        System.out.println("4. Fazer login como Médico");
        System.out.println("5. Fazer login como Secretário");
        System.out.println("6. Fazer login como Administrador");
        System.out.println("7. Sair");
        System.out.print("Digite a opção desejada: ");
    }

    private static Login fazerLogin(Scanner scanner) {
        System.out.println("===== Login =====");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); 

        return new Login(nome, matricula);
    }
}
