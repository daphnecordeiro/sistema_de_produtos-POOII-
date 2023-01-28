package Pojos;

import Interfaces.VisualizarProdutos;

public class Cliente extends Pessoa implements VisualizarProdutos{


    public Cliente(String login, String senha){
        super(login, senha);
    }


    public void filtarPorCategoria(){

    }

    public void filtrarPorMarca(){

    }

    public void ordenarNomeCrescente(){

    }

    public void ordenarNomeDecrescente(){

    }

    public void ordenarPrecoCrescente(){

    }

    public void ordenarPrecoDecrescente(){

    }

    @Override
    public void visualizarProdutos() {
        // TODO Auto-generated method stub
        
    }

}
