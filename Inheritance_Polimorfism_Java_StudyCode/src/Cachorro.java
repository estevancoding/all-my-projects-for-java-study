import java.util.Objects;

public class Cachorro extends Mamifero{


    public Cachorro(double ps, int idd, int mb, String cpl) {
        super(ps, idd, mb, cpl);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo...");
    }

    public void enterrarOsso (){
        System.out.println("Enterrando Osso...");
    }

    public void abanarRabo(){
        System.out.println("Abanando Rabo...");
    }

    public void rosnar(){
        System.out.println("Rosnando...");
    }

    public void reagir(String frase){
        if ((Objects.equals(frase, "Olá garotão")) || (Objects.equals(frase, "toma comida"))){
            abanarRabo();
            emitirSom();
        }else {
            rosnar();
        }
    }

    public void reagir(int h){
        if (h < 12){
            abanarRabo();
            emitirSom();
        } else if (h >= 18){
            rosnar();
        }
    }

    public void reagir(boolean dono){
        if (dono){
            abanarRabo();
        } else {
            rosnar();
            emitirSom();
        }
    }

    public void reagir(int idd, double peso){
        if ((idd < 5) && (peso < 15)){
            emitirSom();
            abanarRabo();
        } if ((idd < 5) && (peso > 15)){
            abanarRabo();
        } if ((idd > 5) && (peso < 15)){
            emitirSom();
        } if ((idd > 5) && (peso > 15)){
            rosnar();
        }
    }





}
