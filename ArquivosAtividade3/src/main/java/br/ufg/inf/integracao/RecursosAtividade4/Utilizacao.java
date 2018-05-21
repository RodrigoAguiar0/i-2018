package br.ufg.inf.integracao.RecursosAtividade4;

import java.util.Calendar;

public class Utilizacao {
    private String uso;
    private Calendar dataInicial;
    private Calendar dataFinal;
    private Identificador identificador;

    public Utilizacao(String uso, Calendar dataInicial, Calendar dataFinal, Identificador identificador) {
        super();
        this.uso = uso;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.identificador = identificador;
    }

    public Utilizacao() {
        super();
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public Calendar getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Calendar getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Identificador getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Identificador identificador) {
        this.identificador = identificador;
    }
}
