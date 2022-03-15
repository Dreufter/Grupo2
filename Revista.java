/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author javij
 */
public class Revista extends Publicacion{
    int num;
    public Revista(int isbn,String ti, int a,int n){
        this.ISBN = isbn;
        this.titulo = ti;
        this.añoPublicacion = a;
        this.num = n;
    }
    public String toString(){
        String mensaje = "ISBN: " + ISBN + ", título: " + titulo + ", año de publicación: " + añoPublicacion ;
        return mensaje;
    }
}
