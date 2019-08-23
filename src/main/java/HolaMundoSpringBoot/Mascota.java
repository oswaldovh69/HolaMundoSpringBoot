package HolaMundoSpringBoot;

public class Mascota{

    private final String nombre;
    private final int edad;

    public Mascota(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }
}