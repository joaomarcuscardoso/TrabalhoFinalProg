package domain;

public class Aviao extends Veiculo {
    private String codigoRota;

    public Aviao(String codigoReconhecimento, int capacidadeDeLotes, int velocidadeMedia) {
        super(codigoReconhecimento, capacidadeDeLotes, velocidadeMedia);
    }

    public boolean setCodigoRota(String codigoRota) {
        if (codigoRota.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public String getCodigoRota() {
        return this.codigoRota;
    }

    public double tempoParaChegadaEstimada(int distancia) {
        // Duvida
        return distancia / velocidadeMedia;
    }

    @Override
    public String toString() {
        return "Codigo Reconhecimento: " + super.codigoReconhecimento + ", Capacidade De Lotes: "
                + super.capacidadeDeLotes + ", Velocidade média: " + super.velocidadeMedia + ", Codigo de Rota: "
                + this.codigoRota;
    }
}
