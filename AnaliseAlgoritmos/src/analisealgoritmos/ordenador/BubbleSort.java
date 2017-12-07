package analisealgoritmos.ordenador;

public class BubbleSort extends Ordenador{
    
    private int[] v;
    public void bubbleSort(int[] v, int n){
        boolean flag = true;
        int aux;
        do{
            for(int i = 1; i < n; i++){
                flag = false;
                for(int j = n - 1; j >= i; --j)
                    if(v[j - 1] > v[j]){
                        aux = v[j - 1];
                        v[j - 1] = v[j];
                        v[j] = aux;
                        flag = true;
                    }
            }
        }while(flag);
    }
    
    @Override
    public void ordenar(int[] v) {
        bubbleSort(v, v.length);
    }  

    public int[] getV() {
        return v;
    }
}
