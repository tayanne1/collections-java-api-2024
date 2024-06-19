package set.ordenacao;
import java.util.*;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(Long matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }

    public void exibirAlunosPorNome() {
        List<Aluno> listaAlunos = new ArrayList<>(alunos);
        Collections.sort(listaAlunos);
        System.out.println("Alunos ordenados por nome:");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunosPorNota() {
        List<Aluno> listaAlunos = new ArrayList<>(alunos);
        listaAlunos.sort(Comparator.comparingDouble(Aluno::getNota));
        System.out.println("Alunos ordenados por nota:");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunos() {
        System.out.println("Lista de todos os alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
     }

    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("Carlos Silva", 12345L, 7.5);
        gerenciador.adicionarAluno("Ana Oliveira", 67890L, 9.2);
        gerenciador.adicionarAluno("Beatriz Souza", 54321L, 8.3);

        gerenciador.exibirAlunos();

        gerenciador.exibirAlunosPorNome();

        gerenciador.exibirAlunosPorNota();

        gerenciador.removerAluno(12345L);

        gerenciador.exibirAlunos();
    }
}
