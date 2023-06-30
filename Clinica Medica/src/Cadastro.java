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

        System.out.println("Cadastro de Medico");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Data Nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("RG: ");
        String rg = scanner.nextLine();

        System.out.print("Endereco: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Sexo: ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Matricula: ");
        int matricula = scanner.nextInt();

        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        System.out.print("CRM: ");
        String crm = scanner.nextLine();

        Medico medico = new Medico(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo, matricula, especialidade, salario, crm);

        listaMedicos.add(medico);

        System.out.println("Medico cadastrado com sucesso!");
    }

    public void cadastrarSecretario() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Cadastro de Secretario");
    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Data Nascimento: ");
    String dataNascimento = scanner.nextLine();

    System.out.print("Idade: ");
    int idade = scanner.nextInt();

    System.out.print("CPF: ");
    String cpf = scanner.nextLine();

    System.out.print("RG: ");
    String rg = scanner.nextLine();

    System.out.print("Endereco: ");
    String endereco = scanner.nextLine();

    System.out.print("Telefone: ");
    String telefone = scanner.nextLine();

    System.out.print("Sexo: ");
    char sexo = scanner.next().charAt(0);

    System.out.print("Matricula: ");
    int matricula = scanner.nextInt();

    System.out.print("Salario: ");
    double salario = scanner.nextDouble();

    Secretario secretario = new Secretario(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo, matricula, salario);

    
    listaSecretarios.add(secretario);

    System.out.println("Secretario cadastrado com sucesso!");
}

public void cadastrarAdministrador() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Cadastro de Administrador");
    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Data Nascimento: ");
    String dataNascimento = scanner.nextLine();

    System.out.print("Idade: ");
    int idade = scanner.nextInt();

    System.out.print("CPF: ");
    String cpf = scanner.nextLine();

    System.out.print("RG: ");
    String rg = scanner.nextLine();

    System.out.print("Endereco: ");
    String endereco = scanner.nextLine();

    System.out.print("Telefone: ");
    String telefone = scanner.nextLine();

    System.out.print("Sexo: ");
    char sexo = scanner.next().charAt(0);

    System.out.print("Matricula: ");
    int matricula = scanner.nextInt();

    System.out.print("Funcao: ");
    String funcao = scanner.nextLine();

    Administrador administrador = new Administrador(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo, matricula, funcao);

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
