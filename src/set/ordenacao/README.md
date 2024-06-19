# Gerenciador de Alunos

Este projeto Java implementa uma classe `GerenciadorAlunos` que gerencia um conjunto de objetos `Aluno`. Cada aluno possui atributos como nome, matrícula e nota.

## Classes

### Aluno

Representa um aluno com nome, matrícula e nota.

- **Atributos**:
  - `nome`: O nome do aluno.
  - `matricula`: O número de matrícula do aluno.
  - `nota`: A nota do aluno.

- **Métodos**:
  - `getNome()`: Retorna o nome do aluno.
  - `getMatricula()`: Retorna a matrícula do aluno.
  - `getNota()`: Retorna a do aluno.
  - `equals()`: Compara alunos com base na matrícula.
  - `hashCode()`: Gera um código hash baseado na matrícula.
  - `compareTo()`: Compara alunos por nome para ordenação.
  - `toString()`: Retorna uma representação em string do aluno.

### GerenciadorAlunos

Gerencia um conjunto de alunos.

- **Atributos**:
  - `alunos`: Um `HashSet` de objetos `Aluno`.

- **Métodos**:
  - `adicionarAluno(String nome, Long matricula, double nota)`: Adiciona um novo aluno ao conjunto.
  - `removerAluno(Long matricula)`: Remove um aluno do conjunto pela matrícula.
  - `exibirAlunosPorNome()`: Exibe os alunos em ordem alfabética pelo nome.
  - `exibirAlunosPorNota()`: Exibe os alunos em ordem crescente de nota.
  - `exibirAlunos()`: Exibe todos os alunos no conjunto.
