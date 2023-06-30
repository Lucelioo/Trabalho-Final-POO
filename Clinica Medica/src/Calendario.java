import java.util.HashMap;
import java.util.Map;

public class Calendario {
    private Map<Medico, Map<String, Boolean>> disponibilidade;

    public Calendario() {
        disponibilidade = new HashMap<>();
    }

    public void registrarHorario(Medico medico, String dia, Paciente paciente) throws HorarioOcupadoException {
        if (!disponibilidade.containsKey(medico)) {
            disponibilidade.put(medico, new HashMap<>());
        }

        Map<String, Boolean> agenda = disponibilidade.get(medico);

        if (!agenda.containsKey(dia)) {
            agenda.put(dia, true);
        }

        if (!agenda.get(dia)) {
            throw new HorarioOcupadoException("O horario ja esta ocupado.");
        }

        String horario = paciente.getNome() + " - " + paciente.getCpf();
        agenda.put(horario, false); 
    }
    
    public Map<Medico, Map<String, Boolean>> getDisponibilidade() {
        return disponibilidade;
    }

    class HorarioOcupadoException extends Exception {
        public HorarioOcupadoException(String message) {
            super(message);
        }
    }
}
