package Comparador;

import Produtos.Produto;

import java.util.Comparator;

public class ComparadorProdutoPorPreco implements Comparator<Produto>{

    public int compare(Produto o1, Produto o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}
