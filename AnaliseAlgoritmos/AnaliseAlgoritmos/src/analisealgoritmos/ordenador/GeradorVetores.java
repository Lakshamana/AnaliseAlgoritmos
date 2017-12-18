package analisealgoritmos.ordenador;

import java.util.Random;

public class GeradorVetores {
    public int[] generate(int op, int length){
        switch(op){
            case 1: return genOrdenado(length);
            case 2: return genReverse(length);
            case 3: return genRandom(length);
            case 4: return genMeioOrdenado(length);
            default: return new int[1];
        }
    }
    
    private static int getRandom(int min, int max){
        Random r = new Random();
        return r.nextInt(1 + (max - min)) + min;
    }   
    
    private static int[] genOrdenado(int length){
        int[] v = new int[length];
        for(int i = 0; i < length; i++)
            v[i] = i + 1;
        return v;
    }
    
    private static int[] genReverse(int length){
        int[] v = new int[length];
        for(int i = 1; i <= length; i++)
            v[length - i] = i;
        return v;
    }
    
    private static int[] genRandom(int length){
        int[] v = new int[length];
        for(int i = 0; i < length; i++)
            v[i] = getRandom(1, length);
        return v;
    }
    
    private int[] genMeioOrdenado(int length){
        int[] v = new int[length];
        for(int i = 0; i < length; i++)
            if(i < length / 2)
                v[i] = i + 1;
            else v[i] = getRandom(length / 2 + 1, length);
        return v;
    }
}
