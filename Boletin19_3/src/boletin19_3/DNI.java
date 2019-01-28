/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

/**
 *
 * @author aparcerozas
 */
public class DNI {
    public void calcularLetra(int dni){
        int resto = dni%23;
        String letra = "";
        String[] letras = {"A","B","C","D","E","F","G","H","J","K",
            "L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
        int[] numeros = {3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,
            1,15,0,17,2,10,7,14};
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==resto){
                letra = letras[i];
            }
        }
        System.out.println(dni+letra);
    }
    
}
