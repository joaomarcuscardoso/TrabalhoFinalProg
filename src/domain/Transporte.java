package domain;

import java.util.ArrayList;

public class Transporte {
    private String cidadeDestino;
    private int qtdLoteTransportada[];
    private ArrayList<Vacina> vacina = new ArrayList<Vacina>();

    public Transporte(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getCidadeDestino() {
        return this.cidadeDestino;
    }

    public int[] getQtdLoteTransportada() {
        return this.qtdLoteTransportada;
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

    private int[] calcularQuantidade() {
        for (int i = 0; i < this.vacina.size(); i++) {
            this.qtdLoteTransportada[i] = this.vacina.get(i).getQtdLote();
        }

        return this.qtdLoteTransportada;
    }

}
