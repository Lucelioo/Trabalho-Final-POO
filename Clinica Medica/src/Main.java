import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        //cadastro = carregarListas();
        Calendario calendario = new Calendario();

        Login login;
        Scanner scanner = new Scanner(System.in);

        String escolha;
        do {
            //clearConsole();
            exibirMenu();
            escolha = scanner.nextLine();

            if (escolha.matches("^[1-9]$")) {
                int opcao = Integer.parseInt(escolha);
                switch (opcao) {
                    case 1:
                        clearConsole();
                        login = fazerLogin(scanner);
                        String retorno4 = login.fazerLoginMedico(cadastro.getListaMedicos());
                        while (retorno4.equals("Nome invalido!") || retorno4.equals("Matricula invalida!")) {
                            clearConsole();
                            System.out.println(retorno4);
                            System.out.println("\n1. Deseja tentar fazer login novamente?");
                            System.out.println("0. Sair");
                            System.out.print("\nDigite a opcao desejada: ");
                            String opcao4 = scanner.nextLine();

                            if(!opcao4.equals("0")){
                                clearConsole();
                                login = fazerLogin(scanner);
                                retorno4 = login.fazerLoginMedico(cadastro.getListaMedicos());
                            }
                            break;
                        }
                        System.out.println("Login realizado com sucesso\n");
                        menuMedico();
                        break;
                    case 2:
                        clearConsole();
                        login = fazerLogin(scanner);
                        String retorno5 = login.fazerLoginSecretario(cadastro.getListaSecretarios());
                        while (retorno5.equals("Nome invalido!") || retorno5.equals("Matricula invalida!")) {
                            clearConsole();
                            System.out.println(retorno5);
                            System.out.println("\n1. Deseja tentar fazer login novamente?");
                            System.out.println("0. Sair");
                            System.out.print("\nDigite a opcao desejada: ");
                            String opcao5 = scanner.nextLine();

                            if(!opcao5.equals("0")){
                                clearConsole();
                                login = fazerLogin(scanner);
                                retorno5 = login.fazerLoginSecretario(cadastro.getListaSecretarios());
                            }
                        }
                        System.out.println("Login realizado com sucesso\n");
                        menuSecretario();
                        break;
                    case 3:
                        clearConsole();
                        login = fazerLogin(scanner);
                        String retorno6 = login.fazerLoginAdministrador(cadastro.getListaAdministradores());
                        while (retorno6.equals("Nome invalido!") || retorno6.equals("Matricula invalida!")) {
                            clearConsole();
                            System.out.println(retorno6);
                            System.out.println("\n1. Deseja tentar fazer login novamente?");
                            System.out.println("0. Sair");
                            System.out.print("\nDigite a opcao desejada: ");
                            String opcao5 = scanner.nextLine();

                            if(!opcao5.equals("0")){
                                clearConsole();
                                login = fazerLogin(scanner);
                                retorno6 = login.fazerLoginAdministrador(cadastro.getListaAdministradores());
                            }
                           
                        }
                        menuAdministrador();
                        System.out.println("Login realizado com sucesso\n");
                        break;
                    case 9:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            }
        } while (!escolha.equals("9"));

        salvarListas(cadastro);
    }

    // Pesquisar um paciente pelo nome
    public static Paciente buscarPaciente(List<Paciente> pacientes, String nome) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                return paciente;
            }
        }
        return null;
    }


    public static Calendario agendarHorario() {
        Calendario calendario = new Calendario();
        List<Paciente> pacientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        

        Medico medico = new Medico("Dr. Joao", "01/01/1980", 40, "12345678901",
                "1234567", "Rua A, 123", "85998123532", 'M', 123456, "Cardiologia", 5000.0, "CRM12345");
        
        Paciente paciente = new Paciente("Dr. Joao", "01/01/1980", 40, "12345678901", "1234567", "Rua A, 123", "85998123532", 'M', "Unimed");
        
        pacientes.add(paciente);

        Object escolha;
        do {                       
            
            System.out.println("\n===== Sistema de Agendamento =====");
            System.out.println("Qual o dia: ");
            String data = scanner.nextLine();
            System.out.println("Qual o horario: ");
            String horario = scanner.nextLine();
            System.out.println("Qual o valor: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            try {
                calendario.registrarHorario(medico, data, horario, valor, paciente);
            } catch (Calendario.HorarioOcupadoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            
            System.out.println("\n===== Menu Agendamento =====");
            System.out.println("\nAgendamento realizado com sucesso!");
            System.out.println("\nDeseja realizar outro agendamento?");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("0. Sair");
            System.out.print("\nDigite a opcao desejada: ");
            escolha = scanner.nextLine();

        } while (!escolha.equals("0"));

        return calendario;

        //
    }

    private static void imprimirAgendamentosDia(){
        Calendario calendario = new Calendario();
        List<Paciente> pacientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Menu Medico =====");
        System.out.println("1. Cadastrar Paciente");
        String data = scanner.nextLine();

        calendario.imprimirAgendamentosDoDia(data);
    }


    private static void exibirMenu() {
        System.out.println("===== Sistema de Cadastro e Login =====");
        System.out.println("1. Fazer login como Medico");
        System.out.println("2. Fazer login como Secretario");
        System.out.println("3. Fazer login como Administrador");
        System.out.println("9. Sair");
        System.out.print("\nDigite a opcao desejada: ");
    }

    private static void menuSecretario(){
        Calendario calendario = new Calendario();
        Scanner scanner = new Scanner(System.in);
        String escolha;

        do{
            System.out.println("===== Menu Secretario =====");
            System.out.println("\n1. Agendar Horario");
            System.out.println("2. Imprimir Agenda do Dia");
            System.out.println("9. Sair");
            System.out.print("\nDigite a opcao desejada: ");
            escolha = scanner.nextLine();

            if (escolha.matches("^[1-9]$")) {
                int opcao = Integer.parseInt(escolha);
                switch (opcao) {
                    case 1:
                        clearConsole();
                        calendario = agendarHorario();
                        break;
                    case 2:
                        clearConsole();
                        imprimirAgendamentosDia();
                        break;
                    case 9:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            }
        } while (!escolha.equals("9"));
        
    }

    private static void menuMedico(){
        Calendario calendario = new Calendario();
        List<Paciente> pacientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String escolha;

        
        //
        //

        do{
            System.out.println("===== Menu Medico =====");
            System.out.println("\n1. Agenda do Dia");
            System.out.println("2. Prontuario do Paciente");
            System.out.println("3. Imprimir Protuario");
            System.out.println("4. Solicitar Exames");
            System.out.println("5. imprimir Exames");
            System.out.println("6. Solicitar Receita");
            System.out.println("7. Imprimir Receita");
            System.out.println("9. Sair");
            System.out.print("\nDigite a opcao desejada: ");
            escolha = scanner.nextLine();

            if (escolha.matches("^[1-9]$")) {
                int opcao = Integer.parseInt(escolha);
                switch (opcao) {
                    case 1:
                        clearConsole();
                        imprimirAgendamentosDia();
                        break;
                    case 2:
                        clearConsole();
                        System.out.println("===== Menu Medico =====");
                        System.out.println("\n1. Qual o nome do paciente: ");
                        String nome = scanner.nextLine(); 

                        //nome = buscarPaciente(pacientes, nome );
                        
                        Prontuario prontuario = new Prontuario(nome);
                        //prontuario.adicionarReceita("Dipirona 500mg - Tomar 1 comprimido a cada 6 horas");
                        //prontuario.adicionarReceita("Amoxicilina 500mg - Tomar 1 comprimido a cada 8 horas");
                        //prontuario.adicionarExame("Hemograma completo");
                        //prontuario.adicionarExame("Raio-X do tórax");
                        break;
                    case 3:
                        clearConsole();
                        System.out.println("Em Desenvolvimento..");
                        break;
                    case 4:
                        clearConsole();
                        System.out.println("Em Desenvolvimento..");
                        break;
                    case 5:
                        clearConsole();
                        System.out.println("Em Desenvolvimento..");
                        break;
                    case 9:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            }
        } while (!escolha.equals("9"));
        
    }

    private static void menuAdministrador(){
        Calendario calendario = new Calendario();
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        String escolha;

        do{
            System.out.println("===== Menu Secretario =====");
            System.out.println("\n1. Cadastrar Medico");
            System.out.println("2. Cadastrar Secretario");
            System.out.println("3. Cadastrar Administrador");
            System.out.println("4. Cadastrar Paciente");
            System.out.println("9. Sair");
            System.out.print("\nDigite a opcao desejada: ");
            escolha = scanner.nextLine();

            if (escolha.matches("^[1-9]$")) {
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
                        cadastro.cadastrarPaciente();
                        break;
                    case 9:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            }
        } while (!escolha.equals("9"));
        
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
    
    
    private static void salvarListas(Cadastro cadastro) {
        try {
            FileOutputStream fileOut = new FileOutputStream("cadastro.bin");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(cadastro);
            objectOut.close();
            System.out.println("Dados salvo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Cadastro carregarListas() {
        try {
            FileInputStream fileIn = new FileInputStream("cadastro.bin");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Cadastro cadastro = (Cadastro) objectIn.readObject();
            objectIn.close();
            return cadastro;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
