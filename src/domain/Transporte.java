package domain;

import java.util.ArrayList;

public class Transporte {
    private String cidadeDestino;
    private int qtdLoteTransportada;
    private ArrayList<Vacina> vacina;
    private ArrayList<Veiculo> veiculo;
    

    public Transporte(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
        this.vacina  = new ArrayList<Vacina>();
        this.veiculo  = new ArrayList<Veiculo>();
        
    }

    public String getCidadeDestino() {
        return this.cidadeDestino;
    }

    public int getQtdLoteTransportada() {
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
    
    public boolean setQtdLoteTransportada(int qtd) {
        if(qtd > 0) {
            this.qtdLoteTransportada = qtd;
            return true;
        } else {
            return false;
        }
    }
    
    public void addVeiculo(Veiculo veic) {
        this.veiculo.add(veic);
    }
    
    
    public String toString() {
        return "cidade de Destino: "+ this.cidadeDestino;
    }

}
