public abstract class Pessoa {

    protected String nome;
    protected char sexo;
    protected int idade;
    protected int expreriencia;


    public Pessoa(String nm, char sx, int idd) {
        setNome(nm);
        setSexo(sx);
        setIdade(idd);
        setExpreriencia(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nm) {
        this.nome = nm;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sx) {
        this.sexo = sx;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idd) {
        this.idade = idd;
    }

    public int getExpreriencia() {
        return expreriencia;
    }

    public void setExpreriencia(int exp) {
        this.expreriencia = exp;
    }

    protected void ganharExp() {
        setExpreriencia(getExpreriencia() + 1);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                ", expreriencia=" + expreriencia +
                '}';
    }
}
