package br.ufg.inf.integracao.RecursosAtividade4;

import java.util.Calendar;

public class Data {
    private Calendar data;
    private String acuracia;

    public Data(Calendar data, String acuracia) {
        super();
        this.data = data;
        this.acuracia = acuracia;
    }

    public Data() {
        super();
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getAcuracia() {
        return acuracia;
    }

    public void setAcuracia(String acuracia) {
        this.acuracia = acuracia;
    }
}
