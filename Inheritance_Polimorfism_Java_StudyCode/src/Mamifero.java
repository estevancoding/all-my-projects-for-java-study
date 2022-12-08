public class Mamifero extends Animal implements AcoesAnimal {

    private String corPelo;

    public Mamifero(double ps, int idd, int mb, String cpl) {
        super(ps, idd, mb);
        setCorPelo(cpl);
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "corPelo='" + corPelo + '\'' +
                '}';
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String cpl) {
        this.corPelo = cpl;
    }

    @Override
    public void locomover() {
        System.out.println("Andando...");
    }

    @Override
    public void Alimentar() {
        System.out.println("Mamamndo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Mamifero...");
    }
}
