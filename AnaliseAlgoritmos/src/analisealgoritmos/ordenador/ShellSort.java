package analisealgoritmos.ordenador;

public class ShellSort extends Ordenador{
    public void shellSort(int[] v, int n){
        int h = 1, i, j, p;
        while(h < n)
            h = 3 * h + 1;
        do{
            h /= 3;
            for(i = h; i < n; i++){
                p = v[i];
                j = i - h;
                while(j >= 0 && v[j] > p){
                    v[j + h] = v[j];
                    j -= h;
                }
                v[j + h] = p;
            }
        }while(h > 1);
    }
    
    @Override
    public void ordenar(int[] v){
        System.out.println("Tamanho " + v.length);
        shellSort(v, v.length);
    }
}
