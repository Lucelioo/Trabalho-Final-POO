public class Paciente extends Pessoa {
    private String convenio;

    public Paciente(String nome, int idade, int cpf, int rg, String endereco, int telefone, char sexo, String convenio) {
        super(nome, idade, cpf, rg, endereco, telefone, sexo);
        this.convenio = convenio;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
}