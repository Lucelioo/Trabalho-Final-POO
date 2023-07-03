import java.util.ArrayList;
import java.util.List;

public class Prontuario{
    private String nomePaciente;
    private List<Receita> receitas;
    private List<Exame> exames;

    public Prontuario(String nomePaciente) {
        this.nomePaciente = nomePaciente;
        this.receitas = new ArrayList<>();
        this.exames = new ArrayList<>();
    }

    public void adicionarReceita(Receita receita) {
        receitas.add(receita);
    }

    public void adicionarExame(Exame exame) {
        exames.add(exame);
    }

    public void imprimirProntuario() {
        System.out.println("Prontuário do Paciente: " + nomePaciente);
        System.out.println("Receitas:");
        for (Receita receita : receitas) {
            System.out.println(receita.getDescricao());
        }
        System.out.println("Exames:");
        for (Exame exame : exames) {
            System.out.println(exame.getDescricao());
        }
    }
}