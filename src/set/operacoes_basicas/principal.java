package set.operacoes_basicas;

public class principal {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        // Adicionando palavras
        conjuntoPalavras.adicionarPalavra("java");
        conjuntoPalavras.adicionarPalavra("programação");
        conjuntoPalavras.adicionarPalavra("java"); // Não será adicionada, pois já existe
        conjuntoPalavras.adicionarPalavra("linguagem");
        conjuntoPalavras.adicionarPalavra("programação");

        // Exibindo palavras únicas
        conjuntoPalavras.exibirPalavrasUnicas();

        // Verificando se uma palavra está presente
        String palavraBuscada = "java";
        if (conjuntoPalavras.verificarPalavra(palavraBuscada)) {
            System.out.println("A palavra '" + palavraBuscada + "' está presente no conjunto.");
        } else {
            System.out.println("A palavra '" + palavraBuscada + "' não está presente no conjunto.");
        }

        // Removendo uma palavra
        conjuntoPalavras.removerPalavra("linguagem");

        // Exibindo novamente palavras únicas após remoção
        conjuntoPalavras.exibirPalavrasUnicas();
    }
}
