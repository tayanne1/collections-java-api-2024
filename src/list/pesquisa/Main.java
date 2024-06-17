package list.pesquisa;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        
      
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);

       
        int soma = somaNumeros.calcularSoma();
        System.out.println("A soma dos números é: " + soma);

    
        try {
            int maiorNumero = somaNumeros.encontrarMaiorNumero();
            System.out.println("O maior número é: " + maiorNumero);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        
        try {
            int menorNumero = somaNumeros.encontrarMenorNumero();
            System.out.println("O menor número é: " + menorNumero);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        somaNumeros.exibirNumeros();
    }
}
