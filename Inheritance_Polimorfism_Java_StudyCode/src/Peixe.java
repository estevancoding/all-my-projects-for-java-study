public class Peixe extends Animal implements AcoesAnimal{

    private String corEscama;

    public Peixe(double ps, int idd, int mb, String ces) {
        super(ps, idd, mb);
        setCorEscama(ces);
    }


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String ces) {
        this.corEscama = ces;
    }

    public void soltarBolhas() {
        System.out.println("Soltando bolhas...");
    }


    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void Alimentar() {
        System.out.println("Comendo moluscos...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de peixe...");
    }
}
