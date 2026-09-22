public class Main {
    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println("🎮 INICIALIZANDO PROTOTIPO DE SISTEMA DE COMBATE 🎮");
        System.out.println("==================================================");


        Guerrero conan = new Guerrero(1, "Conan", 1, 100, 15);
        Guerrero aragorn = new Guerrero(2, "Aragorn", 1, 120, 12);

        Mago gandalf = new Mago(3, "Gandalf", 1, 70, 18, 40);
        Mago voldemort = new Mago(4, "Voldemort", 1, 65, 22, 20);

        Arquero legolas = new Arquero(5, "Legolas", 1, 85, 10, 8);
        Arquero robin = new Arquero(6, "Robin Hood", 1, 80, 11, 7);

        System.out.println("\n¡Personajes creados con exito! Que comiencen las pruebas.");



        SistemaCombate.iniciarPelea(conan, gandalf);



        SistemaCombate.iniciarPelea(legolas, voldemort);



        SistemaCombate.iniciarPelea(robin, aragorn);



        if (conan.conVida()) {
            System.out.println("\n[Combate Especial para verificar Subida de Nivel]");

            SistemaCombate.iniciarPelea(conan, aragorn);
        }
        
        System.out.println("\n==================================================");
        System.out.println("   PROTOTIPO FINALIZADO - PRUEBAS COMPLETADAS    ");
        System.out.println("==================================================");
    }
}
