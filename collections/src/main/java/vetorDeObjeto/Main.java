package vetorDeObjeto;

public class Main {
    public static void main(String[] args) {
        Carro [] carros = new Carro[5];
        String[] modeloCarros = {"Supra", "HB20", "Corsa", "Santana", "Celta"};

        for (int i = 0; i < modeloCarros.length ; i++) {

            carros[i] = new Carro(modeloCarros[i]);

        }

        for (Carro carroVez : carros ) {

            System.out.println(carroVez.toString());

        }


    }
}