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
public class Caminhao extends Veiculo {

    public Caminhao(String codigoReconhecimento, int capacidadeDeLotes, int velocidadeMedia) {
        super(codigoReconhecimento, capacidadeDeLotes, velocidadeMedia);
    }

    public double tempoParaChegadaEstimada(int distancia) {
        // Duvida
        return distancia / super.velocidadeMedia;
    }

    @Override
    public String toString() {
        return "Codigo Reconhecimento: " + super.codigoReconhecimento + ", Capacidade De Lotes: "
                + super.capacidadeDeLotes + ", Velocidade média: " + super.velocidadeMedia;
    }

}
