public class Tartaruga extends Reptil{

    private String corCasco;

    public Tartaruga(double ps, int idd, int mb, String ces, String cc) {
        super(ps, idd, mb, ces);
        ces = "Não tem escamas";
        setCorEscama(ces);
        setCorCasco(cc);
    }

    public String getCorCasco() {
        return corCasco;
    }

    public void setCorCasco(String cc) {
        this.corCasco = cc;
    }

    @Override
    public void locomover() {
        System.out.println("Andando Devagar...");
    }
}
