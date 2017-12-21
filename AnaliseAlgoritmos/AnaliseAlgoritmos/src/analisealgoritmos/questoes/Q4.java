
package ordenação;

public class Q4 extends Questao{
    CountingSort cs = new CountingSort();
    QuickSort qs = new QuickSort();
    public Q4(MarcadorTempo t){
        super(t);
    }
    
    @Override
    public void run() {
        long media;
        int n = 100;
        media = 0;
        System.out.println("CountingSort: Ordem Crescente");
        for(int k = 1; k < 11; k++){
            for(int j = 0; j < n; j++){
                int [] v1 = getG().generate(1, k*100);
                getMarcador().setV(v1);

                getMarcador().marcar(cs);

                media = media + getMarcador().getElapsed();
            }
            media /= n;
            System.out.println("Vetor: 1 : "+ k*100+" posiçõe");
            System.out.println("Tempo medio de execução: " + media + "ms");
        }
        System.out.println();
        //-----------------------------------
        media = 0;
        System.out.println("CountingSort: Ordem Decrescente");
        for(int k = 1; k < 11; k++){
            for(int j = 0; j < n; j++){
                int [] v1 = getG().generate(2, k*100);
                getMarcador().setV(v1);

                getMarcador().marcar(cs);

                media = media + getMarcador().getElapsed();
            }
            media /= n;
            System.out.println("Vetor: 2 : "+ k*100+" posiçõe");
            System.out.println("Tempo medio de execução: " + media + "ms");
        }
        System.out.println();
        //-----------------------------------
        media = 0;
        System.out.println("CountingSort: Desordenado");
        for(int k = 1; k < 11; k++){
            for(int j = 0; j < n; j++){
                int [] v1 = getG().generate(3, k*100);
                getMarcador().setV(v1);

                getMarcador().marcar(cs);

                media = media + getMarcador().getElapsed();
            }
            System.out.println("Vetor: 3 : "+ k*100+" posiçõe");
            media /= n;
            System.out.println("Tempo medio de execução: " + media + "ms");
        }
        System.out.println();
        //-----------------------------------
        System.out.println("QuickSort: Ordem Crescente");
        media = 0;
        for(int k = 1; k < 11; k++){
            for(int j = 0; j < n; j++){
                int [] v1 = getG().generate(1, k*100);
                getMarcador().setV(v1);

                getMarcador().marcar(qs);

                media = media + getMarcador().getElapsed();
            }
            System.out.println("Vetor: 1 : "+ k*100+" posiçõe");
            media /= n;
            System.out.println("Tempo medio de execução: " + media + "ms");
        }
        System.out.println();
        //-----------------------------------
        System.out.println("QuickSort: Ordem Decrescente");
        media = 0;
        for(int k = 1; k < 11; k++){
            for(int j = 0; j < n; j++){
                int [] v1 = getG().generate(2, k*100);
                getMarcador().setV(v1);

                getMarcador().marcar(qs);

                media = media + getMarcador().getElapsed();
            }
            System.out.println("Vetor: 2 : "+ k*100+" posiçõe");
            media /= n;
            System.out.println("Tempo medio de execução: " + media + "ms");
        }
        System.out.println();
        //-----------------------------------
        System.out.println("QuickSort: Desordenado");
        media = 0;
        for(int k = 1; k < 11; k++){
            for(int j = 0; j < n; j++){
                int [] v1 = getG().generate(3, k*100);
                getMarcador().setV(v1);

                getMarcador().marcar(qs);

                media = media + getMarcador().getElapsed();
            }
            System.out.println("Vetor: 3 : "+ k*100+" posiçõe");
            media /= n;
            System.out.println("Tempo medio de execução: " + media + "ms");
        }
        //-----------------------------------
    }   
}
