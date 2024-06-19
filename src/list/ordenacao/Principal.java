package list.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class Principal {
     public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(2);
        numeros.add(1);
        numeros.add(5);
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros(numeros);
        ordenacaoNumeros.ordenarAscendente();
        ordenacaoNumeros.ordenarDescendente();
    }
}
