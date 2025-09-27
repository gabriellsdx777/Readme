     import java.util.Scanner;
  
  public class  remover{

    /*public static Scanner input = new Scanner(System.in);

    int removerTodos(int[] v, int tam, int x){

        int desl = 0;
            for(int i = 0; i < tam; i+=1){

                if(v[i] == x){

                    desl +=1;
                }
                else{
                    v[i - desl] = v[i];
                }
            }

            return tam - desl;

    }*/


    int removerTodos(int[] v, int tam, int x){

        int novoTam = 0;
         for(int i = 0; i < tam; i+=1){
            if(v[i] != x){
                v[novoTam] = v[i];
                novoTam +=1;
            }

         }
         return novoTam;
    }

    public static void main(String[] args) {
        
    }

  }