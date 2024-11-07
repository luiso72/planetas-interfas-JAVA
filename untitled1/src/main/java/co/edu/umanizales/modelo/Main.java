package co.edu.umanizales.modelo;

public class Main {
    public static void main(String[] args) {
        Planeta japalindo = new Planeta("Japalindo");
        Planeta raspo = new Planeta("Raspo");
        Planeta verdango = new Planeta("Verdango");

        japalindo.elemenetosAble();
        japalindo.oxigeno();
        japalindo.gas();
        japalindo.tierra();

        System.out.println("Nombre del planeta: " + japalindo.getNombre());

        raspo.elemenetosAble();
        raspo.oxigeno();
        raspo.gas();


        System.out.println("Nombre del planeta: " + raspo.getNombre());
        verdango.elemenetosAble();
        verdango.gas();
        verdango.tierra();

        System.out.println("Nombre del planeta: " + verdango.getNombre());
    }
}