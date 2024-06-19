package set.pesquisa;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {
    private Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        conjuntoTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        conjuntoTarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    public void exibirTarefas() {
        System.out.println("Lista de Tarefas:");
        for (Tarefa tarefa : conjuntoTarefas) {
            System.out.println(tarefa);
        }
    }

    public int contarTarefas() {
        return conjuntoTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        return conjuntoTarefas.stream()
                .filter(Tarefa::isConcluida)
                .collect(Collectors.toSet());
    }

    public Set<Tarefa> obterTarefasPendentes() {
        return conjuntoTarefas.stream()
                .filter(tarefa -> !tarefa.isConcluida())
                .collect(Collectors.toSet());
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : conjuntoTarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : conjuntoTarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        conjuntoTarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios");
        listaTarefas.adicionarTarefa("Ler um livro");

        // Exibindo tarefas
        listaTarefas.exibirTarefas();

        // Marcando tarefa como concluída
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Exibindo tarefas concluídas
        System.out.println("Tarefas Concluídas: " + listaTarefas.obterTarefasConcluidas());

        // Exibindo tarefas pendentes
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Ler um livro");

        // Exibindo tarefas após remoção
        listaTarefas.exibirTarefas();

        // Contando tarefas
        System.out.println("Número total de tarefas: " + listaTarefas.contarTarefas());

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();

        // Exibindo tarefas após limpar a lista
        listaTarefas.exibirTarefas();
    }
}

