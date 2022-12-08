import java.util.Random;
public class Main {
    public static void main(String[] args) {


    Lutador[] L = new Lutador[6];

        L[0] = new Lutador("Luke SkyWalker", "Naboo", 31, 1.75, 68.3,11, 2, 1);
        L[1] = new Lutador("Che Guevara", "Argentina", 29, 1.68, 57.8, 14, 2, 3);
        L[2] = new Lutador("RaposoNãoPegue", "cartoonlandia", 18, 1.32, 57.5, 12, 2, 1);
        L[3] = new Lutador("Ronaldo Fenômeno", "Brasil", 42, 1.65, 81.9, 13, 0, 2);
        L[4] = new Lutador("DR. Vegapunk", "North Blue", 57, 2.00, 119.0, 5, 0, 6);
        L[5] = new Lutador("Mc Bin Laden", "São Paulo Meu País", 27, 1.85, 128.5,7, 1, 3);

       Luta MULTICHAMP = new Luta();

        //TESTING FEATURES
        
        
       MULTICHAMP.marcarLuta(L[1], L[0]);
       MULTICHAMP.Lutar();

       
        L[1].status();
        System.out.println("---------------------------------------------------------------------");
        L[0].status();
    }
}
