package Produtos;

public class Categoria {

    private static String categoria;
    private String livro;
    private String informatica;
    private String mercado;

    public Categoria(String livro, String informatica, String mercado) {
        this.livro = livro;
        this.informatica = informatica;
        this.mercado = mercado;
    }

    public String getLivro() {
        return this.livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getInformatica() {
        return this.informatica;
    }

    public void setInformatica(String informatica) {
        this.informatica = informatica;
    }

    public String getMercado() {
        return this.mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    @Override
    public String toString() {
        return "{" +
            " livro='" + getLivro() + "'" +
            ", informatica='" + getInformatica() + "'" +
            ", mercado='" + getMercado() + "'" +
            "}";
    }

}

