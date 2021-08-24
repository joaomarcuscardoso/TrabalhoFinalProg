package domain;

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