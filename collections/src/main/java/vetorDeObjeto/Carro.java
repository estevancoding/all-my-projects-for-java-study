package vetorDeObjeto;

public class Carro {

    private String nome;
    private boolean ligado;
    private boolean destruido;
    private int blindagem;
    private boolean armamento;

    public Carro(String nm) {
        this.setNome(nm);
        setLigado(false);
        setDestruido(false);
        setBlindagem(0);
        this.setArmamento(false);
    }

    public void sofrerDano(int dano){
        this.blindagem -= dano;

        if (blindagem <= 0){
            this.setBlindagem(0);
            this.setDestruido(true);
            this.setLigado(false);
        }

    }

    @Override
    public String toString() {
        return "---------------------------------------------\nCarro: \n" +
                "Nome: " + getNome() +
                "\n Ligado: " + isLigado() +
                "\n Destruido: " + isDestruido() +
                "\n Blindagem: " + getBlindagem() + "%" +
                "\n Armamento: " + isArmamento();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean lgd) {
        this.ligado = lgd;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean dstr) {
        this.destruido = dstr;
    }

    public int getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(int bldg) {
        this.blindagem = bldg;
    }

    public boolean isArmamento() {
        return armamento;
    }

    public void setArmamento(boolean armnt) {
        this.armamento = armnt;
    }
}
