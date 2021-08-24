package domain;


import java.util.ArrayList;

public class Distribuicao {
    private String cidade;
    private String estado;
    private int pessoasVacinadas;
    private ArrayList<Vacina> vacina;

    public Distribuicao(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
        this.vacina = new ArrayList<Vacina>();
    }

    public int getPessoasVacinadas() {
        return this.pessoasVacinadas;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void addVacina(Vacina vac) {
        this.vacina.add(vac);
    }

    public boolean removerLote(String codigo) {
        for (int i = 0; i < this.vacina.size(); i++) {
            if (codigo.equalsIgnoreCase(vacina.get(i).getCodigo())) {
                this.pessoasVacinadas += this.vacina.get(i).getQtdLote();
                this.vacina.remove(this.vacina.get(i));
                return true;
            }
        }

        return false;

    }

    public String toString() {
        return "Cidade: " + this.cidade + ", Estado: " + this.estado + ", Pessoas Vacinadas: " + this.pessoasVacinadas;
    }

}
