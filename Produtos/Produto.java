package Produtos;

public class Produto {
    
    String nome;
    double preco;
    String marca;
    Categoria categoria;

    public Produto(String nome, double preco, String marca, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


}

