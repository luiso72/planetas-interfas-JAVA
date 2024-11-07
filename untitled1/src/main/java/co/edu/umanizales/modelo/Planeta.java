package co.edu.umanizales.modelo;

public class Planeta implements Interfas {
    private String nombre;

    public Planeta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void elemenetosAble() {
        System.out.println("Este planeta tiene elementos activos.");
    }

    public String getNombre() {
        return nombre;
    }
}