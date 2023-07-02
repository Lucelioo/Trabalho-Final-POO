public class Administrador extends Funcionario{
    private String funcao;

    public Administrador() {
        super(null, null, 0, null, null, null, null, '\u0000', 0);
    }
    public Administrador(String nome, String dataNascimento, int idade, String cpf, String rg, String endereco, String telefone, char sexo, int matricula, String funcao) {
        super(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo, matricula);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
         if (funcao != null && !funcao.isEmpty()) {
           this.funcao = funcao;
        }
        else{
           this.funcao = null;
        }
        
    }
}
