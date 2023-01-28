package Pojos;

import Interfaces.VisualizarProdutos;
import Produtos.Produto;

public class Administrador extends Pessoa implements VisualizarProdutos{
    
    public Administrador(String login, String senha) {
        super(login, senha);
        setLogin("lol");
        setSenha("123");
    }

    public Produto cadastrarProduto(){
        return null;
    }

    public void editarProdutos(){

    }

    public void removerProdutos(){

    }

    @Override
    public void visualizarProdutos() {
        // TODO Auto-generated method stub
        
    }

}
