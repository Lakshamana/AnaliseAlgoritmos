package analisealgoritmos.questoes;

import analisealgoritmos.ordenador.HeapSort;

public class Q2 extends Questao{
    
    HeapSort hs = new HeapSort();
    
    public Q2(MarcadorTempo t){
        super(t);
    }
    
    @Override
    public void run() {
        int [] v1 = getG().generate(1, 1000);
        getMarcador().setV(v1);
        
//        System.out.println("Vetor a ordenar: " + Arrays
//                .toString(getMarcador().getV())); 
//        getMarcador().marcar(qs);   
//        System.out.println("Vetor ordenado: " + Arrays
//                .toString(getMarcador().getV()));       
//        System.out.println("Tempo total de execução: " + getMarcador()
//                .getElapsed() + "ms");
        
        System.out.println("Vetor: 1 : 1000");
        getMarcador().marcar(hs);
        System.out.println("Tempo total de execução: " + getMarcador()
                .getElapsed() + "ms");
        //---------------------------
        int [] v2 = getG().generate(2, 1000);
        System.out.println("Vetor: 2 : 1000");
        getMarcador().setV(v2);
        getMarcador().marcar(hs);
        System.out.println("Tempo total de execução: " + getMarcador()
                .getElapsed() + "ms");
        //---------------------------
        int [] v3 = getG().generate(3, 1000);
        System.out.println("Vetor: 3 : 1000");
        getMarcador().setV(v3);
        getMarcador().marcar(hs);
        System.out.println("Tempo total de execução: " + getMarcador()
                .getElapsed() + "ms");
        //---------------------------
        //---------------------------
        int [] v4 = getG().generate(1, 5000);
        System.out.println("\nVetor: 1 : 5000");
        getMarcador().setV(v4);
        getMarcador().marcar(hs);
        System.out.println("Tempo total de execução: " + getMarcador()
                .getElapsed() + "ms");
        //---------------------------
        int [] v5 = getG().generate(2, 5000);
        System.out.println("Vetor: 2 : 5000");
        getMarcador().setV(v5);
        getMarcador().marcar(hs);
        System.out.println("Tempo total de execução: " + getMarcador()
                .getElapsed() + "ms");
        //---------------------------
        int [] v6 = getG().generate(3, 5000);
        System.out.println("Vetor: 3 : 5000");
        getMarcador().setV(v6);
        getMarcador().marcar(hs);
        System.out.println("Tempo total de execução: " + getMarcador()
                .getElapsed() + "ms");
    }    
}