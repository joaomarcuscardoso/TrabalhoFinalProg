package domain;

public class Cliente {
    private String pais;
    private double dinheiro;

    public Cliente(String pais, double dinheiro) {
        this.pais = pais;
        this.dinheiro = dinheiro;
    }

    public String getPais() {
        return this.pais;
    }

    public double getDinheiro() {
        return this.dinheiro;
    }

    public double utilizarDinheiro(double qtdUsada) {
        if (this.dinheiro >= qtdUsada) {
            this.dinheiro -= qtdUsada;
        }

        return this.dinheiro;
    }

    public double receberDinheiro(double qtdRecebida) {
        if (this.dinheiro <= qtdRecebida) {
            this.dinheiro += qtdRecebida;
        }

        return this.dinheiro;
    }

    public String toString() {
        return "Pais: " + this.pais + ", dinheiro: R$ " + this.dinheiro;
    }
}