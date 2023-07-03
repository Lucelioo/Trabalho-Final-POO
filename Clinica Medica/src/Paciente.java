import java.io.Serializable;

public class Paciente extends Pessoa implements Serializable{
    private String convenio;

    public Paciente(String nome, String dataNascimento, int idade, String cpf, String rg, String endereco, String telefone, char sexo, String convenio) {
        super(nome, dataNascimento, idade, cpf, rg, endereco, telefone, sexo);
        this.convenio = convenio;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
         if (convenio != null && !convenio.isEmpty()) {
             this.convenio = convenio;
        }
        else{
            this.convenio = null;
        }
       
    }
}