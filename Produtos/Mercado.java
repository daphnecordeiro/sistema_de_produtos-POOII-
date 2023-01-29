package Produtos;

public class Mercado extends Produto {
    public Mercado(String nome, double preco, String marca, Categoria categoria) {
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
