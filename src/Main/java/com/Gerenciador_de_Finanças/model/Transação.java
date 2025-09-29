package Main.java.com.Gerenciador_de_Finanças.model;

import java.util.Date;

public class Transação {

    private String categoriasdeTransacoes;
    private String tipodeTransacao;
    private double valor;
    private Date data;
    private String descricao;

    public Transação(String categoriasdeTransacoes, String tipodeTransacao, double valor, Date data, String descricao) {
        this.categoriasdeTransacoes = categoriasdeTransacoes;
        this.tipodeTransacao = tipodeTransacao;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public String getCategoriasdeTransacoes() {
        return categoriasdeTransacoes;
    }

    public String getTipodeTransacao() {
        return tipodeTransacao;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
}
