package Es;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> colaAtencion = new LinkedList<>();

        colaAtencion.add("Cliente 1");
        colaAtencion.add("Cliente 2");
        colaAtencion.add("Cliente 3");
        colaAtencion.addFirst("Cliente VIP");
        colaAtencion.addLast("Cliente 4");
        colaAtencion.addLast("Ciente MOP");

        System.out.println("Atendiendo a: " + colaAtencion.pollFirst());
        System.out.println("Siguiente en lista: " + colaAtencion.peekFirst());
    }
}