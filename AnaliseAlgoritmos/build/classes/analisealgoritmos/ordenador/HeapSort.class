package analisealgoritmos.ordenador;

public class HeapSort extends Ordenador{

    public static void heapSort(int[] v) {
        MaxHeap(v);
        int n = v.length;

        for (int i = v.length - 1; i > 0; i--) {
            Trocar(v, i, 0);
            maxHeapify(v, 0, --n);
        }
    }

    private static void MaxHeap(int[] v) {
        for (int i = v.length / 2 - 1; i >= 0; i--)
            maxHeapify(v, i, v.length);

    }

     private static void maxHeapify(int[] vetor, int pos, int tamanhoDoVetor)  
     {  

         int max = 2 * pos + 1, right = max + 1;  
         if (max < tamanhoDoVetor)  
         {  

             if (right < tamanhoDoVetor && vetor[max] < vetor[right])  
                 max = right;

             if (vetor[max] > vetor[pos])  
             {  
                 Trocar(vetor, max, pos);  
                 maxHeapify(vetor, max, tamanhoDoVetor);  
             }  
         }  
     }

    public static void Trocar(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }

    @Override
    public void ordenar(int[] v) {
        heapSort(v);
    }
}
