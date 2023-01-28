import java.net.CacheRequest;
import java.util.Scanner;

import Pojos.Administrador;
import Pojos.Cliente;
import Validador.ValidarUsuario;

public class Main {
    
    public static void main(String[] args) {

        //Criar menu escolher perguntar tipo de usuário

        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("alteração daphne");

        Administrador adm = new Administrador("lol", "123");
        Cliente cli = new Cliente("abobora", "566");

        ValidarUsuario.valida(adm);
        
        // do{
        //     System.out.println("Menu: ");
        //     System.out.println("1 - Cadastrar usuário");
        //     System.out.println("2 - Cadastrar produto");
        //     System.out.println("3 - Visualizar produto");
        //     System.out.println("4 - Editar produto");
        //     System.out.println("5 - Remover produto");
        //     System.out.println("0 - Sair");
        //     System.out.println("Entre com a opção desejada: ");
        //     opcao = sc.nextInt();

        //     switch (opcao){

        //         case 1:
        //         System.out.println("1");
        //         break;

        //         case 2:
                
        //     }

        // }while(opcao != 0);
    
    }
    
}
