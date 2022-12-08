public class Ave extends Animal implements AcoesAnimal {

    private String corPenas;

    public Ave(double ps, int idd, int mb, String cpn) {
        super(ps, idd, mb);
        setCorPenas(cpn);
    }



    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String cpn) {
        this.corPenas = cpn;
    }

    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void Alimentar() {
        System.out.println("Bicando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cantando...");
    }
}
