/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicioentornosgit;


public class EjercicioEntornosGit {

    
    public static void main(String[] args) {
        Libro libro1 = new Libro(123456, "La Ruta Prohibida",2007);
        Libro libro2 = new Libro(112233, "Los Otros", 2016);
        Libro libro3 = new Libro(456789, "La rosa del mundo", 1995);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);
        
        libro2.presta();
        if(libro2.estaPrestado()){
            System.out.println("El libro esta prestado");
        }
        libro2.presta();
        libro2.devuelve();
        if (libro2.estaPrestado()){
            System.out.println("El libro esta prestado");
        }
        libro3.presta();
        System.out.println(libro2);
        System.out.println(libro3
        );    }

}
