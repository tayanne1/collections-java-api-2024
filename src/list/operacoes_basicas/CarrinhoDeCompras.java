import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CarrinhoDeCompras {

    private List<Item> itens;
    
    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itens.add(item);
    }

    public void removerItem(String nome){
        Iterator<Item> iterator = itens.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getNome() instanceof String && ((String) item.getNome()).equalsIgnoreCase(nome)) {
                iterator.remove();
                break;
        }
   }
}
   public double calcularValorTotal(){
    double valorTotal = 0d;
        for (Item item : itens) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
   }

   public void exibirItens(){
    for(Item item : itens) {
        System.out.println(item);
    }
   }

   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("CarrinhoDeCompras{");
       sb.append("itens=[");
       for (int i = 0; i < itens.size(); i++) {
           sb.append(itens.get(i));
           if (i < itens.size() - 1) {
               sb.append(", ");
           }
       }
       sb.append("]");
       sb.append('}');
       return sb.toString();
   }
}