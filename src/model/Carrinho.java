package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        itens.add(produto);
        System.out.println("Produto adicionado ao carrinho!");
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("--- Itens no Carrinho ---");
            for (Produto item : itens) {
                System.out.println("Nome: " + item.getNome() + " | Preço: R$" + item.getPreco());
            }
        }
    }

    public void finalizarCompra() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio. Não é possível finalizar a compra.");
        } else {
            double total = itens.stream().mapToDouble(Produto::getPreco).sum();
            System.out.println("\nCompra finalizada com sucesso!");
            System.out.println("Total a pagar: R$" + total);
            itens.clear();
        }
    }
}
