/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto20200205;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ProcesadorNumero pro = new ProcesadorNumero();
        pro.mostrarDigitos(59);
        
        ArrayList<DigitoExpandido> lista = pro.descomponerNumero(593);
        for(int i =0 ; i < lista.size() ; i++)
        {
            System.out.println("digito:" + lista.get(i).digito + ",posicion:" + lista.get(i).posicion);
        }*/
        /*
        ProcesadorNumero pro = new ProcesadorNumero();
        int res = pro.invertirNumero(123);
        System.out.println(res);
        */
        
        /* 
        ProcesadorNumero pro = new ProcesadorNumero();
        int res = pro.convertirDesimalABinario(43);
        System.out.println(res);*/
        
        /*
        ProcesadorNumero pro = new ProcesadorNumero();
        pro.decifrarASCII();
        */
        /*
        ProcesadorNumero pro = new ProcesadorNumero();
        pro.convertirNumeroCualquierBaseADecimal("1101", 2);*/
        
        ProcesadorNumero pro = new ProcesadorNumero();
        pro.convertirNumeroCualquierBaseADecimal("108A",16);
        //pro.convertirHexadecimalADecimal("108A");
    }
    
}
