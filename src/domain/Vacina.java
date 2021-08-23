package domain;

import java.util.Date;

public class Vacina {
    private String nome;
    private Date validade;
    private int qtdLote;
    private double preco;
    private String codigo;

    public Vacina(String nome, Date validade, int qtdLote) {
        this.nome = nome;
        this.validade = validade;
        this.qtdLote = qtdLote;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo() {
        this.codigo = codigo + "VAC";
    }

    public Date getValidade() {
        return this.validade;
    }

    public int getQtdLote() {
        return this.qtdLote;
    }

    public double getPreco() {
        return this.preco;
    }

    // public double calcularPreco() {
    // this.preco = this.preco;
    // return this.preco;
    // }

    public String toString() {
        return "Nome: " + this.nome + ", Validade: " + this.validade + ", quantidade de Lote: " + this.qtdLote
                + ", Preço: " + this.preco;

    }

}
