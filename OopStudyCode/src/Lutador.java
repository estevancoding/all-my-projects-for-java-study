import java.util.Objects;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public Lutador(String nm, String nc, int idd, double al, double ps,  int vt, int dr, int em) {
        this.setNome(nm);
        this.setNacionalidade(nc);
        this.setIdade(idd);
        this.setAltura(al);
        this.setPeso(ps);
        this.setVitorias(vt);
        this.setDerrotas(dr);
        this.setEmpates(em);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nm) {
        this.nome = nm;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nc) {
        this.nacionalidade = nc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idd) {
        this.idade = idd;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double al) {
        this.altura = al;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double ps) {
        this.peso = ps;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {

        if (this.peso < 52.2){
            this.categoria = "Invalido";
        }else if (this.peso <= 78.3){
            this.categoria = "leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (this.peso <= 135) {
            this.categoria = "Pesado";
        }else {
            this.categoria = "Invalido";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vt) {
        this.vitorias = vt;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int dr) {
        this.derrotas = dr;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    public void apresentar() {




            System.out.println("Esse lutador vem direto de: " + this.getNacionalidade());
            System.out.println("Com uma Altura de: " + this.getAltura() + "M");
            System.out.println("Pesando incriveis: " + this.getPeso() + "Kg");
            System.out.println("Concorrendo na Categoria: " + this.getCategoria());
            System.out.println("Vitorias: " + this.getVitorias() + " Derrotas: " + this.getDerrotas() + " Empates: " + this.getEmpates());
            System.out.println("Senhoras e Senhores uma salva de palmas a:  " + this.getNome());




    }

    public void status(){

        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());


    }

    public void ganharLuta(){
        this.vitorias = getVitorias() + 1;
    }

    public void perderLuta(){
        this.derrotas = getDerrotas() + 1;
    }

    public void empatarLuta(){
        this.empates = getEmpates() + 1;
    }

}
