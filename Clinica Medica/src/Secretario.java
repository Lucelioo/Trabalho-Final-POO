import java.io.Serializable;

public class Secretario extends Funcionario implements Serializable{
    private double salario;
    
    public Secretario() {
        super(null, null, 0, null, null, null, null, '\u0000', 0);
    }

    public Secretario(String nome, String dataNascimento, int idade, String cpf, String rg, String endereco, String telefone, char sexo,int matricula, double salario) {
        super(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo, matricula);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0.0) {
            this.salario = salario;
        } else {
            this.salario = 0;
        }
    }
}
