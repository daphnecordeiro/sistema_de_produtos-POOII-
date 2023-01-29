package Produtos;

public class Categoria {

    private static String livro;
    private static String informatica;
    private static String mercado;

    public Categoria(String livro, String informatica, String mercado) {
        this.livro = livro;
        this.informatica = informatica;
        this.mercado = mercado;
    }

    public static String getLivro() {
        return livro;
    }

    public static void setLivro(String livro) {
        Categoria.livro = livro;
    }

    public static String getInformatica() {
        return informatica;
    }

    public static void setInformatica(String informatica) {
        Categoria.informatica = informatica;
    }

    public static String getMercado() {
        return mercado;
    }

    public static void setMercado(String mercado) {
        Categoria.mercado = mercado;
    }
}

