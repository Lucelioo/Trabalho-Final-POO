import java.util.ArrayList;

public class Login extends Cadastro {
    private String nome;
    private int matricula;

    public Login(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String fazerLoginMedico(ArrayList<Medico> medicos) {
        for (Medico medico : medicos) {
            if (medico.getNome().equals(nome)) {
                if (medico.getNome().equals(nome) && medico.getMatricula() == matricula) {
                    return "Login valido!";
                } else {
                    return "Matricula invalida!";
                }
            }   
        }
        return "Nome invalido!";
    }

    public String fazerLoginSecretario(ArrayList<Secretario> secretarios) {
        for (Secretario secretario : secretarios) {
            if (secretario.getNome().equals(nome)) {
                if (secretario.getNome().equals(nome) && secretario.getMatricula() == matricula) {
                    return "Login valido!";
                } else {
                    return "Matricula invalida!";
                }
            }   
        }
        return "Nome invalido!";
    }

    public String fazerLoginAdministrador(ArrayList<Administrador> administradores) {
        for (Administrador administrador : administradores) {
            if (administrador.getNome().equals(nome)) {
                if (administrador.getNome().equals(nome) && administrador.getMatricula() == matricula) {
                    return "Login valido!";
                } else {
                    return "Matricula invalida!";
                }
            }   
        }
        return "Nome invalido!";
    }
}
