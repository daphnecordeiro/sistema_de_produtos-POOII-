import java.util.*;

import Comparador.ComparadorProdutoPorPreco;
import Enums.EnumCategoria;
import Pojos.Administrador;
import Pojos.Cliente;
import Produtos.*;
import Validador.ValidarUsuario;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Produto> listaProdutos = new ArrayList<>();

        int opcaoMenuInicial, opcaoSubmenu, opcaoMenuAdm, opcaoMenuCliente;
        String loginAdm, senhaAdm, loginCliente, senhaCliente;
        Cliente cliente = null;
        Scanner sc = new Scanner(System.in);

        do {
            boolean continuando = true;
            System.out.println("-------Menu Inicial---------");
            System.out.println("Digite 1 - Sou Administrador");
            System.out.println("Digite 2 - Sou Cliente");
            System.out.println("Digite 0 - Finalizar o Sistema");

            opcaoMenuInicial = sc.nextInt();

            if (opcaoMenuInicial == 1) {
                System.out.println("-------Login Administrador---------");
                System.out.print("Digite o login:");
                loginAdm = sc.next();
                System.out.print("Digite a senha:");
                senhaAdm = sc.next();
                Administrador administrador = new Administrador(loginAdm, senhaAdm);
                boolean abreMenuAdm = ValidarUsuario.validaAdmLoginSenha(loginAdm, senhaAdm, administrador) == true;
                if (abreMenuAdm) {
                    do {
                        System.out.println("-----Menu Administrador ------: ");
                        System.out.println("1 - Cadastrar produto");
                        System.out.println("2 - Visualizar produtos");
                        System.out.println("3 - Editar produto");
                        System.out.println("4 - Remover produto");
                        System.out.println("0 - Retornar ao Menu Inicial");

                        System.out.println("Entre com a opção desejada: ");
                        opcaoMenuAdm = sc.nextInt();
                        switch (opcaoMenuAdm) {
                            case 0:
                                System.out.println("Retornando ao Menu Inicial");
                                break;
                            case 1:
                                System.out.println("Digite o nome do produto: ");
                                String nomeProduto = sc.next();
                                System.out.println("Digite o preço do produto: ");
                                double precoProduto = sc.nextDouble();
                                System.out.println("Digite a marca: ");
                                String marcaProduto = sc.next();
                                System.out.println("Qual a categoria do produto(Mercado(m)/Livro(l)/Informática(i))");
                                char ch = sc.next().charAt(0);
                                if (ch == 'm') {
                                    Produto produto = new Produto(nomeProduto, precoProduto, marcaProduto, EnumCategoria.MERCADO);
                                    listaProdutos.add(produto);
                                    System.out.println("Produto adicionado: " + produto);
                                } else if (ch == 'l') {
                                    Produto produto = new Produto(nomeProduto, precoProduto, marcaProduto, EnumCategoria.LIVRO);
                                    listaProdutos.add(produto);
                                    System.out.println("Produto adicionado: " + produto);
                                } else if (ch == 'i') {
                                    Produto produto = new Produto(nomeProduto, precoProduto, marcaProduto, EnumCategoria.INFORMATICA);
                                    listaProdutos.add(produto);
                                    System.out.println("Produto adicionado: " + produto);
                                }
                                break;
                            case 2:
                                for (Produto produto : listaProdutos) {
                                    System.out.println(produto);
                                }
                                break;
                            case 3:
                                System.out.println("Digite o nome do produto que deseja editar: ");
                                String nome = sc.next();
                                for (Produto produto : listaProdutos) {
                                    if (produto.getNome().equals(nome)) {
                                        System.out.println("Produto encontrado!");
                                        System.out.println(produto);
                                        System.out.print("O que deseja editar?(Nome(n)/Preço(p)/Marca(m)/Categoria(c):");
                                        char edicaoProduto = sc.next().charAt(0);
                                        if (edicaoProduto == 'n') {
                                            System.out.print("Digite o novo nome: ");
                                            String novoNome = sc.next();
                                            produto.setNome(novoNome);
                                        }
                                        if (edicaoProduto == 'p') {
                                            System.out.print("Digite o novo preco: ");
                                            double novoPreco = sc.nextDouble();
                                            produto.setPreco(novoPreco);
                                        }
                                        if (edicaoProduto == 'm') {
                                            System.out.print("Digite a nova marca: ");
                                            String novaMarca = sc.next();
                                            produto.setMarca(novaMarca);
                                        }
                                        if (edicaoProduto == 'c') {
                                            System.out.print("Digite a nova categoria: (Mercado(m)/Livro(l)/Informática(i))");
                                            ch = sc.next().charAt(0);
                                            if (ch == 'm') {
                                                produto.setCategoria(EnumCategoria.MERCADO);
                                            } else if (ch == 'l') {
                                                produto.setCategoria(EnumCategoria.LIVRO);
                                            } else if (ch == 'i') {
                                                produto.setCategoria(EnumCategoria.INFORMATICA);
                                            }
                                        }
                                        break;
                                    } else {
                                        System.out.println("Produto não encontrado!");
                                    }
                                    System.out.println("Produto editado: " + produto);
                                }
                                break;
                            case 4:
                                System.out.println("Digite o nome do produto que deseja editar: ");
                                String nomeProdutoRemocao = sc.next();
                                for (Produto produto : listaProdutos) {
                                    if (produto.getNome().equals(nomeProdutoRemocao)) {
                                        System.out.println(produto);
                                        listaProdutos.remove(produto);
                                        System.out.println("Produto encontrado e deletado!");
                                    } else {
                                        System.out.println("Produto não encontrado!");
                                    }
                                }
                                break;
                        }
                    } while (opcaoMenuAdm != 0);
                }
            }
            if (opcaoMenuInicial == 2) {
                do {
                    System.out.println("----- Menu Cliente(Cadastro/Login)------");
                    System.out.println("Digite 1 - Cadastro cliente (Primeiro Acesso)");
                    System.out.println("Digite 2 - Login cliente");
                    System.out.println("Digite 3 - Retornar ao Menu Inicial");

                    opcaoSubmenu = sc.nextInt();
                    if (opcaoSubmenu == 1) {
                        System.out.println("-------Cadastro Cliente---------");
                        System.out.print("Digite o login a ser cadastrado:");
                        loginCliente = sc.next();
                        System.out.print("Digite a senha a ser cadastrada:");
                        senhaCliente = sc.next();
                        cliente = new Cliente(loginCliente, senhaCliente);
                        System.out.print("Cadastro realizado com sucesso! Faça o seu login para acesso ao Menu. \n");
                    }
                    if (opcaoSubmenu == 2) {
                        System.out.println("-------Login Cliente---------");
                        System.out.print("Digite o login:");
                        loginCliente = sc.next();
                        System.out.print("Digite a senha:");
                        senhaCliente = sc.next();
                        boolean abreMenuCliente = ValidarUsuario.validaClienteLoginSenha(loginCliente, senhaCliente, cliente) == true;
                        if (abreMenuCliente) {
                            do {
                                System.out.println("-------Menu Cliente ------: ");
                                System.out.println("1 - Visualizar lista de produtos");
                                System.out.println("2 - Filtrar por categoria");
                                System.out.println("3 - Filtrar por marca");
                                System.out.println("4 - Ordenar por nome(ordem crescente e descrescente)");
                                System.out.println("5 - Ordenar por preço(ordem crescente e descrescente)");
                                System.out.println("0 - Sair do Menu Cliente");

                                System.out.println("Entre com a opção desejada: ");
                                opcaoMenuCliente = sc.nextInt();
                                switch (opcaoMenuCliente) {
                                    case 0:
                                        System.out.println("Saindo do Menu Cliente");
                                        break;
                                    case 1:
                                        for (Produto produto : listaProdutos) {
                                            System.out.println(produto);
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Filtrar pela categoria: (m)Mercado/(l)Livro/(i)Informática");
                                        char opcaoFiltroPorCategoria = sc.next().charAt(0);
                                        if (opcaoFiltroPorCategoria == 'm') {
                                            for (Produto produto : listaProdutos) {
                                                if (produto.getCategoria().equals(EnumCategoria.MERCADO)) {
                                                    System.out.println(produto);
                                                }
                                            }
                                        }
                                        if (opcaoFiltroPorCategoria == 'l') {
                                            for (Produto produto : listaProdutos) {
                                                if (produto.getCategoria().equals(EnumCategoria.LIVRO)) {
                                                    System.out.println(produto);
                                                }
                                            }
                                        }
                                        if (opcaoFiltroPorCategoria == 'i') {
                                            for (Produto produto : listaProdutos) {
                                                if (produto.getCategoria().equals(EnumCategoria.INFORMATICA)) {
                                                    System.out.println(produto);
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Digite a marca:");
                                        String opcaoFiltrarPorMarca = sc.next();
                                            for (Produto produto : listaProdutos) {
                                                if (produto.getMarca().equals(opcaoFiltrarPorMarca)) {
                                                    System.out.println(produto);
                                                }
                                            }
                                        break;
                                    case 4:
                                        System.out.println("Ordenar a lista por nome na ordem crescente ou descrescente?(c/d)");
                                        char opcaoOrdemNome = sc.next().charAt(0);
                                        if(opcaoOrdemNome=='c'){
                                            Collections.sort(listaProdutos);
                                            for(Produto produto:listaProdutos){
                                                System.out.println(produto);
                                            }
                                        } if(opcaoOrdemNome=='d') {
                                        Collections.reverse(listaProdutos);
                                        for (Produto produto : listaProdutos) {
                                            System.out.println(produto);
                                        }
                                    }
                                        break;
                                    case 5:
                                        System.out.println("Ordenar a lista por preço na ordem crescente ou descrescente?(c/d)");
                                        char opcaoOrdemPreco = sc.next().charAt(0);
                                        if(opcaoOrdemPreco=='c'){
                                            ComparadorProdutoPorPreco comparadorProdutoPorPreco = new ComparadorProdutoPorPreco();
                                            Collections.sort(listaProdutos, comparadorProdutoPorPreco);
                                            for(Produto produto:listaProdutos){
                                                System.out.println(produto);
                                            }
                                        } if(opcaoOrdemPreco=='d') {
                                        Collections.reverse(listaProdutos);
                                        for (Produto produto : listaProdutos) {
                                            System.out.println(produto);
                                        }
                                    }
                                        break;
                                }
                            } while (opcaoMenuCliente != 0);
                        }
                    }
                } while (opcaoSubmenu != 3);
            }
        } while (opcaoMenuInicial != 0);
    }
}