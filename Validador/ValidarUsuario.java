package Validador;

import Pojos.Administrador;
import Pojos.Pessoa;

public class ValidarUsuario {
    
    public static void valida(Pessoa pessoa){
        if(pessoa instanceof Administrador){
            System.out.println("usuário é adm");
        }
        else{
            System.out.println("usuário é cliente");
        }
    }
}
