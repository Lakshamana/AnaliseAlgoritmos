/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisealgoritmos.ordenador;

import java.util.Random;

/**
 *
 * @author arjuna
 */
public class GeradorVetores {
    public int[] generate(int op, int length){
        if(op >= 1 && op <= 4)
            switch(op){
                case 1: return genOrdenado(length);
                case 2: return genReverse(length);
                case 3: return genRandom(length);
                case 4: return genEscada(length);
            }
        return new int[0];
    }
    
    private static int getRandom(int min, int max){
        Random r = new Random();
        return r.nextInt(1 + (max - min)) + min;
    }   
    
    private static int[] genOrdenado(int length){
        int[] v = {};
        for(int i = 0; i < length; i++)
            v[i] = i;
        return v;
    }
    
    private static int[] genReverse(int length){
        int[] v = {};
        for(int i = length; i < 0; i--)
            v[i] = i;
        return v;
    }
    
    private static int[] genRandom(int length){
        int[] v = {};
        for(int i = 0; i < length; i++)
            v[i] = getRandom(i, length);
        return v;
    }
    
    private int[] genEscada(int length){
        int[] v = {};
        for(int i = 0; i < length; i++)
            v[i] = i;
        return v;
    }
}
