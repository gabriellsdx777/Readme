import java.util.Scanner;

public class Exemplo06 {

    public static Scanner input = new Scanner(System.in);

    public static void preencherVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {

          System.out.println("Digite o " + (i + 1) + "° número");
            v[i] = input.nextInt();
        }
    }

    public static void imprimir( int[] v){

        System.out.print("{");
          if (v.length > 0){
            System.out.print(" " + v[0]);

          }

          for ( int i = 1; i < v.length; i +=1){

            System.out.print(", " + v[i]);

          }
            System.out.println(" }");
    }

  }               
  