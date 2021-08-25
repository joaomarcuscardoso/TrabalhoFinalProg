/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author rfcjo
 */

public abstract class Veiculo {
    protected String codigoReconhecimento;
    protected int capacidadeDeLotes;
    protected int velocidadeMedia;

    public Veiculo(String codigoReconhecimento, int capacidadeDeLotes, int velocidadeMedia) {
        this.codigoReconhecimento = codigoReconhecimento;
        this.capacidadeDeLotes = capacidadeDeLotes;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getCodigoReconhecimento() {
        return this.codigoReconhecimento;
    }

    public int getCapacidadeDeLotes() {
        return this.capacidadeDeLotes;
    }

    public double tempoParaChegadaEstimada(int distancia) {
        // Duvida
        return distancia / velocidadeMedia;
    }

    public String toString() {
        return "Codigo Reconhecimento: " + this.codigoReconhecimento + ", Capacidade De Lotes: "
                + this.capacidadeDeLotes + ", Velocidade média: " + this.velocidadeMedia;
    }

}