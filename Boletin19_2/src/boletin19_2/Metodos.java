/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Metodos {
    public Alumno[] crearArray(Alumno[] clase){
        for(int i=0;i<clase.length;i++){
            Alumno persona = new Alumno();
            persona.setNome(JOptionPane.showInputDialog("Introduzca o nome:"));
            persona.setNota((int)(Math.random()*10+1));
            clase[i] = persona;
        }
        return clase;
    }
    
    public void mostrar(Alumno[] clase){
        for (Alumno clase1 : clase) {
            System.out.println(clase1.toString());
        }
    }
    
    public void aprobados(Alumno[] clase){
        int contador = 0;
        for (Alumno clase1 : clase) {
            if (clase1.getNota() >= 5) {
                contador++;
            }
        }
        System.out.println("Aprobados: " + contador);
    }
    
    public void suspensos(Alumno[] clase){
        int contador = 0;
        for (Alumno clase1 : clase) {
            if (clase1.getNota() < 5) {
                contador++;
            }
        }
        System.out.println("Suspensos: " + contador);
    }
    
    public void notaMedia(Alumno[] clase){
        int suma = 0;
        for (Alumno clase1 : clase) {
            suma = suma + clase1.getNota();
        }
        System.out.println("Nota media: " + suma/clase.length);
    }
    
    public void notaMaisAlta(Alumno[] clase){
        int alta = 0;
        for (Alumno clase1 : clase) {
            if (clase1.getNota() > alta) {
                alta = clase1.getNota();
            }
        }
        System.out.println("Nota máis alta: " + alta);
    }
    
    public void visualizarNota(Alumno[] clase, String nome){
        for (Alumno clase1 : clase) {
            if (nome.equals(clase1.getNome())) {
                System.out.println("O alumno " + clase1.getNome() + " ten unha nota de " + clase1.getNota());
            }
        }
    }
    
    public void visualizarNotaTeclado(Alumno[] clase){
        String nome = JOptionPane.showInputDialog("Introduzca o nome:");
        for (Alumno clase1 : clase) {
            if (clase1.getNome().equals(nome)) {
                System.out.println("O alumno " + clase1.getNome() + " ten unha nota de " + clase1.getNota());
            }
        }
    }
    
    public void listaAprobados(Alumno[] clase){
        System.out.println("Aprobados:");
        for (Alumno clase1 : clase) {
            if (clase1.getNota() >= 5) {
                System.out.println(clase1.getNome());
            }
        }
    }
    
    public void notasOrdenadas(Alumno[] clase){
        int[] notas = new int[clase.length];
        int aux = 0;
        for(int i=0;i<clase.length;i++){
            notas[i]=clase[i].getNota();
        }
        for(int i=0;i<notas.length-1;i++){
            for(int j=0;j<notas.length-1;j++){
                if(notas[j]>notas[j+1]){
                aux = notas[j+1];
                notas[j+1] = notas[j];
                notas[j] = aux;
                }
            }
        }
        for(int i=0;i<notas.length;i++){
            System.out.println(notas[i]);
        }
        
    }
    
}
