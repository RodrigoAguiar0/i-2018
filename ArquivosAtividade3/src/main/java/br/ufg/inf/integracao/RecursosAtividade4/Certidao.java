package br.ufg.inf.integracao.RecursosAtividade4;

public class Certidao {
    private String tipo;
    private String cartorio;
    private String livro;
    private String folha;
    private String termo;

    public Certidao(String tipo, String cartorio, String livro, String folha, String termo) {
        this.tipo = tipo;
        this.cartorio = cartorio;
        this.livro = livro;
        this.folha = folha;
        this.termo = termo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCartorio() {
        return cartorio;
    }

    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getFolha() {
        return folha;
    }

    public void setFolha(String folha) {
        this.folha = folha;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }
}
