import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        float caixa = 0;
        Scanner ler = new Scanner(System.in);
        ArrayList<Produto> prodList = new ArrayList<>();

        do {
            System.out.println("\nBem vindo(a)!\n");
            System.out.println("Produto:");
            System.out.println("  1 - Adicionar");
            System.out.println("  2 - Ver todos os produtos");
            System.out.println("  3 - Alterar informações\n");
            System.out.println("Estoque:");
            System.out.println("  4 - Ver o estoque dos produtos");
            System.out.println("  5 - Ver estoque por categoria");
            System.out.println("  6 - Alterar estoque do produto\n");
            System.out.println("Compra:");
            System.out.println("  7 - Realizar uma compra\n");
            System.out.println("  0,8,9 - Saír");

            System.out.print("");

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
                    System.out.println("Alterar:");
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
                        case 1:{
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
                                prodList.set(idLivro, prod.alteraLivro(prodList.get(idLivro),nome, idLivro, preco, estoque, genero, editora, escritor));

                                System.out.println("Produto alterado!");
                            } else {
                                System.out.println("Produto não encontrado com o ID fornecido!");
                            }

                        } break;

                    }

                }

            }

        }while(true);
    }
}

