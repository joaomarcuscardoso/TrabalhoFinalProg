/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import domain.Aviao;
import domain.Caminhao;
import domain.Cliente;
import domain.Fabrica;
import domain.Mercado;
import domain.Transporte;
import domain.Vacina;
import domain.Veiculo;

/**
 *
 * @author rfcjo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica fabrica1 = new Fabrica("labTec", "Rua josé de bernades", 200);
        Fabrica fabrica2 = new Fabrica("labUdesc", "Rua joão antonio", 300);
        System.out.println(fabrica1.toString());
        System.out.println(fabrica2.toString());
        System.out.println(fabrica2.toString());
        System.out.println("---------------------------------------------------------------");
        Vacina vac1 = new Vacina("VACBR", "18/12/2020", 10);
        vac1.setCodigo("vec1");
        Vacina vac2 = new Vacina("VACEUA", "24/08/2021", 20);
        vac2.setCodigo("vec2");
        Vacina vac3 = new Vacina("VACIRL", "22/10/2020", 30);
        vac3.setCodigo("vec3");
        
        System.out.println(vac1.toString());
        System.out.println(vac2.toString());
        System.out.println(vac3.toString());
        System.out.println("---------------------------------------------------------------");
        
        fabrica1.addVacina(vac3);
        fabrica1.addVacina(vac1);
        fabrica2.addVacina(vac2);
        
        Transporte trans1 = new Transporte("Itapema");
        Transporte trans2 = new Transporte("Joenvile");
        Transporte trans3 = new Transporte("Itajai");
        System.out.println(trans1.toString());
        System.out.println(trans2.toString());
        System.out.println(trans3.toString());
        System.out.println("---------------------------------------------------------------");      
        
        
        
        Veiculo vec1 = new Caminhao("xxxVACxxx", 100, 85);
        Veiculo vec2 = new Caminhao("zVACzzzzz", 120, 70);
        Veiculo vec3 = new Aviao("xVACFLYxx", 2000, 350);
        
        System.out.println(vec1.toString());
        System.out.println(vec2.toString());
        System.out.println(vec3.toString());
        System.out.println("---------------------------------------------------------------");      
        
              
           
        
        trans1.addVacina(vac3);
        trans1.addVacina(vac2);
        trans1.addVacina(vac1);
        trans2.addVacina(vac2);
        trans3.addVacina(vac1);
        trans1.addVeiculo(vec3);
        trans2.addVeiculo(vec1);
        trans3.addVeiculo(vec2);
        
        Mercado mercadoML = new Mercado("Mercado America Latina", 0);
        mercadoML.addVacina(vac3);
        mercadoML.addVacina(vac1);
        Mercado mercadoMN = new Mercado("Mercado America do Norte", 0);
        
        System.out.println(mercadoML.toString());
        System.out.println(mercadoMN.toString());
        System.out.println("---------------------------------------------------------------");      
        
        

        mercadoMN.addVacina(vac2);
        
        Cliente brasil = new Cliente("Brasil");
        Cliente eua = new Cliente("Estado Unidos");
        Cliente mexico = new Cliente("Mexico");
        Cliente argentina = new Cliente("Argentina");
        Cliente colombia = new Cliente("Colombia");
        Cliente chile = new Cliente("Chile");
        
        
        System.out.println(brasil.toString());
        System.out.println(eua.toString());
        System.out.println(mexico.toString());
        System.out.println(argentina.toString());
        System.out.println(colombia.toString());
        System.out.println(chile.toString());
        System.out.println("---------------------------------------------------------------");      
        
              
        
        
        mercadoML.addCliente(chile);
        mercadoML.addCliente(colombia);
        mercadoML.addCliente(argentina);
        mercadoML.addCliente(brasil);
        
        
        mercadoMN.addCliente(eua);
        mercadoMN.addCliente(mexico);
        
        
        
        
       
    }
    
}
