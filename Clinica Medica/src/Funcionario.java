public class Funcionario extends Pessoa {
    private int matricula;

    public Funcionario(String nome, int idade, int cpf, int rg, String endereco, int telefone, char sexo, int matricula) {
        super(nome, idade, cpf, rg, endereco, telefone, sexo);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}