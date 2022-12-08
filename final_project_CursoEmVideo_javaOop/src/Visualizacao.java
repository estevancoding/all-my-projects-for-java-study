public final class Visualizacao {

    private  Gafanhoto espectador;
    private Video video;

    public Visualizacao(Gafanhoto epc, Video vd) {
       setEspectador(epc);
       setVideo(vd);
       this.espectador.viumaisum();
       this.video.setViews(this.video.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto epc) {
        this.espectador = epc;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video vd) {
        this.video = vd;
    }

    public void avaliar(){
        this.video.setAvaliacao(5);
    }

    public void avaliar(int num){
        this.video.setAvaliacao(num);
    }

    public void avaliar(float porc){

        if (( porc < 0) || (porc > 100)){
            System.out.println("Só é possível avaliar com uma porcentagem entre 0 e 100");
        } else if ((porc <= 19) && (porc >= 0)){
            this.video.setAvaliacao(1);
        }else if ((porc <= 39) && (porc >= 20)){
            this.video.setAvaliacao(2);
        }else if ((porc <= 59) && (porc >= 40)){
            this.video.setAvaliacao(3);
        }else if ((porc <= 79) && (porc >= 60)){
            this.video.setAvaliacao(4);
        }else if ((porc <=100) && (porc >= 80)){
            this.video.setAvaliacao(5);
        }

    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador.toString() +
                ", video=" + video +
                '}';
    }



}
