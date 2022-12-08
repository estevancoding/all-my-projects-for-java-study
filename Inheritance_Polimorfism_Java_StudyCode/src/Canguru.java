public class Canguru extends Mamifero{


    public Canguru(double ps, int idd, int mb, String cpl) {
        super(ps, idd, mb, cpl);
    }

    @Override
    public void locomover() {
        System.out.println("Pulando...");
    }

    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }

}
