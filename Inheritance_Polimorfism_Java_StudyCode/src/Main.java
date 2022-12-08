public class Main {
    public static void main(String[] args) {

        //Testing Features

        Tartaruga t1 = new Tartaruga(12, 80, 4, "verde", "Marrom");

        System.out.println(t1.getPeso());

        t1.locomover();

        Cachorro c1 = new Cachorro(12, 8, 4, "cinza");

        c1.locomover();
        c1.emitirSom();
        c1.abanarRabo();

        c1.reagir(6);
        c1.reagir(14);
        c1.reagir(18);
        System.out.println("---------------------");
        c1.reagir(false);
        c1.reagir(true);
        System.out.println("---------------------");
        c1.reagir("toma comida");
        c1.reagir("malvado");
        System.out.println("---------------------");
        c1.reagir(3, 12);
        c1.reagir(3, 15);
        c1.reagir(8, 12);
        c1.reagir(8, 15);


        Canguru cn1 = new Canguru(12, 8, 4, "bege");

        cn1.usarBolsa();
        cn1.locomover();
        cn1.emitirSom();

        GoldFish p1 = new GoldFish(2, 4, 2, "dslaldalsd");

        p1.Alimentar();
        System.out.println(p1.getCorEscama());
        p1.locomover();
        p1.soltarBolhas();

    }
}