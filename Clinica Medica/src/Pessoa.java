import java.io.Serializable;
public abstract class Pessoa implements Serializable {
    private String nome;
    private String dataNascimento;
    private int idade;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private char sexo;

    public Pessoa(String nome, String dataNascimento, int idade, String cpf, String rg, String endereco, String telefone, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
        else{
            this.nome = null;
        }
    }

    public void setDataNascimento(String dataNascimento) {
        if (dataNascimento != null && !dataNascimento.isEmpty() && dataNascimento.length() == 10) {
            this.dataNascimento = dataNascimento;
        }
        else{
            this.dataNascimento = null;
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
        else{
            this.idade = 0;
        }
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            this.cpf = null;
        }
    }

    public void setRg(String rg) {
        if (rg.length() > 8 && rg.length() < 14) {
            this.rg = rg;
        } else {
            this.rg = null;
        }
    }

    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.isEmpty()) {
            this.endereco = endereco;
        }
        else{
           this.endereco = null;
        }
    }

    public void setTelefone(String telefone) {
        if (telefone.length() > 9 && telefone.length() < 12) {
            this.telefone = telefone;
        } else {
            this.telefone = null; 
        }
    }

    public void setSexo(char sexo) {
        if ((sexo == 'M') || (sexo == 'm') || (sexo == 'F') || (sexo == 'f')) {
            this.sexo = sexo;
        }
        else{
            
        } 
    }

}