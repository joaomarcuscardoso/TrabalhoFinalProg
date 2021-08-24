package domain;

public class Carro extends Veiculo {

    public Carro(String codigoReconhecimento, int capacidadeDeLotes, int velocidadeMedia) {
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
