import java.util.ArrayList;

public class Login {
    private String nome;
    private int matricula;

    public Login(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public boolean fazerLoginMedico(ArrayList<Medico> medicos) {
        for (Medico medico : medicos) {
            if (medico.getNome().equals(nome)) {
                if (medico.getMatricula() == matricula) {
                    System.out.println("Login realizado com sucesso\n");
                    return true;
                }
                else{
                    System.out.println("Matricula invalida\n");
                    return false;
                }
            }
        }
        System.out.println("Nome invalido\n");
        return false;
        
    }

    public boolean fazerLoginSecretario(ArrayList<Secretario> secretarios) {
        for (Secretario secretario : secretarios) {
            if (secretario.getNome().equals(nome)) {
                if (secretario.getMatricula() == matricula) {
                    System.out.println("Login realizado com sucesso\n");
                    return true;
                }
                else{
                    System.out.println("Matricula invalida\n");
                    return false;
                }
            }
        }
        System.out.println("Nome invalido\n");
            return false;
    }

    public boolean fazerLoginAdministrador(ArrayList<Administrador> administradores) {
        for (Administrador administrador : administradores) {
            if (administrador.getNome().equals(nome)) {
                if (administrador.getMatricula() == matricula) {
                    System.out.println("Login realizado com sucesso\n");
                    return true;
                }
                else{
                    System.out.println("Matricula invalida\n");
                    return false;
                }
            }
        }
        System.out.println("Nome invalido\n");
        return false;
    }
}
