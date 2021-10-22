import java.io.Serializable;
import java.util.ArrayList;

//Realizado por: Pablo Matta
class Cancion extends ArrayList<Cancion> implements Serializable {

    String nombre;
    int duracion;
    String autor;
    public Cancion(){

    }


    public Cancion(String nombre, int duracion, String autor) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrar(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Duracion: "+this.duracion);
        System.out.println("Autor: "+this.autor);
    }
}
//Realizado por: Jorge Otín Caba