package domain;

import domain.Vacina;
import java.util.ArrayList;

public class Mercado {
    private String nome;
    private int qtdVendida;
    private ArrayList<Vacina> vacina;
    private ArrayList<Cliente> cliente;

    public Mercado(String nome, int qtdVendida) {
        this.nome = nome;
        this.qtdVendida = qtdVendida;
        this.vacina  = new ArrayList<Vacina>();
        this.cliente  = new ArrayList<Cliente>();
    }

    public String getNome() {
        return this.nome;
    }

    public int getQtdVendida() {
        return this.qtdVendida;
    }

    private ArrayList<Vacina> imprimirVacina() {
        return this.vacina;
    }

    private ArrayList<Vacina> imprimirVacina(double preco) {
        ArrayList<Vacina> vac = new ArrayList<Vacina>();

        for (int i = 0; i < this.vacina.size(); i++) {
            if (preco == vacina.get(i).getPreco()) {
                vac.add(vacina.get(i));
            }
        }

        return vac;

    }

    public void venderVacina(String codigo) {
        for (int i = 0; i < this.vacina.size(); i++) {
            if (codigo.equalsIgnoreCase(vacina.get(i).getCodigo())) {
                System.out.println(vacina.get(i));
            }
        }

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
    
    public void addCliente(Cliente cliente) {
        this.cliente.add(cliente);
    }

    public String toString() {
        return "Nome: " + this.nome + ", quantidade Vendidas: " + this.qtdVendida;
    }

}
