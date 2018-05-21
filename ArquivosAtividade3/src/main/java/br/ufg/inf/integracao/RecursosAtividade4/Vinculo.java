package br.ufg.inf.integracao.RecursosAtividade4;

import java.util.Calendar;

public class Vinculo {
    private String relacionamento;
    private Calendar dataInicio;
    private Calendar dataFim;
    private Identificador identificador;

    public Vinculo(String relacionamento, Calendar dataInicio, Calendar dataFim, Identificador identificador) {
        this.relacionamento = relacionamento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.identificador = identificador;
    }

    public String getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public Identificador getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Identificador identificador) {
        this.identificador = identificador;
    }
}
