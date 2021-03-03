
import java.io.IOException;

class Main {

  private static int ehPrimo(int numero) {
      for (int j = 2; j < numero; j++) {
          if (numero % j == 0)
              return 1;   
      }
      return 0;
  }

  public static void main(String[] args) {

    int v[] = {7,27,8431,13033,524287,664283,2147483647};
    double tempo[];
    tempo = new double[30];
    double media=0;
    int r=0;
    for(int i=0;i<7;i++){
      for(int j=0;j<30;j++){
        Long tempoInicial = System.currentTimeMillis();
        r = ehPrimo(v[i]);
        Long tempoFinal = System.currentTimeMillis();
        tempo[j] = tempoFinal - tempoInicial;
        media = media+tempo[j];
      }
      if(r == 0){
        System.out.println(v[i] +" e primo  tempo de execução: " + (media/30));
      }
      else{
        System.out.println(v[i] +" nao e primo: tempo de execução: " + (media/30));
      }
    }
  }
}