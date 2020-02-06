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
public class ProcesadorNumero {
    
    public void mostrarDigitos(int numero){
        String numeroString = "" + numero;
        for(int i = 0; i < numeroString.length() ; i++)
        {
            char digito = numeroString.charAt(i);
            System.out.println(digito + ",posicion " + i);
        }
       
    }
    
    public ArrayList<DigitoExpandido> descomponerNumero(int numero){
        int cociente = numero;
        int numeAux = numero;
        int digito;
        int posicion = 0;
        ArrayList<DigitoExpandido> listaDigitos = new ArrayList<>();
                
        while(cociente != 0)
        {
            digito = cociente % 10;
            cociente = cociente / 10;
            DigitoExpandido miDigito = new DigitoExpandido(digito, posicion);
            listaDigitos.add(miDigito);
            posicion++;        
        }
        return listaDigitos;
        
    }
    public int invertirNumero(int numero)
    {
        String numeroString = "" + numero;
        String numeroAux = "";
        int lengthNumero = numeroString.length()-1;
        for(int i = 0; i < numeroString.length(); i++)
        {
            numeroAux = numeroAux + numeroString.charAt(lengthNumero);
            lengthNumero--;
        }
        int res = Integer.parseInt(numeroAux);
        return res;
    }
    
    public int convertirDesimalABinario(int numero)
    {
        int cociente = numero;
        String resAux = "";
        int digito;              
        while(cociente != 0)
        {
            digito = cociente % 2;
            cociente = cociente / 2;
            resAux = digito + resAux;        
        }
        int res = Integer.parseInt(resAux);
        return res;
    }
    
    public int convertirNumeroCualquierBaseADecimal(String numero, int base)
    {
        int res = 0 ;
        switch(base)
        {
            case 2:
                res = convertirBinarioADecimal(numero);
                break;
            case 16:
                res = convertirHexadecimalADecimal(numero);
                System.out.println("hexadecimal");
                break;
        }
        return res;
    }
    
    public int convertirBinarioADecimal(String numero)
    {
        int numeroRes = 0;
        int posicionFinal = numero.length() - 1;
        for(int i = 0; i < numero.length() ; i++)
        {
            int numAux = Integer.parseInt(Character.toString(numero.charAt(posicionFinal)));
            numeroRes = numeroRes + (numAux*((int) Math.pow(2,i)));
            posicionFinal--;
        }
        return numeroRes;
    }
    
    public int convertirHexadecimalADecimal(String numero)
    {
        int numeroRes = 0;
        int posicionFinal = numero.length() - 1;
        for(int i = 0; i < numero.length() ; i++)
        {
            int numAscii = numero.charAt(posicionFinal);
            System.out.println("acii :" + numAscii);
            int numAux = 0;
            if( numAscii > 47 && numAscii < 58)
            {
                numAux = Integer.parseInt(Character.toString(numero.charAt(posicionFinal)));
            }
            else
            {
                switch(numAscii)
                {
                    case 65:
                        numAux = 10;
                        break;
                    case 66:
                        numAux = 11;
                        break;
                    case 67:
                        numAux = 12;
                        break;
                    case 68:
                        numAux = 13;
                        break;
                    case 69:
                        numAux = 14;
                        break;
                    case 70:
                        numAux = 15;
                        break;  
                }
            }
            numeroRes = numeroRes + (numAux*((int) Math.pow(16,i)));
            posicionFinal--;
        }
        System.out.println(numeroRes);
        return numeroRes;
    }
    
    
    
    public String decifrarASCII()
    {
        int[] mensaje = {34,66,105,101,110,118,101,110,105,100,111,115,32,97,32,108,97,32,70,117,110,100,97,99,105,111,110,32,74,97,108,97,32,58,45,41,33,34};
        String mensajeRes = "";
        for(int i = 0; i < mensaje.length ; i++)
        {
            char letra = (char)mensaje[i];
            mensajeRes = mensajeRes + letra;
        }
        System.out.println(mensajeRes);
        return mensajeRes;
    }
   
    
}
