package VetorComoParametro;

public class Main {

    public static void main(String[] args) {

        int[] numeros = {19, 16, 12, 6, 14, 9, 2, 10, 74, 34, 72, 64};

        parimpar(numeros);

    }
    public static void parimpar(int[] n){

        for (int n2: n
             ) {
            if(n2%2 == 0){

                System.out.println(n2 + " é par");

            }else{
                System.out.println(n2 + " é impar");
            }
        }
    }
}
