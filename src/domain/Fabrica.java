package domain;

import java.util.ArrayList;

public class Fabrica {
    private String nome;
    private String endereco;
    private int qtdProduzida;

    private ArrayList<Vacina> vacina = new ArrayList<Vacina>();

    public Fabrica(String nome, String endereco, int qtdProduzida) {
        this.nome = nome;
        this.endereco = endereco;
        this.qtdProduzida = qtdProduzida;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty()) {

            this.nome = nome;
            return true;
        } else {
            return false;

        }
    }

    public String getEndereco() {
        return this.endereco;
    }

    public boolean setEndereco(String endereco) {
        if (!endereco.isEmpty()) {

            this.endereco = endereco;
            return true;
        } else {
            return false;

        }
    }

    public int getQtdProduzida() {
        return this.qtdProduzida;
    }

    public void addVacina(Vacina vac) {
        this.vacina.add(vac);
    }

    public boolean removeVacina(String codigo) {
        for (int i = 0; i < this.vacina.size(); i++) {
            if (codigo.equalsIgnoreCase(vacina.get(i).getCodigo())) {
                this.vacina.remove(this.vacina.get(i));
                return true;
            }
        }

        return false;

    }

    public String toString() {
        return "Nome: " + this.nome + ", Endereco: " + this.endereco + ", Quantida Produzida: " + this.qtdProduzida;
    }

}