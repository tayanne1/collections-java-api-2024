package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjunto;

    public ConjuntoPalavrasUnicas() {
        this.conjunto = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjunto.add(palavra);
    }

    public void removerPalavra(String palavra) {
        conjunto.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return conjunto.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println("Palavras únicas do conjunto:");
        for (String palavra : conjunto) {
            System.out.println(palavra);
        }
    }
}
