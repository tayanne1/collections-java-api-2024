package list.pesquisa;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numeros> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(new Numeros(numero));
    }

    public int calcularSoma(){
        int soma = 0;
        for (Numeros numero : numerosList)
            soma += numero.getNumerosinteiros(); 
        return soma; 
    }
    
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()) {
            for (Numeros numero : numerosList){
                if (numero.getNumerosinteiros() >= maiorNumero){ 
                    maiorNumero = numero.getNumerosinteiros();
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numerosList.isEmpty()) {
            for (Numeros numero : numerosList){
                if (numero.getNumerosinteiros() <= menorNumero) { 
                    menorNumero = numero.getNumerosinteiros();
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!"); 
        }
    }
    
    public void exibirNumeros() {
        System.out.println(numerosList);
    }
}
