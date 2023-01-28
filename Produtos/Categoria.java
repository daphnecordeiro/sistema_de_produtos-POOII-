package Produtos;

public class Categoria {
    
    private Livro livro;
    private Informatica informatica;
    private Mercado mercado;

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Informatica getInformatica() {
        return this.informatica;
    }

    public void setInformatica(Informatica informatica) {
        this.informatica = informatica;
    }

    public Mercado getMercado() {
        return this.mercado;
    }

    public void setMercado(Mercado mercado) {
        this.mercado = mercado;
    }

}

