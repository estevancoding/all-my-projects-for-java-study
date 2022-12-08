import java.util.Objects;
import java.util.Random;
public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;

    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador df) {
        this.desafiado = df;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador dd) {
        this.desafiante = dd;
    }

    public int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    public void marcarLuta(Lutador l1, Lutador l2){

        setDesafiado(l1);
        setDesafiante(l2);

        if (desafiante != desafiado){

            if (Objects.equals(desafiante.getCategoria(), desafiado.getCategoria())){

                System.out.println("Luta Aprovada e Marcada");
                setAprovada(true);

            }else {

                System.out.println("A categiria dos lutadores é diferente, logo esta luta não pode ocorrer");
                setAprovada(false);
                this.setDesafiante(null);
                this.setDesafiado(null);
            }

        }else {

            System.out.println("Não é possível marcar uma luta entre a mesma pessoa");
            setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }

    }

    public void Lutar(){

        if (isAprovada()){

            System.out.println("---------------------------------------------------------------------");
            System.out.println("                     WELCOME TO LTP                                  ");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("PARTICIPANTE N1°");
            this.desafiante.apresentar();
            System.out.println("--------------------------------------------------------------------");
            System.out.println("PARTICIPANTE N2°");
            this.desafiado.apresentar();
            System.out.println("--------------------------------------------------------------------");
            System.out.println("                           ITS SHOWTIME                             ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("");
            Random vencedor = new Random();

            int numSort = vencedor.nextInt(3);

            if (numSort == 0){

                System.out.println("O VENCEDOR DA LUTA FOI: " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();

            }else if(numSort == 1) {

                System.out.println("O VENCEDOR DA LUTA FOI: " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            } else {
                System.out.println("A LUTA FOI UM EMPATE");
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
            }


        }else{

            System.out.println("Não é iniciar a luta pois ela não foi aprovada");

        }

    }

}
