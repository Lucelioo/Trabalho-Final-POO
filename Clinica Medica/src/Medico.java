public class Medico extends Funcionario {
    private String especialidade;
    private double salario;
    private String crm;

    public Medico(String nome, int idade, int cpf, int rg, String endereco, int telefone, char sexo, int matricula, String especialidade, double salario, String crm) {
        super(nome, idade, cpf, rg, endereco, telefone, sexo, matricula);
        this.especialidade = especialidade;
        this.salario = salario;
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
