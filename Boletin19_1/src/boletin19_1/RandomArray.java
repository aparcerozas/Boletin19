/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_1;

/**
 *
 * @author aparcerozas
 */
public class RandomArray {
    public int[] crearArray(int[] lista){
        for(int i=0;i<6;i++){
            lista[i]=(int) (Math.random()*50+1);
        }
        for(int i=5;i>=0;i--){
            System.out.println(lista[i]);
        }
        return lista;
    }
}
