public class Medico extends Funcionario{
    private String especialidade;
    private double salario;
    private String crm;

    public Medico(String nome, String dataNascimento, int idade, String cpf, String rg, String endereco, String telefone, char sexo, int matricula, String especialidade, double salario, String crm) {
        super(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo, matricula);
        this.especialidade = especialidade;
        this.salario = salario;
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade != null && !especialidade.isEmpty()) {
            this.especialidade = especialidade;
        }
        else{
            this.especialidade = null;
        }
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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {

        if (crm != null && !crm.isEmpty()) {
            this.crm = crm;
        } else {
            this.crm = null;
        }
    }
}
