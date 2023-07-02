import java.io.*;
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
        String escolha;

        do {
            System.out.println("\n===== Sistema de Cadastro de Medico =====");
            System.out.println("\nDados do Medico");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

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
            scanner.nextLine();

            System.out.print("Matricula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Especialidade: ");
            String especialidade = scanner.nextLine();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("CRM: ");
            String crm = scanner.nextLine();

            Medico medico = new Medico(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo, matricula, especialidade, salario, crm);

            listaMedicos.add(medico);
            
            System.out.println("\n===== Sistema de Cadastro e Login =====");
            System.out.println("\nMedico cadastrado com sucesso!");
            System.out.println("\nDeseja realizar outro cadastro?");
            System.out.println("\n1. Cadastrar Medico");
            System.out.println("0. Cadastrar Secretario");
            System.out.print("\nDigite a opcao desejada: ");

            escolha = scanner.nextLine();

        } while (!escolha.equals("0"));

    }

    public void cadastrarSecretario() {
        Scanner scanner = new Scanner(System.in);
        String escolha;

        do {
            System.out.println("\n===== Sistema de Cadastro de Secretario =====");
            System.out.println("\nDados do Secretario");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

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
            scanner.nextLine(); 

            System.out.print("Matricula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); 

            Secretario secretario = new Secretario(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo, matricula, salario);

            listaSecretarios.add(secretario);

            System.out.println("\n===== Sistema de Cadastro e Login =====");
            System.out.println("\nSecretario cadastrado com sucesso!");
            System.out.println("\nDeseja realizar outro cadastro?");
            System.out.println("\n1. Cadastrar Medico");
            System.out.println("0. Cadastrar Secretario");
            System.out.print("\nDigite a opcao desejada: ");

            escolha = scanner.nextLine();

        } while (!escolha.equals("0"));

    }


    public void cadastrarAdministrador() {
        Scanner scanner = new Scanner(System.in);
        String escolha;

        do {
            System.out.println("\n===== Sistema de Cadastro de Administrador =====");
            System.out.println("\nDados do Administrador");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

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
            scanner.nextLine();

            System.out.print("Matricula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Funcao: ");
            String funcao = scanner.nextLine();

            Administrador administrador = new Administrador(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo, matricula, funcao);

            listaAdministradores.add(administrador);
            
            System.out.println("\n===== Sistema de Cadastro e Login =====");
            System.out.println("\nAdministrador cadastrado com sucesso!");
            System.out.println("\nDeseja realizar outro cadastro?");
            System.out.println("\n1. Cadastrar Medico");
            System.out.println("0. Cadastrar Secretario");
            System.out.print("\nDigite a opcao desejada: ");

            escolha = scanner.nextLine();

        } while (!escolha.equals("0"));

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
