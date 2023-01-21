public class Produto {
    private String nome;
    private int id;
    private float preco;
    private String tipoProd;
    private int estoque;

    //GET
    private String getNome(){ return nome; }
    private int getId(){ return id; }
    private float getPreco(){ return preco; }
    private String getTipoProd(){ return tipoProd; }
    private int getEstoque(){ return estoque; }

    //SET
    private void setNome(String N){
        this.nome = N;
    }
    private void setId(int ID){
        this.id = ID;
    }
    private void setPreco(float preco){
        this.preco = preco;
    }
    private void setTipoProd(String N){ this.tipoProd = N; }
    private void setEstoque(int E){ this.estoque = E; }


    //Brinquedo
    private String brinquedoTipo;

    //GET
    private String getBrinquedoTipo() {
        return this.brinquedoTipo;
    }

    //SET
    private void setBrinquedoTipo(String T) {
        this.brinquedoTipo = T;
    }

    //Filmes: estúdio, diretores, gêneros e produtores
    private String filmesEstudio;
    private String filmesDiretores;
    private String filmesGeneros;
    private String filmesProdutores;

    //GET
    private String getFilmesEstudio(){ return filmesEstudio; }
    private String getFilmesDiretores(){ return filmesDiretores; }
    private String getFilmesGeneros(){ return filmesGeneros; }
    private String getFilmesProdutores(){ return filmesProdutores; }

    //SET
    private void setFilmesEstudio(String E){ this.filmesEstudio = E; }
    private void setFilmesDiretores(String D){ this.filmesDiretores = D; }
    private void setFilmesGeneros(String G){ this.filmesGeneros = G; }
    private void setFilmesProdutores(String P){ this.filmesProdutores = P; }


    //Jogos: distribuidora, gêneros e estúdio
    private String jogosDistribuidora;
    private String jogosGeneros;
    private String jogosEstudio;

    //GET
    private String getDistribuidora(){ return jogosDistribuidora; }
    private String getJogosGeneros(){ return jogosGeneros; }
    private String getJogosEstudio(){ return jogosEstudio; }

    //SET
    private void setJogosDistribuidora(String D){ this.jogosDistribuidora = D; }
    private void setJogosGeneros(String G){ this.jogosGeneros = G; }
    private void setJogosEstudio(String E){ this.jogosEstudio = E; }

    //Livros: Devem ter nome, id, preço, gêneros, escritor, editora .
    private String livrosGeneros;
    private String livrosEscritor;
    private String livrosEditora;

    //GET
    private String getLivrosGeneros(){ return livrosGeneros; }
    private String getLivrosEscritor(){ return livrosEscritor; }
    private String getLivrosEditora(){ return livrosEditora; }

    //SET
    private void setLivrosGeneros(String G){ this.livrosGeneros = G; }
    private void setLivrosEscritor(String E){ this.livrosEscritor = E; }
    private void setLivrosEditora(String ED){ this.livrosEditora = ED; }

    //Álbuns de música: músicos/bandas, gêneros e selos
    private String musicaBandas;
    private String musicaGeneros;
    private String musicaSelos;

    //GET
    private String getMusicaBandas(){ return musicaBandas; }
    private String getMusicaGeneros(){ return musicaGeneros; }
    private String getMusicaSelos(){ return musicaSelos; }

    //SET
    private void setMusicaBandas(String B){ this.musicaBandas = B; }
    private void setMusicaGeneros(String G){ this.musicaGeneros = G; }
    private void setMusicaSelos(String S){ this.musicaSelos = S; }


    //ADICIONAR PRODUTOS
    public Produto addBrinquedo(String NOME, int ID, float PRECO, int ESTOQUE, String TIPO){
        this.setTipoProd("Brinquedo");
        this.setNome(NOME);
        this.setId(ID);
        this.setPreco(PRECO);
        this.setEstoque(ESTOQUE);
        this.setBrinquedoTipo(TIPO);
        return this;
    }
    public Produto addLivro(String NOME, int ID, float PRECO, int ESTOQUE, String GENERO, String EDITORA, String ESCRITOR){
        this.setTipoProd("Livro");
        this.setNome(NOME);
        this.setId(ID);
        this.setPreco(PRECO);
        this.setEstoque(ESTOQUE);
        this.setLivrosGeneros(GENERO);
        this.setLivrosEditora(EDITORA);
        this.setLivrosEscritor(ESCRITOR);
        return this;
    }

    public Produto addJogo(String NOME, int ID, float PRECO, int ESTOQUE, String GENERO, String DISTRIBUIDORA, String ESTUDIO){
        this.setTipoProd("Jogo");
        this.setNome(NOME);
        this.setId(ID);
        this.setPreco(PRECO);
        this.setEstoque(ESTOQUE);
        this.setJogosGeneros(GENERO);
        this.setJogosDistribuidora(DISTRIBUIDORA);
        this.setJogosEstudio(ESTUDIO);
        return this;
    }

    public Produto addFilme(String NOME, int ID, float PRECO, int ESTOQUE, String GENERO, String PRODUTORES, String ESTUDIO, String DIRETORES){
        this.setTipoProd("Filme");
        this.setNome(NOME);
        this.setId(ID);
        this.setPreco(PRECO);
        this.setEstoque(ESTOQUE);
        this.setFilmesGeneros(GENERO);
        this.setFilmesProdutores(PRODUTORES);
        this.setFilmesEstudio(ESTUDIO);
        this.setFilmesDiretores(DIRETORES);
        return this;
    }

        public Produto addMusica(String NOME, int ID, float PRECO, int ESTOQUE, String GENERO, String BANDA, String SELOS){
        this.setTipoProd("Álbum Musical");
        this.setNome(NOME);
        this.setId(ID);
        this.setPreco(PRECO);
        this.setEstoque(ESTOQUE);
        this.setMusicaGeneros(GENERO);
        this.setMusicaBandas(BANDA);
        this.setMusicaSelos(SELOS);
        return this;
    }
    public String getStrProduto(Produto prod){
        if(prod.tipoProd == "Livro")
            return prod.id+" - "+prod.tipoProd+"        : " +prod.nome+
                    " - Gênero: "+prod.livrosGeneros+" - Editora: "+prod.livrosEditora+" - Escritor(a): "+prod.livrosEscritor;
        if(prod.tipoProd == "Brinquedo")
            return prod.id+" - "+prod.tipoProd+"    : "     +prod.nome+" | "+prod.brinquedoTipo;
        if(prod.tipoProd == "Jogo")
            return prod.id+" - "+prod.tipoProd+"         : "+prod.nome+
                    " | "+prod.jogosGeneros+" | "+ prod.jogosEstudio+" | "+prod.jogosDistribuidora;
        if(prod.tipoProd == "Álbum Musical")
            return prod.id+" - "+prod.tipoProd+": "         +prod.nome+
                    " | "+prod.musicaGeneros+" | "+prod.musicaBandas+" | "+prod.musicaSelos;
        if(prod.tipoProd == "Filme")
            return prod.id+" - "+prod.tipoProd+"        : " +prod.nome+
                    " | "+prod.filmesGeneros+" | "+prod.filmesDiretores+" | "+prod.filmesEstudio+" | "+prod.filmesProdutores;
        return "";
    }

    public Produto alteraLivro(Produto prod, String NOME, int ID, float PRECO, int ESTOQUE, String GENERO, String EDITORA, String ESCRITOR){
        String mantemAtual = "9999";

        if(NOME.equals(mantemAtual))
            this.setNome(prod.nome);
        else
            this.setNome(NOME);

        this.setId(prod.id);

        if(PRECO == Float.parseFloat(mantemAtual))
            this.setPreco(prod.preco);
        else
            this.setPreco(PRECO);

        if(ESTOQUE == Integer.parseInt(mantemAtual))
            this.setEstoque(prod.estoque);
        else
            this.setEstoque(ESTOQUE);

        if(GENERO.equals(mantemAtual))
            this.setLivrosGeneros(prod.livrosGeneros);
        else
            this.setLivrosGeneros(GENERO);

        if(EDITORA.equals(mantemAtual))
            this.setLivrosEditora(prod.livrosEditora);
        else
            this.setLivrosEditora(EDITORA);

        if(ESCRITOR.equals(mantemAtual))
            this.setLivrosEscritor(prod.livrosEscritor);
        else
            this.setLivrosEscritor(ESCRITOR);

        return this;
    }

    public Produto alteraJogo(Produto prod, String NOME, int ID, float PRECO, int ESTOQUE, String GENERO, String DISTRIBUIDORA, String ESTUDIO){
        String mantemAtual = "9999";

        if(NOME.equals(mantemAtual))
            this.setNome(prod.nome);
        else
            this.setNome(NOME);

        this.setId(prod.id);

        if(PRECO == Float.parseFloat(mantemAtual))
            this.setPreco(prod.preco);
        else
            this.setPreco(PRECO);

        if(ESTOQUE == Integer.parseInt(mantemAtual))
            this.setEstoque(prod.estoque);
        else
            this.setEstoque(ESTOQUE);

        if(GENERO.equals(mantemAtual))
            this.setJogosGeneros(prod.jogosGeneros);
        else
            this.setJogosGeneros(GENERO);

        if(DISTRIBUIDORA.equals(mantemAtual))
            this.setJogosDistribuidora(prod.jogosDistribuidora);
        else
            this.setJogosDistribuidora(DISTRIBUIDORA);

        if(ESTUDIO.equals(mantemAtual))
            this.setJogosEstudio(prod.jogosEstudio);
        else
            this.setJogosEstudio(ESTUDIO);

        return this;
    }

    public Produto alteraFilme(Produto prod, String NOME, int ID, float PRECO, int ESTOQUE, String GENERO, String PRODUTORES, String ESTUDIO, String DIRETORES){
        String mantemAtual = "9999";

        if(NOME.equals(mantemAtual))
            this.setNome(prod.nome);
        else
            this.setNome(NOME);

        this.setId(prod.id);

        if(PRECO == Float.parseFloat(mantemAtual))
            this.setPreco(prod.preco);
        else
            this.setPreco(PRECO);

        if(ESTOQUE == Integer.parseInt(mantemAtual))
            this.setEstoque(prod.estoque);
        else
            this.setEstoque(ESTOQUE);

        if(GENERO.equals(mantemAtual))
            this.setFilmesGeneros(prod.filmesGeneros);
        else
            this.setFilmesGeneros(GENERO);

        if(PRODUTORES.equals(mantemAtual))
            this.setFilmesProdutores(prod.filmesProdutores);
        else
            this.setFilmesProdutores(PRODUTORES);

        if(ESTUDIO.equals(mantemAtual))
            this.setFilmesEstudio(prod.filmesEstudio);
        else
            this.setFilmesEstudio(ESTUDIO);

        if(DIRETORES.equals(mantemAtual))
            this.setFilmesDiretores(prod.filmesDiretores);
        else
            this.setFilmesDiretores(DIRETORES);

        return this;
    }

    public Produto alteraBanda(Produto prod, String NOME, int ID, float PRECO, int ESTOQUE, String GENERO, String BANDA, String SELOS){
        String mantemAtual = "9999";

        if(NOME.equals(mantemAtual))
            this.setNome(prod.nome);
        else
            this.setNome(NOME);

        this.setId(prod.id);

        if(PRECO == Float.parseFloat(mantemAtual))
            this.setPreco(prod.preco);
        else
            this.setPreco(PRECO);

        if(ESTOQUE == Integer.parseInt(mantemAtual))
            this.setEstoque(prod.estoque);
        else
            this.setEstoque(ESTOQUE);

        if(GENERO.equals(mantemAtual))
            this.setMusicaGeneros(prod.musicaGeneros);
        else
            this.setMusicaGeneros(GENERO);

        if(BANDA.equals(mantemAtual))
            this.setMusicaBandas(prod.musicaBandas);
        else
            this.setMusicaBandas(BANDA);

        if(SELOS.equals(mantemAtual))
            this.setMusicaSelos(prod.musicaSelos);
        else
            this.setMusicaSelos(SELOS);

        return this;
    }

    public Produto alteraBrinquedo(Produto prod, String NOME, int ID, float PRECO, int ESTOQUE, String TIPO){
        String mantemAtual = "9999";

        if(NOME.equals(mantemAtual))
            this.setNome(prod.nome);
        else
            this.setNome(NOME);

        this.setId(prod.id);

        if(PRECO == Float.parseFloat(mantemAtual))
            this.setPreco(prod.preco);
        else
            this.setPreco(PRECO);

        if(ESTOQUE == Integer.parseInt(mantemAtual))
            this.setEstoque(prod.estoque);
        else
            this.setEstoque(ESTOQUE);

        if(TIPO.equals(mantemAtual))
            this.setBrinquedoTipo(prod.brinquedoTipo);
        else
            this.setBrinquedoTipo(TIPO);

        return this;
    }

    public Produto(){ };
}
