/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisealgoritmos.questoes;


import analisealgoritmos.ordenador.CountingSort;
import java.util.Arrays;



/**
 *
 * @author 201604940045
 */
public class Q3 extends Questao {
     
    CountingSort CS = new CountingSort();
    public Q3(MarcadorTempo t) {
        super(t);
     
    }

    @Override
    public void run(){
       
       long media;
        int n = 100;
        media = 0;
        System.out.println("CountingSort: Ordem Crescente");
        for(int k = 1; k < 11; k++){
            for(int j = 0; j < n; j++){
                int [] v1 = getG().generate(1, k*100);
                getMarcador().setV(v1);

                getMarcador().marcar(CS);

                media = media + getMarcador().getElapsed();
            }
            media /= n;
            System.out.println("Vetor: 1 : "+ k*100+" posiçõe");
            System.out.println("Tempo medio de execução: " + media + "ms");
        }
        System.out.println();
        //-----------------------------------
        media = 0;
        
        
        
        
    }
        
    }

    
