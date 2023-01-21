import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        float caixa = 0;
        Scanner ler = new Scanner(System.in);
        ArrayList<Produto> prodList = new ArrayList<>();

        do {
            System.out.println("\nBem vindo(a)!");
            String money = caixa+"";
            System.out.print("(Caixa Atual: R$"+money.replace('.', ',')+")\n\n");
            System.out.println("Produto:");
            System.out.println("  1 - Adicionar");
            System.out.println("  2 - Ver todos os produtos");
            System.out.println("  3 - Alterar informações\n");
            System.out.println("Estoque:");
            System.out.println("  4 - Ver o estoque dos produtos");
            System.out.println("  5 - Ver os itens em estoque por categoria");
            System.out.println("  6 - Alterar apenas o estoque do produto\n");
            System.out.println("Compra:");
            System.out.println("  7 - Realizar uma compra\n");
            System.out.println("Navegação:");
            System.out.println("  0,8,9 - Saír\n\nDigite opção: ");

            int op = ler.nextInt();
            ler.nextLine();

            switch (op) {
                case 0, 8, 9 -> System.exit(0);
                case 1 -> {
                    System.out.println("Adicionar:");
                    System.out.println("  0 - Voltar");
                    System.out.println("  1 - Livro");
                    System.out.println("  2 - Jogo");
                    System.out.println("  3 - Filme");
                    System.out.println("  4 - Álbum musical");
                    System.out.println("  5 - Brinquedo\n");
                    System.out.println("Navegação:\n7,8,9 - Saír\n\nDigite opção: ");

                    op = ler.nextInt();
                    ler.nextLine();
                    switch (op) { //Adicionar
                        case 7, 8, 9:
                            System.exit(0);
                            break;
                        case 0:
                            break;
                        case 1: { //Adicionar Livro
                            System.out.print("Nome do livro: ");
                            String nome = ler.nextLine();
                            System.out.print("Preço: ");
                            float preco = Float.parseFloat(ler.nextLine().replace(',', '.'));
                            System.out.print("Estoque inicial: ");
                            int estoque = ler.nextInt();
                            ler.nextLine();
                            System.out.print("Gêneros: ");
                            String genero = ler.nextLine();
                            System.out.print("Nome da Editora: ");
                            String editora = ler.nextLine();
                            System.out.print("Nome do Escritor: ");
                            String escritor = ler.nextLine();

                            Produto prod = new Produto();
                            prodList.add(prod.addLivro(nome, prodList.size(), preco, estoque, genero, editora, escritor));
                            System.out.println("Livro cadastrado!");
                        }
                        break;
                        case 2: { //Adicionar Jogo
                            System.out.print("Nome do jogo: ");
                            String nome = ler.nextLine();
                            System.out.print("Preço: ");
                            float preco = Float.parseFloat(ler.nextLine().replace(',', '.'));
                            System.out.print("Estoque inicial: ");
                            int estoque = ler.nextInt();
                            ler.nextLine();
                            System.out.print("Distribuidora: ");
                            String distribuidora = ler.nextLine();
                            System.out.print("Gêneros: ");
                            String genero = ler.nextLine();
                            System.out.print("Estudio: ");
                            String estudio = ler.nextLine();

                            Produto prod = new Produto();
                            prodList.add(prod.addJogo(nome, prodList.size(), preco, estoque, genero, distribuidora, estudio));
                            System.out.println("Jogo cadastrado!");
                        }
                        break;
                        case 3: { //Adicionar Filme
                            System.out.print("Nome do filme: ");
                            String nome = ler.nextLine();
                            System.out.print("Preço: ");
                            float preco = Float.parseFloat(ler.nextLine().replace(',', '.'));
                            System.out.print("Estoque inicial: ");
                            int estoque = ler.nextInt();
                            ler.nextLine();
                            System.out.print("Produtores: ");
                            String produtores = ler.nextLine();
                            System.out.print("Estudio: ");
                            String estudio = ler.nextLine();
                            System.out.print("Gêneros: ");
                            String genero = ler.nextLine();
                            System.out.print("Diretores: ");
                            String diretores = ler.nextLine();

                            Produto prod = new Produto();
                            prodList.add(prod.addFilme(nome, prodList.size(), preco, estoque, genero, produtores, estudio, diretores));
                            System.out.println("Filme cadastrado!");
                        }
                        break;
                        case 4: { //Adicionar Música
                            System.out.print("Nome do álbum musical: ");
                            String nome = ler.nextLine();
                            System.out.print("Preço: ");
                            float preco = Float.parseFloat(ler.nextLine().replace(',', '.'));
                            System.out.print("Estoque inicial: ");
                            int estoque = ler.nextInt();
                            ler.nextLine();
                            System.out.print("Banda ou Músico: ");
                            String banda = ler.nextLine();
                            System.out.print("Gêneros: ");
                            String genero = ler.nextLine();
                            System.out.print("Selos: ");
                            String selos = ler.nextLine();

                            Produto prod = new Produto();
                            prodList.add(prod.addMusica(nome, prodList.size(), preco, estoque, genero, banda, selos));
                            System.out.println("Álbum musical cadastrado!");
                        }
                        break;
                        case 5: { //Adicionar Brinquedo
                            System.out.print("Nome do brinquedo: ");
                            String nome = ler.nextLine();
                            System.out.print("Preço: ");
                            float preco = Float.parseFloat(ler.nextLine().replace(',', '.'));
                            System.out.print("Estoque inicial: ");
                            int estoque = ler.nextInt();
                            ler.nextLine();
                            System.out.print("Tipo do brinquedo: ");
                            String tipoBrinquedo = ler.nextLine();

                            Produto prod = new Produto();
                            prodList.add(prod.addBrinquedo(nome, prodList.size(), preco, estoque, tipoBrinquedo));
                            System.out.println("Brinquedo cadastrado!");
                        }
                        break;

                    }
                }//FIM ADICIONAR
                case 2 -> { //VER PRODUTOS
                    System.out.println("\nLista de produtos:");
                    int index = 0;
                    while (index < prodList.size()) {
                        Produto p = new Produto();
                        String exibeProduto = p.getStrProduto(prodList.get(index));
                        //work on the element
                        System.out.println(exibeProduto);
                        index++;
                    }
                    System.out.println("\n** FIM DA LISTAGEM DE PRODUTOS **");
                }//FIM VER PRODUTOS
                case 3 -> { //ALTERAR PRODUTOS
                    System.out.println("Alterar informações:");
                    System.out.println("  0 - Voltar");
                    System.out.println("  1 - Livro");
                    System.out.println("  2 - Jogo");
                    System.out.println("  3 - Filme");
                    System.out.println("  4 - Álbum musical");
                    System.out.println("  5 - Brinquedo");
                    System.out.println("7,8,9 - Saír");

                    op = ler.nextInt();
                    ler.nextLine();
                    switch (op) { //Adicionar
                        case 7, 8, 9:
                            System.exit(0);
                            break;
                        case 0:
                            break;
                        case 1:{//Livaro
                            System.out.println("Entre com o id do Livro a ser alterado: ");
                            int idLivro = ler.nextInt();
                            ler.nextLine();

                            Produto p = new Produto();
                            if(idLivro > -1 && idLivro <= prodList.size()-1) {
                                String exibeProduto = p.getStrProduto(prodList.get(idLivro));
                                //work on the element
                                System.out.println(exibeProduto);

                                System.out.println("Entre com os dados a serem alterados\n( '9999' pra manter o valor atual):");
                                System.out.print("Nome do livro: ");
                                String nome = ler.nextLine();
                                System.out.print("Preço: ");
                                float preco = Float.parseFloat(ler.nextLine().replace(',', '.'));
                                System.out.print("Estoque arbitrário: ");
                                int estoque = ler.nextInt();
                                ler.nextLine();
                                System.out.print("Gêneros: ");
                                String genero = ler.nextLine();
                                System.out.print("Nome da Editora: ");
                                String editora = ler.nextLine();
                                System.out.print("Nome do Escritor: ");
                                String escritor = ler.nextLine();

                                Produto prod = new Produto();
                                prodList.set(idLivro, prod.alteraLivro(prodList.get(idLivro),nome, idLivro, preco, estoque, genero, editora, escritor));

                                String exibeAlterado = p.getStrProduto(prodList.get(idLivro));
                                //work on the element
                                System.out.println("\n"+exibeAlterado);
                                System.out.println("Produto alterado!");
                            } else {
                                System.out.println("Produto não encontrado com o ID fornecido!");
                            }

                        } break;


                        case 2:{//Jogo
                            System.out.println("Entre com o id do Jogo a ser alterado: ");
                            int idJogo = ler.nextInt();
                            ler.nextLine();

                            Produto p = new Produto();
                            if(idJogo > -1 && idJogo <= prodList.size()-1) {
                                String exibeProduto = p.getStrProduto(prodList.get(idJogo));
                                //work on the element
                                System.out.println(exibeProduto);

                                System.out.println("Entre com os dados a serem alterados\n( '9999' pra manter o valor atual):");
                                System.out.print("Nome do jogo: ");
                                String nome = ler.nextLine();
                                System.out.print("Preço: ");
                                float preco = Float.parseFloat(ler.nextLine().replace(',', '.'));
                                System.out.print("Estoque arbitrário: ");
                                int estoque = ler.nextInt();
                                ler.nextLine();
                                System.out.print("Gêneros: ");
                                String genero = ler.nextLine();
                                System.out.print("Distribuidora: ");
                                String distribuidora = ler.nextLine();
                                System.out.print("Estudio: ");
                                String estudio = ler.nextLine();

                                Produto prod = new Produto();
                                prodList.set(idJogo, prod.alteraJogo(prodList.get(idJogo),nome, preco, estoque, genero, distribuidora, estudio));

                                String exibeAlterado = p.getStrProduto(prodList.get(idJogo));
                                //work on the element
                                System.out.println("\n"+exibeAlterado);
                                System.out.println("Produto alterado!");
                            } else {
                                System.out.println("Produto não encontrado com o ID fornecido!");
                            }

                        } break;

                        case 3:{//Alterar Filme
                            System.out.println("Entre com o id do Filme a ser alterado: ");
                            int idFilme = ler.nextInt();
                            ler.nextLine();

                            Produto p = new Produto();
                            if(idFilme > -1 && idFilme <= prodList.size()-1) {
                                String exibeProduto = p.getStrProduto(prodList.get(idFilme));
                                //work on the element
                                System.out.println(exibeProduto);

                                System.out.println("Entre com os dados a serem alterados\n( '9999' pra manter o valor atual):");
                                System.out.print("Nome do filme: ");
                                String nome = ler.nextLine();
                                System.out.print("Preço: ");
                                float preco = Float.parseFloat(ler.nextLine().replace(',', '.'));
                                System.out.print("Estoque arbitrário: ");
                                int estoque = ler.nextInt();
                                ler.nextLine();
                                System.out.print("Produtores: ");
                                String produtores = ler.nextLine();
                                System.out.print("Estudio: ");
                                String estudio = ler.nextLine();
                                System.out.print("Gêneros: ");
                                String genero = ler.nextLine();
                                System.out.print("Diretores: ");
                                String diretores = ler.nextLine();

                                Produto prod = new Produto();
                                prodList.set(idFilme, prod.alteraFilme(prodList.get(idFilme),nome, preco, estoque, genero, produtores, estudio, diretores));

                                String exibeAlterado = p.getStrProduto(prodList.get(idFilme));
                                //work on the element
                                System.out.println("\n"+exibeAlterado);
                                System.out.println("Produto alterado!");
                            } else {
                                System.out.println("Produto não encontrado com o ID fornecido!");
                            }

                        } break;

                        case 4:{//Alterar Álbum musical
                            System.out.println("Entre com o id do Álbum de música a ser alterado: ");
                            int idFilme = ler.nextInt();
                            ler.nextLine();

                            Produto p = new Produto();
                            if(idFilme > -1 && idFilme <= prodList.size()-1) {
                                String exibeProduto = p.getStrProduto(prodList.get(idFilme));
                                //work on the element
                                System.out.println(exibeProduto);

                                System.out.println("Entre com os dados a serem alterados\n( '9999' pra manter o valor atual):");
                                System.out.print("Nome do filme: ");
                                String nome = ler.nextLine();
                                System.out.print("Preço: ");
                                float preco = Float.parseFloat(ler.nextLine().replace(',', '.'));
                                System.out.print("Estoque arbitrário: ");
                                int estoque = ler.nextInt();
                                ler.nextLine();
                                System.out.print("Banda ou Músico: ");
                                String banda = ler.nextLine();
                                System.out.print("Gêneros: ");
                                String genero = ler.nextLine();
                                System.out.print("Selos: ");
                                String selos = ler.nextLine();

                                Produto prod = new Produto();
                                prodList.set(idFilme, prod.alteraMusica(prodList.get(idFilme),nome, preco, estoque, genero, banda, selos));

                                String exibeAlterado = p.getStrProduto(prodList.get(idFilme));
                                //work on the element
                                System.out.println("\n"+exibeAlterado);
                                System.out.println("Produto alterado!");
                            } else {
                                System.out.println("Produto não encontrado com o ID fornecido!");
                            }

                        } break;


                        case 5:{//Alterar Brinquedo
                            System.out.println("Entre com o id do Brinquedo a ser alterado: ");
                            int idFilme = ler.nextInt();
                            ler.nextLine();

                            Produto p = new Produto();
                            if(idFilme > -1 && idFilme <= prodList.size()-1) {
                                String exibeProduto = p.getStrProduto(prodList.get(idFilme));
                                //work on the element
                                System.out.println(exibeProduto);

                                System.out.println("Entre com os dados a serem alterados\n( '9999' pra manter o valor atual):");
                                System.out.print("Nome do filme: ");
                                String nome = ler.nextLine();
                                System.out.print("Preço: ");
                                float preco = Float.parseFloat(ler.nextLine().replace(',', '.'));
                                System.out.print("Estoque arbitrário: ");
                                int estoque = ler.nextInt();
                                ler.nextLine();
                                System.out.print("Tipo do brinquedo: ");
                                String tipoBrinquedo = ler.nextLine();

                                Produto prod = new Produto();
                                prodList.set(idFilme, prod.alteraBrinquedo(prodList.get(idFilme),nome, preco, estoque, tipoBrinquedo));

                                String exibeAlterado = p.getStrProduto(prodList.get(idFilme));
                                //work on the element
                                System.out.println("\n"+exibeAlterado);
                                System.out.println("Produto alterado!");
                            } else {
                                System.out.println("Produto não encontrado com o ID fornecido!");
                            }

                        } break;




                    }

                } //Fim alterar
                case 4 -> { //VER ESTOQUE DE PRODUTOS
                    System.out.println("\nEstoque dos produtos:");
                    int index = 0;
                    while (index < prodList.size()) {
                        Produto p = new Produto();
                        String exibeProduto = p.getStrEstoque(prodList.get(index));
                        //work on the element
                        System.out.println(exibeProduto);
                        index++;
                    }
                    System.out.println("\n** FIM DA LISTAGEM DE PRODUTOS **");
                } //FIM ESTOQUE

                case 5 -> { //Ver listagem por categoria
                    System.out.println("Ver estoque por categoria:");
                    System.out.println("  0 - Voltar");
                    System.out.println("  1 - Livro");
                    System.out.println("  2 - Jogo");
                    System.out.println("  3 - Filme");
                    System.out.println("  4 - Álbum musical");
                    System.out.println("  5 - Brinquedo");
                    System.out.println("7,8,9 - Saír");

                    op = ler.nextInt();
                    ler.nextLine();
                    switch (op) { //Adicionar
                        case 7, 8, 9:
                            System.exit(0);
                            break;
                        case 0:
                            break;
                        case 1:{ //Ver estoque de Livros
                            System.out.println("\nEstoque dos livros:");
                            int index = 0;
                            while (index < prodList.size()) {
                                Produto p = new Produto();
                                String exibeProduto = p.getStrEstoque(prodList.get(index),"Livro");
                                //work on the element
                                if(!exibeProduto.equals(""))
                                    System.out.println(exibeProduto);

                                index++;
                            }
                            System.out.println("\n** FIM DA LISTAGEM DE LIVROS **");
                        } break; //FIM listagem livro

                        case 2:{ //Ver estoque de Jogos
                            System.out.println("\nEstoque dos jogos:");
                            int index = 0;
                            while (index < prodList.size()) {
                                Produto p = new Produto();
                                String exibeProduto = p.getStrEstoque(prodList.get(index),"Jogo");
                                //work on the element
                                if(!exibeProduto.equals(""))
                                    System.out.println(exibeProduto);

                                index++;
                            }
                            System.out.println("\n** FIM DA LISTAGEM DE JOGOS **");
                        } break; //FIM listagem jogo

                        case 3:{ //Ver estoque de Filme
                            System.out.println("\nEstoque dos filmes:");
                            int index = 0;
                            while (index < prodList.size()) {
                                Produto p = new Produto();
                                String exibeProduto = p.getStrEstoque(prodList.get(index),"Filme");
                                //work on the element
                                if(!exibeProduto.equals(""))
                                    System.out.println(exibeProduto);

                                index++;
                            }
                            System.out.println("\n** FIM DA LISTAGEM DE FILMES **");
                        } break; //FIM listagem jogo

                        case 4:{ //Ver estoque de Álbum musical
                            System.out.println("\nEstoque de álbuns musicais:");
                            int index = 0;
                            while (index < prodList.size()) {
                                Produto p = new Produto();
                                String exibeProduto = p.getStrEstoque(prodList.get(index),"Álbum Musical");
                                //work on the element
                                if(!exibeProduto.equals(""))
                                    System.out.println(exibeProduto);

                                index++;
                            }
                            System.out.println("\n** FIM DA LISTAGEM DE ÁLBUNS MUSICAIS **");
                        } break; //FIM listagem, Álbum Musical

                        case 5:{ //Ver estoque de Brinquedo
                            System.out.println("\nEstoque de brinquedos:");
                            int index = 0;
                            while (index < prodList.size()) {
                                Produto p = new Produto();
                                String exibeProduto = p.getStrEstoque(prodList.get(index),"Brinquedo");
                                //work on the element
                                if(!exibeProduto.equals(""))
                                    System.out.println(exibeProduto);

                                index++;
                            }
                            System.out.println("\n** FIM DA LISTAGEM DE BRINQUEDOS **");
                        } break; //FIM listagem de brinquedos

                    }
                } // FIM LISTAGEM DE ESTOQUE POR CATEGORIA

                case 6 -> { //ALTERAR ESTOQUE
                    System.out.println("Alterar informações:");
                    System.out.println("  0 - Voltar");
                    System.out.println("  1 - Livro");
                    System.out.println("  2 - Jogo");
                    System.out.println("  3 - Filme");
                    System.out.println("  4 - Álbum musical");
                    System.out.println("  5 - Brinquedo");
                    System.out.println("7,8,9 - Saír");

                    op = ler.nextInt();
                    ler.nextLine();
                    switch (op) { //Adicionar
                        case 7, 8, 9:
                            System.exit(0);
                            break;
                        case 0:
                            break;
                        case 1: {//ALTERAR ESTOQUE LIVRO
                            System.out.println("Entre com o id do Livro a ser alterado: ");
                            int idLivro = ler.nextInt();
                            ler.nextLine();

                            Produto p = new Produto();
                            if (idLivro > -1 && idLivro <= prodList.size() - 1) {
                                String exibeProduto = p.getStrEstoque(prodList.get(idLivro));
                                //work on the element
                                System.out.println(exibeProduto);

                                System.out.println("Entre com o novo estoque:");
                                int estoque = ler.nextInt();
                                ler.nextLine();

                                Produto prod = new Produto();
                                prodList.set(idLivro, prod.alteraEstoqueLivro(prodList.get(idLivro), estoque));

                                String exibeAlterado = p.getStrEstoque(prodList.get(idLivro));
                                //work on the element
                                System.out.println("\n" + exibeAlterado);
                                System.out.println("Estoque alterado!");
                            } else {
                                System.out.println("Produto não encontrado com o ID fornecido!");
                            }

                        }// FIM ALTERAR ESTOQUE LIVRO
                        break;
                    }
                } // FIM ALTERAR ESTOQUE
            }

        }while(true);
    }
}

