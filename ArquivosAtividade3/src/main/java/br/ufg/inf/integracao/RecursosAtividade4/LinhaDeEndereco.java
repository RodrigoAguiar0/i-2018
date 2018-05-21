package br.ufg.inf.integracao.RecursosAtividade4;

public class LinhaDeEndereco {
    private String ordem;
    private int linha;

    public LinhaDeEndereco(String ordem, int linha) {
        super();
        this.ordem = ordem;
        this.linha = linha;
    }

    public LinhaDeEndereco() {
        super();
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }
}
