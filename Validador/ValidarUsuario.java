package Validador;

import Pojos.Administrador;
import Pojos.Cliente;
import Pojos.Pessoa;

public class ValidarUsuario {
    
    public static void valida(Pessoa pessoa){// Valida se a classe é de Adm ou Cliente
        if(pessoa instanceof Administrador){
            System.out.println("usuário é adm");
        }
        else{
            System.out.println("usuário é cliente");
        }
    }

    public static boolean validaAdmLoginSenha(String loginAdm, String senhaAdm, Administrador administrador){
        if (administrador.getLogin().equals(loginAdm)&&administrador.getSenha().equals(senhaAdm)){
            System.out.println("Login de administrador realizado com sucesso");
            return true;
        } else{
            System.out.println("Login ou senha inválidas");
            return false;
        }
    }
    public static boolean validaClienteLoginSenha(String loginCliente, String senhaCliente, Cliente cliente){
        if(cliente.getLogin().equals(loginCliente)&&cliente.getSenha().equals(senhaCliente)){
            System.out.println("Login de cliente realizado com sucesso");
            return true;
        } else{
            System.out.println("Login ou senha inválidas");
            return false;
        }
    }

}
