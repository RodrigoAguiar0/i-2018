package br.ufg.inf.integracao.RecursosAtividade4;

public class Comunicacao {
    private String meio;
    private String preferencia;
    private String detalhe;
    private String uso;

    public Comunicacao(String meio, String preferencia, String detalhe, String uso) {
        super();
        this.meio = meio;
        this.preferencia = preferencia;
        this.detalhe = detalhe;
        this.uso = uso;
    }

    public Comunicacao() {
        super();
    }

    public String getMeio() {
        return meio;
    }

    public void setMeio(String meio) {
        this.meio = meio;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
}
