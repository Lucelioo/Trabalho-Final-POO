public class Secretario extends Funcionario {
    private double salario;

    public Secretario(String nome, int idade, int cpf, int rg, String endereco, int telefone, char sexo,int matricula, double salario) {
        super(nome, idade, cpf, rg, endereco, telefone, sexo, matricula);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
