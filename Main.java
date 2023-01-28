import java.net.CacheRequest;
import java.util.Scanner;

import Pojos.Administrador;
import Pojos.Cliente;
import Validador.ValidarUsuario;

public class Main {

    public static void main(String[] args) {

        //Criar menu escolher perguntar tipo de usuário


        int opcao, opcaoMenuInicial, opcaoSubmenu, opcaoMenuAdm, opcaoMenuCliente;
        String loginAdm, senhaAdm, loginCliente, senhaCliente;
        Cliente cliente = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("-------Menu inicial---------");
        System.out.println("Digite 1 - sou adm");// Considera que o adm já possui conta e não precisa fazer cadastro
        System.out.println("Digite 2 - sou cliente");
        opcaoMenuInicial = sc.nextInt();
        if (opcaoMenuInicial == 1) {
            System.out.print("Digite o login:");
            loginAdm = sc.next();
            System.out.print("Digite a senha:");
            senhaAdm = sc.next();
            Administrador administrador = new Administrador(loginAdm, senhaAdm);
            if (ValidarUsuario.validaAdmLoginSenha(loginAdm, senhaAdm, administrador) == true) {
                do {
                    System.out.println("-----Menu Administrador ------: ");
                    System.out.println("1 - Cadastrar produto");
                    System.out.println("2 - Visualizar produto");
                    System.out.println("3 - Editar produto");
                    System.out.println("4 - Remover produto");
                    System.out.println("0 - Finalizar o programa");

                    System.out.println("Entre com a opção desejada: ");
                    opcaoMenuAdm = sc.nextInt();
                    switch (opcaoMenuAdm) {
                        case 1:
                            System.out.println("Cadastrando produto");
                            break;
                        case 2:
                            System.out.println("Visualizando produto, etc");
                    }
                } while (opcaoMenuAdm != 0);
            }
        }
            if (opcaoMenuInicial == 2) {
                do {
                    System.out.println("Digite 1 - Cadastro cliente");
                    System.out.println("Digite 2 - Login cliente");
                    System.out.print("Digite 3 - Retorna ao Menu Inicial\n");// faz sentido essa opção?
                    opcaoSubmenu = sc.nextInt();
                    if (opcaoSubmenu == 1) {
                        System.out.print("Digite o login a ser cadastrado:");
                        loginCliente = sc.next();
                        System.out.print("Digite a senha a ser cadastrada:");
                        senhaCliente = sc.next();
                        cliente = new Cliente(loginCliente, senhaCliente);
                    }
                    if (opcaoSubmenu == 2) {
                        System.out.print("Digite o login:");
                        loginCliente = sc.next();
                        System.out.print("Digite a senha:");
                        senhaCliente = sc.next();
                        if (ValidarUsuario.validaClienteLoginSenha(loginCliente, senhaCliente, cliente) == true) {
                            do {
                                System.out.println("-----Menu Cliente (teste) ------: ");
                                System.out.println("1 - Buscar produto");
                                System.out.println("2 - Visualizar produto");
                                System.out.println("3 - Editar produto");
                                System.out.println("Entre com a opção desejada: ");
                                System.out.println("0 - Sair do Menu");// aqui talvez a opção fosse sair do sistema
                                opcaoMenuCliente = sc.nextInt();
                                switch (opcaoMenuCliente) {
                                    case 1:
                                        System.out.println("Buscando produto");
                                        break;
                                    case 2:
                                        System.out.println("Comparando produto, etc");
                                }
                            } while (opcaoMenuCliente != 0);
                        }
                    }
                } while (opcaoMenuInicial != 3);


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
    }
