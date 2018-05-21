package br.ufg.inf.integracao.RecursosAtividade4;

public class TituloEleitoral {
    private String secao;
    private String zona;

    public TituloEleitoral(String secao, String zona) {
        super();
        this.secao = secao;
        this.zona = zona;
    }

    public TituloEleitoral() {
        super();
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
