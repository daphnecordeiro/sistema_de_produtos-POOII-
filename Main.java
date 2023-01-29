import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Pojos.Administrador;
import Pojos.Cliente;
import Produtos.*;
import Validador.ValidarUsuario;

public class Main {

    public static void main(String[] args) {

        //Criar menu escolher perguntar tipo de usuário\
        List<Produto> listaProdutos = new ArrayList<>();
        List<Livro> listaLivros = new ArrayList<>();
        List<Informatica> listaInformatica = new ArrayList<>();
        List<Mercado> listaMercado = new ArrayList<>();
        Mercado mercado =null;
        Informatica informatica =null;
        Livro livro= null;


        int opcao, opcaoMenuInicial, opcaoSubmenu, opcaoMenuAdm, opcaoMenuCliente;
        String loginAdm, senhaAdm, loginCliente, senhaCliente;
        Cliente cliente = null;
        Categoria categoria;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

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
                            System.out.println("Digite o nome do produto: ");
                            String nomeProduto = sc.next();
                            System.out.println("Digite o preço do produto: ");
                            double precoProduto = sc.nextDouble();
                            System.out.println("Digite a marca: ");
                            String marcaProduto = sc.next();
                            System.out.println("Qual a categoria do produto(Mercado(m)/Livro(l)/Informática(i)");
                            char ch = sc.next().charAt(0);
                            if (ch == 'm') {
                            Produto produto = new Produto(nomeProduto, precoProduto, marcaProduto,new Categoria(null, null, "mercado"));
                            listaProdutos.add(produto);
                            listaMercado.add((Mercado) produto);
                                System.out.println(listaMercado);
                                System.out.println("Produto adicionado: "+ produto);
                            } else if(ch == 'l') {
                                //Livro livro = new Livro(nomeProduto, precoProduto, marcaProduto, new Categoria());
                                listaLivros.add(livro);
                            }  else if (ch == 'i') {
                        //Informatica informatica = new Informatica(nomeProduto, precoProduto, marcaProduto, new Categoria());
                        listaInformatica.add(informatica);
                    }
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
