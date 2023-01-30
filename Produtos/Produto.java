package Produtos;

import Enums.EnumCategoria;

public class Produto implements Comparable<Produto> {

    protected String nome;
    protected double preco;
    protected String marca;
    protected EnumCategoria categoria;

    public Produto(String nome, double preco, String marca, EnumCategoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public EnumCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", marca='" + marca + '\'' +
                ", categoria=" + categoria +
                '}';
    }

    @Override
    public int compareTo(Produto o) {
        return this.getNome().compareTo(o.getNome());
    }
}


