package Produtos;

public class Livro extends Produto {

    public Livro(String nome, double preco, String marca, Categoria categoria) {
        super(nome, preco, marca, categoria);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", marca='" + marca + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
