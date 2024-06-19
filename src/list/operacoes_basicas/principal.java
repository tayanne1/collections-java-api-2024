package list.operacoes_basicas;

public class principal {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    carrinhoDeCompras.adicionarItem("Produto 1", 10.0, 2);
    carrinhoDeCompras.adicionarItem("Produto 2", 15.0, 1);
    carrinhoDeCompras.adicionarItem("Produto 3", 5.0, 3);

    carrinhoDeCompras.exibirItens();
    System.out.println("O numero total de itens: " + carrinhoDeCompras.calcularValorTotal());

    carrinhoDeCompras.removerItem("Produto 2");

    carrinhoDeCompras.exibirItens();
    System.out.println("O numero total de itens: " + carrinhoDeCompras.calcularValorTotal());

    System.out.println(carrinhoDeCompras.toString());
    }
 
}
