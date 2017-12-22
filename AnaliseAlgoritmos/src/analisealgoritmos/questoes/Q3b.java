/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisealgoritmos.questoes;

import analisealgoritmos.ordenador.BucketSort;

/**
 *
 * @author Erlon
 */
public class Q3b extends Questao {
      
    BucketSort BK = new BucketSort();
    public Q3b(MarcadorTempo t) {
        super(t);
}

    @Override
    public void run() {
     long media;
        int n = 100;
        media = 0;
        System.out.println("BucketSort: Ordem Crescente");
        for(int k = 1; k < 11; k++){
            for(int j = 0; j < n; j++){
                int [] v1 = getG().generate(1, k*100);
                getMarcador().setV(v1);

                getMarcador().marcar(BK);

                media = media + getMarcador().getElapsed();
            }
            media /= n;
            System.out.println("Vetor: 1 : "+ k*100+" posiçõe");
            System.out.println("Tempo medio de execução: " + media + "ms");
        }
        System.out.println();
        //-----------------------------------
        media = 0;
        
        //-----------------------------------
        System.out.println("BucketSort: Desordenado");
        media = 0;
        for(int k = 1; k < 11; k++){
            for(int j = 0; j < n; j++){
                int [] v1 = getG().generate(3, k*100);
                getMarcador().setV(v1);

                getMarcador().marcar(BK);

                media = media + getMarcador().getElapsed();
            }
            System.out.println("Vetor: 3 : "+ k*100+" posiçõe");
            media /= n;
            System.out.println("Tempo medio de execução: " + media + "ms");
           
        
    }   
}
}
    
    
