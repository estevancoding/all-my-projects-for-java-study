public class Reptil extends Animal implements AcoesAnimal {

    private String corEscama;

    public Reptil(double ps, int idd, int mb, String ces) {
        super(ps, idd, mb);
        setCorEscama(ces);
    }


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String ces) {
        this.corEscama = ces;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void Alimentar() {
        System.out.println("Comendo vegetais...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Reptil...");
    }
}
