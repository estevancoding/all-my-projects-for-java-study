public class Main {
    public static void main(String[] args) {

        //Testing Features

        Video[] v1 = new Video[3];
        v1[0] = new Video("Aula 1");
        v1[1] = new Video("Aula 2");
        v1[2] = new Video("Aula 3");


        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Rafael", 'M', 22, "Rafamatos02");
        g[1] = new Gafanhoto("Juliana", 'F', 17, "jufernandes67");

        System.out.println("-----------------------------------\nPessoas\n");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

        System.out.println("-----------------------------------\nVideos\n");
        System.out.println(v1[0].toString());
        System.out.println(v1[1].toString());
        System.out.println(v1[2].toString());

        Visualizacao[] vis = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v1[2]);
        vis[0].avaliar(67f);
        vis[1] = new Visualizacao(g[1], v1[1]);
        vis[1].avaliar(4);
        vis[2] = new Visualizacao(g[1], v1[0]);
        vis[2].avaliar();

        System.out.println("-----------------------------------\nVisualização\n");
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());




    }
}