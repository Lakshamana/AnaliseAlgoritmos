package analisealgoritmos.questoes;

import analisealgoritmos.ordenador.GeradorVetores;
import analisealgoritmos.ordenador.Ordenador;

public abstract class Questao {
    private MarcadorTempo marcador;
    private GeradorVetores g;
    
    protected int sum(long[] a){
        int s = 0;
        for(int i = 0; i < a.length; i++)
            s += a[i];
        return s;
    }
    
    public Questao(MarcadorTempo t){
        marcador = new MarcadorTempo();
        g = new GeradorVetores();
        this.marcador = t;
    }
    
    public abstract void run();

    protected void impl(Ordenador alg, int k, int n){
        long[] m1, m2, m3;
        m1 = new long[n];
        m2 = new long[n];
        m3 = new long[n];
        for (int i = 0; i < n; i++) {
            int[] v1 = getG().generate(k, 1000);
            System.out.println("\nRodada " + (i + 1) + ":");
            System.out.println("Vetor: " + k + " : 1000");
            getMarcador().setV(v1);
            getMarcador().marcar(alg);
            System.out.println("Tempo total de execução: " + getMarcador()
                    .getElapsed() + "ms");
            m1[i] = getMarcador().getElapsed();
            System.out.println("+------------------------------+");
            int[] v2 = getG().generate(k, 100000);
            System.out.println("Vetor: " + k + " : 100.000");
            getMarcador().setV(v2);
            getMarcador().marcar(alg);
            System.out.println("Tempo total de execução: " + getMarcador()
                    .getElapsed() + "ms");
            m2[i] = getMarcador().getElapsed();
            System.out.println("+------------------------------+");
            int[] v3 = getG().generate(k, 1000000);
            System.out.println("Vetor: " + k + " : 1.000.000");
            getMarcador().setV(v3);
            getMarcador().marcar(alg);
            System.out.println("Tempo total de execução: " + getMarcador()
                    .getElapsed() + "ms");
            m3[i] = getMarcador().getElapsed();
            System.out.println("+------------------------------+");
        }
    
    System.out.println ("\n+--------------------------------------------------+");
    System.out.println (
        "|           * Médias totais dos algoritmos *       |");
    System.out.println (
        "|Média de execução para 1000 elementos: " + (float)(sum(m1)) / n);
    System.out.println (
        "|Média de execução para 100.000 elementos: " + (float) (sum(m2)) / n);
    System.out.println (
        "|Média de execução para 1.000.000 elementos: " + (float) (sum(m3)) / n);
    System.out.println (
        "+--------------------------------------------------+\n");
    }
    
    public MarcadorTempo getMarcador() {
        return marcador;
    }

    public GeradorVetores getG() {
        return g;
    }
}
