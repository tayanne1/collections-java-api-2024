package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> ordenacaoList;

    public OrdenacaoNumeros(List<Integer> ordenacaoList) {
        this.ordenacaoList = ordenacaoList;
    }

    public void adicionarNumero(int numero){
        if (ordenacaoList == null) {
            ordenacaoList = new ArrayList<>();
        }
        this.ordenacaoList.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(ordenacaoList);
        System.out.println("Números ordenados em ordem ascendente:");
        for (Integer numero : ordenacaoList) {
            System.out.println(numero);
        }
    }

    public void ordenarDescendente(){
        Collections.sort(ordenacaoList, Collections.reverseOrder());
        System.out.println("Números ordenados em ordem desccendente:");
        for (Integer numero : ordenacaoList) {
            System.out.println(numero);
        }
    }
}
