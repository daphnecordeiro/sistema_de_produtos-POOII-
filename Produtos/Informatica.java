package Produtos;

import Enums.EnumCategoria;

public class Informatica extends Produto {

    public Informatica(String nome, double preco, String marca, EnumCategoria categoria) {
        super(nome, preco, marca, categoria);
    }

    @Override
    public String toString() {
        return "Informatica{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", marca='" + marca + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
