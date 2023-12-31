import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calendario {
    private Map<Medico, Map<String, List<String>>> disponibilidade;
    private List<Agendamento> agenda;

    public Calendario() {
        disponibilidade = new HashMap<>();
        agenda = new ArrayList<>();
    }

    public void registrarHorario(Medico medico, String dia, String horario, double valor, Paciente paciente) throws HorarioOcupadoException {
        if (!disponibilidade.containsKey(medico)) {
            disponibilidade.put(medico, new HashMap<>());
        }

        Map<String, List<String>> agendaMedico = disponibilidade.get(medico);

        if (!agendaMedico.containsKey(dia)) {
            agendaMedico.put(dia, new ArrayList<>());
        }

        List<String> horariosDoDia = agendaMedico.get(dia);

        if (horariosDoDia.contains(horario)) {
            throw new HorarioOcupadoException("O horario ja esta ocupado.");
        }

        horariosDoDia.add(horario);

        Agendamento agendamento = new Agendamento(medico, dia, horario, valor, paciente);
        agenda.add(agendamento);
    }

    public void imprimirAgendamentosDoDia(String dia) {
        System.out.println("Agendamentos para o dia " + dia + ":");
        for (Agendamento agendamento : agenda) {
            if (agendamento.getDia().equals(dia)) {
                System.out.println("Medico: " + agendamento.getMedico().getNome() +
                        ", Horario: " + agendamento.getHorario() +
                        ", Valor: R$ " + agendamento.getValor() +
                        ", Paciente: " + agendamento.getPaciente().getNome());
            }
        }
    }

    public Map<Medico, Map<String, List<String>>> getDisponibilidade() {
        return disponibilidade;
    }

    class Agendamento {
        private Medico medico;
        private String dia;
        private String horario;
        private double valor;
        private Paciente paciente;

        public Agendamento(Medico medico, String dia, String horario, double valor, Paciente paciente2) {
            this.medico = medico;
            this.dia = dia;
            this.horario = horario;
            this.valor = valor;
            this.paciente = paciente2;
        }

        public Medico getMedico() {
            return medico;
        }

        public String getDia() {
            return dia;
        }

        public String getHorario() {
            return horario;
        }

        public double getValor(){
            return valor;
        }

        public Paciente getPaciente() {
            return paciente;
        }
    }

    class HorarioOcupadoException extends Exception {
        public HorarioOcupadoException(String message) {
            super(message);
        }
    }
}
