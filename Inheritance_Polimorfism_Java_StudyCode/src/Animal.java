public abstract class Animal {

    private double peso;
    private int idade;
    private int membros;

    public Animal(double ps, int idd, int mb) {
        setIdade(idd);
        setMembros(mb);
        setPeso(ps);
    }
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double ps) {
        this.peso = ps;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idd) {
        this.idade = idd;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int mb) {
        this.membros = mb;
    }


}


