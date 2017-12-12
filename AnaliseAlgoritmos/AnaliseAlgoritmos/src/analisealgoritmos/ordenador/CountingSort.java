
package ordenação;


public class CountingSort extends Ordenador{
    public void CoutingSort(int[] vetor){
        
        //Encontra o maior valor do vetor
        int maior = vetor[0];
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        //Inicializa o vetor c com zero
        int[] c = new int[maior+1];
        for(int j = 0; j< maior+1; j++){
            c[j] = 0;
        }
        //Contagem de ocorrencias
        for(int j = 0; j< vetor.length; j++){
            c[vetor[j]]++;
        }
        //Ordena os indices do vetor auxiliar(vetor c)
        int sum =0;
        for(int i = 1; i < maior+1; i++){
            int dum = c[i];
            c[i] = sum;
            sum += dum;
        }
        
        int ordenado[] = new int[vetor.length];
        for(int i = 0; i < vetor.length; i++){
            ordenado[c[vetor[i]]] = vetor[i];
            c[vetor[i]]++;
        }
        //Retorna os os valores ordenados para o vetor
        System.arraycopy(ordenado, 0, vetor, 0, vetor.length); 
        
    }
    @Override
    public void ordenar(int[] v){
        CoutingSort(v);
    }
}
