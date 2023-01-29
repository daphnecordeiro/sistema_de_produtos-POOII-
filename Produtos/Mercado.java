package Produtos;

import Enums.EnumCategoria;

public class Mercado extends Produto {
    public Mercado(String nome, double preco, String marca, EnumCategoria categoria) {
        super(nome, preco, marca, categoria);
    }

    @Override
    public String toString() {
        return "Mercado{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", marca='" + marca + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
