package br.ufg.inf.integracao.RecursosAtividade4;

public class DadoDemografico {
    private String sexo;
    private String nomePai;
    private String nomeMae;
    private String situacaoFamiliar;
    private String raca;
    private String comentario;
    private String fonteNotificObito;
    private String nascimentoPluralidade;
    private String nascimentoOrdem;
    private String nascimentoSeguimento;
    private Data dataObito;
    private Data dataNascimento;
    private Nacionalidade nacionalidade;

    public DadoDemografico(String sexo, String nomePai, String nomeMae, String situacaoFamiliar, String raca,
                           String comentario, String fonteNotificObito, String nascimentoPluralidade,
                           String nascimentoOrdem, String nascimentoSeguimento, Data dataObito, Data dataNascimento) {
        this.sexo = sexo;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.situacaoFamiliar = situacaoFamiliar;
        this.raca = raca;
        this.comentario = comentario;
        this.fonteNotificObito = fonteNotificObito;
        this.nascimentoPluralidade = nascimentoPluralidade;
        this.nascimentoOrdem = nascimentoOrdem;
        this.nascimentoSeguimento = nascimentoSeguimento;
        this.dataObito = dataObito;
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(String situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFonteNotificObito() {
        return fonteNotificObito;
    }

    public void setFonteNotificObito(String fonteNotificObito) {
        this.fonteNotificObito = fonteNotificObito;
    }

    public String getNascimentoPluralidade() {
        return nascimentoPluralidade;
    }

    public void setNascimentoPluralidade(String nascimentoPluralidade) {
        this.nascimentoPluralidade = nascimentoPluralidade;
    }

    public String getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    public void setNascimentoOrdem(String nascimentoOrdem) {
        this.nascimentoOrdem = nascimentoOrdem;
    }

    public String getNascimentoSeguimento() {
        return nascimentoSeguimento;
    }

    public void setNascimentoSeguimento(String nascimentoSeguimento) {
        this.nascimentoSeguimento = nascimentoSeguimento;
    }

    public Data getDataObito() {
        return dataObito;
    }

    public void setDataObito(Data dataObito) {
        this.dataObito = dataObito;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
