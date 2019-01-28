/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

/**
 *
 * @author aparcerozas
 */
public class Boletin19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos x = new Metodos();
        Alumno[] clase = new Alumno[8];
        x.crearArray(clase);
        x.mostrar(clase);
        x.notasOrdenadas(clase);
//        x.aprobados(clase);
//        x.suspensos(clase);
//        x.notaMedia(clase);
//        x.notaMaisAlta(clase);
//        x.visualizarNota(clase, "pedro");
//        x.listaAprobados(clase);
//        x.visualizarNotaTeclado(clase);
    }
    
}
