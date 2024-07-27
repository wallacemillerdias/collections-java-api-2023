package map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>();
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
        if (proximoEvento != null) {
            System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
        } else {
            System.out.println("Não há eventos futuros na agenda.");
        }
    }
}
