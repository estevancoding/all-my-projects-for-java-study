public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao;
    private long views;
    private long curtidas;
    private boolean reporduzindo;

    public Video(String ttl) {
        setTitulo(ttl);
        setAvaliacao(0);
        setCurtidas(0);
        setViews(0);
        setReporduzindo(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String ttl) {
        this.titulo = ttl;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int num) {
        if ((num > 0) && (num < 6)){
            this.avaliacao = num;
        }else if (num >= 6){
            this.avaliacao = 5;
        }else if (num <= 0 ) {
            this.avaliacao = 1;
        }

    }

    public long getViews() {
        return views;
    }

    public void setViews(long vw) {
        this.views = vw;
    }

    public long getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(long crt) {
        this.curtidas = crt;
    }

    public boolean isReporduzindo() {
        return reporduzindo;
    }

    public void setReporduzindo(boolean rpd) {
        this.reporduzindo = rpd;
    }

    @Override
    public void play() {
        if (!isReporduzindo()){
            System.out.println("Despausando...");
            setReporduzindo(true);
        }else {
            System.out.println("Já está reproduzindo");
        }

    }

    @Override
    public void pause() {
        if (isReporduzindo()){
            System.out.println("Pausando...");
            setReporduzindo(false);
        }else {
            System.out.println("Já está pausado");
        }
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reporduzindo=" + reporduzindo +
                '}';
    }
}
