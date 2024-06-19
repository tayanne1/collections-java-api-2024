# Lista de Tarefas

Este projeto Java implementa uma classe `ListaTarefas` que gerencia um conjunto de objetos `Tarefa`. Cada tarefa possui uma descrição e um estado booleano indicando se foi concluída ou não.

## Classes

### Tarefa

Representa uma tarefa com uma descrição e um estado de conclusão.

- **Atributos**:
  - `descricao`: A descrição da tarefa.
  - `concluida`: Um booleano indicando se a tarefa foi concluída.

- **Métodos**:
  - `getDescricao()`: Retorna a descrição da tarefa.
  - `isConcluida()`: Retorna `true` se a tarefa estiver concluída.
  - `setConcluida(boolean concluida)`: Define o estado de conclusão da tarefa.
  - `equals()`: Compara tarefas com base na descrição.
  - `hashCode()`: Gera um código hash baseado na descrição.
  - `toString()`: Retorna uma representação em string da tarefa.

### ListaTarefas

Gerencia um conjunto de tarefas.

- **Atributos**:
  - `conjuntoTarefas`: Um `HashSet` de objetos `Tarefa`.

- **Métodos**:
  - `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao conjunto.
  - `removerTarefa(String descricao)`: Remove uma tarefa do conjunto pela descrição.
  - `exibirTarefas()`: Exibe todas as tarefas.
  - `contarTarefas()`: Retorna o número total de tarefas.
  - `obterTarefasConcluidas()`: Retorna um conjunto de tarefas concluídas.
  - `obterTarefasPendentes()`: Retorna um conjunto de tarefas pendentes.
  - `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída.
  - `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente.
  - `limparListaTarefas()`: Remove todas as tarefas do conjunto.

