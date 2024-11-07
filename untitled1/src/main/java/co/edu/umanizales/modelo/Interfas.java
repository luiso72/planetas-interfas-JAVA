package co.edu.umanizales.modelo;

public interface Interfas {
    void elemenetosAble();

    default void oxigeno() {
        System.out.println("Este planeta tiene oxígeno.");
    }

    default void gas() {
        System.out.println("Este planeta tiene gas.");
    }

     default void tierra() {
        System.out.println("Este planeta tiene tierra.");
    }
}