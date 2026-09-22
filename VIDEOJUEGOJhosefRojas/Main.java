public class Main {

    public static void main(String[] args) {
        Guerrero g1 = new Guerrero(10, 1, "Pedro", 1, 100, 100, 0, 100);
        Guerrero g2 = new Guerrero(12, 2, "Juan", 1, 100, 100, 0, 100);

        Mago m1 = new Mago(3, "Ana", 1, 80, 80, 0, 100, 15, 50);
        Mago m2 = new Mago(4, "Lucía", 1, 80, 80, 0, 100, 18, 60);

        Arquero a1 = new Arquero(9, 8, 5, "Carlos", 1, 90, 90, 0, 100);
        Arquero a2 = new Arquero(11, 9, 6, "Elena", 1, 90, 90, 0, 100);

        System.out.println("¡Comienza la batalla!");
        ejecutarBatalla(g1, m1);
        System.out.println("\n¡Comienza la batalla!");
        ejecutarBatalla(a1, g2);
        System.out.println("\n¡Comienza la batalla!");
        ejecutarBatalla(m2, a2);
    }

    public static void ejecutarBatalla(Personaje p1, Personaje p2) {
        while (p1.estaVivo() && p2.estaVivo()) {
            int danoP1 = p1.calcularDano();
            p2.recibirDano(danoP1);
            System.out.println(p1.getNombre() + " inflige " + danoP1 + " puntos de daño a " + p2.getNombre() + ". Puntos de vida restantes: " + p2.getPuntosVida());

            if (!p2.estaVivo()) {
                System.out.println(p2.getNombre() + " ha sido derrotado.");
                break;
            }

            int danoP2 = p2.calcularDano();
            p1.recibirDano(danoP2);
            System.out.println(p2.getNombre() + " inflige " + danoP2 + " puntos de daño a " + p1.getNombre() + ". Puntos de vida restantes: " + p1.getPuntosVida());

            if (!p1.estaVivo()) {
                System.out.println(p1.getNombre() + " ha sido derrotado.");
                break;
            }
        }
    }
}