import java.util.ArrayList;

public class Login {
    private String nome;
    private int matricula;

    public Login(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void fazerLoginMedico(ArrayList<Medico> medicos) {
        for (Medico medico : medicos) {
            if (medico.getNome().equals(nome) && medico.getMatricula() == matricula) {
                System.out.println("Login realizado com sucesso");
                return;
            }
        }
        System.out.println("Nome e/ou matricula invalidos");
    }

    public void fazerLoginSecretario(ArrayList<Secretario> secretarios) {
        for (Secretario secretario : secretarios) {
            if (secretario.getNome().equals(nome) && secretario.getMatricula() == matricula) {
                System.out.println("Login realizado com sucesso");
                return;
            }
        }
        System.out.println("Nome e/ou matricula invalidos");
    }

    public void fazerLoginAdministrador(ArrayList<Administrador> administradores) {
        for (Administrador administrador : administradores) {
            if (administrador.getNome().equals(nome) && administrador.getMatricula() == matricula) {
                System.out.println("Login realizado com sucesso");
                return;
            }
        }
        System.out.println("Nome e/ou matricula inválidos");
    }
}
