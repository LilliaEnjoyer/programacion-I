public class SistemaCombate {

    // Método estático directo para simular la pelea entre dos personajes cualesquiera
    public static void iniciarPelea(Personajes p1, Personajes p2) {
        System.out.println("\n==================================================");
        System.out.println("⚔️ ¡COMIENZA EL COMBATE: " + p1.getNusuario() + " VS " + p2.getNusuario() + "! ⚔️");
        System.out.println("==================================================");

        int ronda = 1;

        // El combate continúa MIENTRAS ambos personajes estén con vida
        while (p1.conVida() && p2.conVida()) {
            System.out.println("\n--- 🥊 RONDA " + ronda + " ---");

            // --- TURNO DEL PERSONAJE 1 ---
            System.out.println("[" + p1.getNusuario() + " - HP: " + p1.puntosVida() + "] se prepara...");
            p1.atacar(p2); // P1 ataca a P2 (calcula su daño y le aplica dañoRecibido a P2)
            System.out.println("-> Vida restante de " + p2.getNusuario() + ": " + p2.puntosVida());

            // --- TURNO DEL PERSONAJE 2 (Solo si sobrevivió al ataque de P1) ---
            if (p2.conVida()) {
                System.out.println("\n[" + p2.getNusuario() + " - HP: " + p2.puntosVida() + "] contrataca...");
                p2.atacar(p1); // P2 ataca a P1
                System.out.println("-> Vida restante de " + p1.getNusuario() + ": " + p1.puntosVida());
            }

            ronda++;
        }

        System.out.println("\n==================================================");
        System.out.println("🏁 ¡EL COMBATE HA TERMINADO! 🏁");
        
        if (p1.conVida()) {
            System.out.println("🏆 GANADOR: " + p1.getNusuario().toUpperCase());
            p1.ganarxp(100); // Otorgamos los 100 XP que pide el taller
        } else {
            System.out.println("🏆 GANADOR: " + p2.getNusuario().toUpperCase());
            p2.ganarxp(100); // Otorgamos los 100 XP que pide el taller
        }
        System.out.println("==================================================");
    }
}
