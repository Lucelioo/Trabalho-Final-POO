public class Funcionario extends Pessoa {
    private int matricula;

    public Funcionario(String nome, String dataNascimento, int idade, String cpf, String rg, String endereco, String telefone, char sexo, int matricula) {
        super(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        String matriculaStr = String.valueOf(matricula);
        if (matriculaStr.length() == 6) {
            this.matricula = matricula;
        }
    }
}