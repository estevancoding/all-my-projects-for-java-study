public class Gafanhoto extends Pessoa{

    private String login;
    private int totAssistido;

    public Gafanhoto(String nm, char sx, int idd, String lg) {
        super(nm, sx, idd);
        setLogin(lg);
        setTotAssistido(0);
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String lg) {
        this.login = lg;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int tta) {
        this.totAssistido = tta;
    }

    public void viumaisum(){
        setTotAssistido(getTotAssistido() + 1);
    }


    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                ", expreriencia=" + expreriencia +
                '}';
    }
}
