package analisealgoritmos.ordenador;

public class QuickSort extends Ordenador{

    @Override
    public void ordenar(int[] v) {
        ordenar(v, 0, v.length);
    }

    private void ordenar(int[] v, int a, int b) {
        quickSort(v, a, b);
    }
    
    private int halfPartition(int[] v, int p, int r){
        int i = (int)((p + r) / 2);
        int tmp = v[r - 1];
        v[r - 1] = v[i];
        v[i] = tmp;
        return partition(v, p, r);
    }
    
    private int partition(int[] v, int p, int r){
        int k = v[r - 1];
        int i = p - 1;
        int tmp;
        for(int j = p; j < r; j++)
            if(v[j] < k){
                i++;
                tmp = v[i];
                v[i] = v[j];
                v[j] = tmp;
            }
        if(v[r - 1] < v[i + 1]){
            tmp = v[r - 1];
            v[r - 1] = v[i + 1];
            v[i + 1] = tmp;
        } 
        return i + 1;
    }
    
    private void quickSort(int[] v, int p, int r){
        if(p < r){
            int q = halfPartition(v, p, r);
            quickSort(v, p, q);
            quickSort(v, q + 1, r);
        }
    }
}
