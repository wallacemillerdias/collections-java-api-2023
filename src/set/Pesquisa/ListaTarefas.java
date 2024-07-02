package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefasParaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover = tarefa;
                    break;
                }
            }
            tarefasSet.remove(tarefasParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }
        if (tarefasParaRemover == null) {
            System.out.println("Tarefas não encontradas!");
        }
    }

    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("Tarefas não encontradas!");
        }
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendenteParaMarcar = null;
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaPendenteParaMarcar = tarefa;
                break;
            }
        }
        if (tarefaPendenteParaMarcar != null) {
            if (tarefaPendenteParaMarcar.isConcluida()) {
                tarefaPendenteParaMarcar.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista!");
        }
    }

    public void limparListaTarefas() {
        if (tarefasSet.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            tarefasSet.clear();
        }
    }
}
