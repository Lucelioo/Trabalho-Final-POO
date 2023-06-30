public class Administrador extends Funcionario {
    private String funcao;

    public Administrador(String nome, int idade, int cpf, int rg, String endereco, int telefone, char sexo, int matricula, String funcao) {
        super(nome, idade, cpf, rg, endereco, telefone, sexo, matricula);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
