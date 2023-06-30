import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private ArrayList<Medico> listaMedicos;
    private ArrayList<Secretario> listaSecretarios;
    private ArrayList<Administrador> listaAdministradores;

    public Cadastro() {
        listaMedicos = new ArrayList<>();
        listaSecretarios = new ArrayList<>();
        listaAdministradores = new ArrayList<>();
    }

    public void cadastrarMedico() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Médico");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("CPF: ");
        int cpf = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("RG: ");
        int rg = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Sexo: ");
        char sexo = scanner.next().charAt(0);
        scanner.nextLine(); 

        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("CRM: ");
        String crm = scanner.nextLine();

        Medico medico = new Medico(nome, idade, cpf, rg, endereco, telefone, sexo, matricula, especialidade, salario, crm);

        listaMedicos.add(medico);

        System.out.println("Médico cadastrado com sucesso!");
    }

    public void cadastrarSecretario() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Cadastro de Secretário");
    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("Idade: ");
    int idade = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("CPF: ");
    int cpf = scanner.nextInt();
    scanner.nextLine();

    System.out.print("RG: ");
    int rg = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Endereço: ");
    String endereco = scanner.nextLine();

    System.out.print("Telefone: ");
    int telefone = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Sexo: ");
    char sexo = scanner.next().charAt(0);
    scanner.nextLine(); 

    System.out.print("Matrícula: ");
    int matricula = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Salário: ");
    double salario = scanner.nextDouble();
    scanner.nextLine(); 

    Secretario secretario = new Secretario(nome, idade, cpf, rg, endereco, telefone, sexo, matricula, salario);

    
    listaSecretarios.add(secretario);

    System.out.println("Secretário cadastrado com sucesso!");
}

public void cadastrarAdministrador() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Cadastro de Administrador");
    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("Idade: ");
    int idade = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("CPF: ");
    int cpf = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("RG: ");
    int rg = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Endereço: ");
    String endereco = scanner.nextLine();

    System.out.print("Telefone: ");
    int telefone = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Sexo: ");
    char sexo = scanner.next().charAt(0);
    scanner.nextLine(); 

    System.out.print("Matrícula: ");
    int matricula = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Função: ");
    String funcao = scanner.nextLine();

    Administrador administrador = new Administrador(nome, idade, cpf, rg, endereco, telefone, sexo, matricula, funcao);

    listaAdministradores.add(administrador);

    System.out.println("Administrador cadastrado com sucesso!");
}

    
    public ArrayList<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public ArrayList<Secretario> getListaSecretarios() {
        return listaSecretarios;
    }

    public ArrayList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }
}
