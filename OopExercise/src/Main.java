public class Main {
    public static void main(String[] args) {

        Pessoa[] P = new Pessoa[3];

        P[0] = new Pessoa("Mariana", 24, 'f');
        P[1] = new Pessoa("Luara", 14, 'f');
        P[2] = new Pessoa("Marcos", 16, 'm');

        Livro[] L = new Livro[4];

         L[0] = new Livro("Duna", "carlao", 1000);
         L[1] = new Livro("É assim que acaba", "carlao", 350);
         L[2] = new Livro("Senhor dos Anéis", "carlao", 456);
         L[3] = new Livro("Poppy war", "carlao", 1234);


         // TESTING FEATURES

         L[0].pegarParaLer(P[1]);

         L[0].avancarPag();
         L[0].avancarPag();

         L[0].abrir();


         for (int i = 0; i < 5; i++) {
             L[0].avancarPag();
         }

        L[0].fechar();

        L[0].voltarPag();
        L[0].voltarPag();
        L[0].voltarPag();


        System.out.println(L[0].detalhes());

        L[0].devolver(P[2]);

        L[0].devolver(P[1]);

        System.out.println(L[0].detalhes());

        L[0].folhear();

        System.out.println(P[1].getIdade());

        for (int k = 0; k < 8; k++) {
            P[1].fazerAniver();
        }





    }
}