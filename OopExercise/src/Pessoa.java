public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;

    private boolean lendo;

    public Pessoa(String nm, int idd, char sx) {
        setNome(nm);
        setIdade(idd);
        setSexo(sx);
    }

    public void fazerAniver(){
        System.out.println("----------------------------------------------");
        System.out.println("PARABENS !!! " + getNome());
        System.out.println("Hoje é seu aniversário, e você acaba de ficar mais velho");
        System.out.println("------------------------------------------------------------------");
        System.out.println("               FELIZ " + (getIdade() + 1) + " ANOS !!!                  ");
        setIdade(getIdade() + 1);
    }

    public boolean isLendo() {
        return lendo;
    }

    public void setLendo(boolean lendo) {
        this.lendo = lendo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nm) {
        this.nome = nm;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idd) {
        this.idade = idd;
    }

    public String getSexo() {
        String sexo = null;
        
        if ((this.sexo == 'F') || (this.sexo == 'f')){
           sexo = "Feminino";
        }else if ((this.sexo == 'M') || (this.sexo == 'm')) {
            sexo = "Masculino";
        }else {
            sexo = "Não foi capaz de exibir o sexo, pois o mesmo não está cadastrado";
        }
            return sexo;
        
    }

    public void setSexo(char sx) {
        if ((sx != 'M') && (sx != 'm') && (sx != 'F') && (sx != 'f')){
            System.out.println("Não foi possível, pois o sexo não foi selecionado entre feminino e masculino");
        }else {
            this.sexo = sx;
        }

    }
}
