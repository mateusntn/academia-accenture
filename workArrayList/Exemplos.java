import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exemplos {
    public static void main(String[] args) {
        ArrayList<String> cardapio = new ArrayList<>();
        cardapio.add("Pizza");
        cardapio.add("Refrigerante");
        cardapio.add("Batatinha frita");     
               

        for(String item: cardapio) {
            JOptionPane.showMessageDialog(null, item);
        }

        String primeiroItem = cardapio.get(0);

        JOptionPane.showMessageDialog(null, "O primeiro item do cardápio é: " + primeiroItem);

        cardapio.remove(cardapio.size() - 1);

        JOptionPane.showMessageDialog(null, cardapio);

        ArrayList<Produto> estoque = new ArrayList<>();
        Produto produto = new Produto("Fone", 29.99, 10);
        estoque.add(produto);
        estoque.add(new Produto("Mouse", 7.99, 20));
        estoque.add(new Produto("Teclado", 49.99, 30));

        for(Produto item: estoque) {
            JOptionPane.showMessageDialog(null, item);
        }

        int total = 0;
        for(Produto item: estoque) {
            total += item.getQuantidade();
        }
        JOptionPane.showMessageDialog(null, "Total de produtos em estoque: " + total);
    }
}