import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int tentativas = 0;

        System.out.println("-------------------------------------");
        System.out.println("           JOGO DO ACERTO            ");
        System.out.println("-------------------------------------");
        System.out.print("\n\nDIGITE O NÙMERO MISTERIOSO: ");

        int numeroAcerto = ler.nextInt();
        while ((numeroAcerto > 1000) || (numeroAcerto < 0)){

            System.out.print("APENAS UM NUMERO ENTRE 0 e 1000 POR FAVOR: ");
            numeroAcerto = ler.nextInt();
        }
        System.out.print("POR FAVOR DIGITE UMA TENTATIVA: ");
        int numeroChute= ler.nextInt();
        while ((numeroChute > 1000) || (numeroChute < 0)){

            System.out.print("APENAS UM NUMERO ENTRE 0 e 1000 POR FAVOR: ");
            numeroChute = ler.nextInt();
        }

       do {

           tentativas = tentativas + 1;

           if (numeroChute > numeroAcerto){

               System.out.println("O NUMEROO " + numeroChute + " È MAIOR DO QUE O NUMERO MISTERIOSO");

               System.out.print("POR FAVOR DIGITE UM NOVO CHUTE: ");
               numeroChute= ler.nextInt();
               while ((numeroChute > 1000) || (numeroChute < 0)){

                   System.out.print("APENAS UM NUMERO ENTRE 0 e 1000 POR FAVOR: ");
                   numeroChute = ler.nextInt();
               }

           }

           if (numeroChute < numeroAcerto){

               System.out.println("O NUMEROO " + numeroChute + " È MENOR DO QUE O NUMERO MISTERIOSO");

               System.out.print("POR FAVOR DIGITE UM NOVO CHUTE: ");
               numeroChute= ler.nextInt();
               while ((numeroChute > 1000) || (numeroChute < 0)){

                   System.out.print("APENAS UM NUMERO ENTRE 0 e 1000 POR FAVOR: ");
                   numeroChute = ler.nextInt();
               }

           }




        } while (numeroChute != numeroAcerto);


        System.out.println("-------------------------------------");
        System.out.println("           VOCÊ ACERTOU              ");
        System.out.println("          O NUMERO ERA: " + numeroAcerto);
        System.out.println("           TENTATIVAS : " + tentativas);
        System.out.println("-------------------------------------");


    }

}