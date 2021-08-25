package domain;

import java.util.ArrayList;

public class Cliente {
    private String pais;
    private ArrayList<Distribuicao> distribuicao;

    public Cliente(String pais) {
        this.pais = pais;
        this.distribuicao = new ArrayList<Distribuicao>();
    }
    
    public void addDistribuicao(Distribuicao dist) {
        this.distribuicao.add(dist);
    }

    public String getPais() {
        return this.pais;
    }

    public String toString() {
        return "Pais: " + this.pais;
    }
}