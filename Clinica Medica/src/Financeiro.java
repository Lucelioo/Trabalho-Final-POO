import java.util.Map;

public class Financeiro {
    private Map<Medico, Map<String, Boolean>> disponibilidade;

    public Financeiro(Map<Medico, Map<String, Boolean>> disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public double calcularSalario(Medico medico) {
        double salario = medico.getSalario();
        return salario;
    }

    public double totalDespesas() {
        double total = 0;
        for (Medico medico : disponibilidade.keySet()) {
            total += medico.getSalario();
        }
        return total;
    }

    public int calcularTotalConsulta(String dia) {
        int totalConsultas = 0;
        for (Map<String, Boolean> agenda : disponibilidade.values()) {
            if (agenda.containsKey(dia) && !agenda.get(dia)) {
                totalConsultas++;
            }
        }
        return totalConsultas;
    }
}
