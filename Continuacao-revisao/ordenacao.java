 import java.util.Scanner;

public class ordenacao {
    
    public static Scanner input = new Scanner(System.in);


    public static void preencherVetor(int[] v, int QTD){

        for(int i = 0; i < QTD; i++){

            System.out.println("Digite o " + (i + 1) + "° elemento do vetor");
            v[i] = input.nextInt();

        }
    }

    public static int inserirOrdenado(int[] v, int tam, int x){

        if (tam >= v.length){
            System.out.println("O vetor está cheio");
            return tam;

        }

        int pos = tam;

        while (pos > 0 && x < v[pos-1]) {
            v[pos] = v[pos - 1];
            pos -= 1;
        }
        v[pos] = x;
        return tam + 1;

    }


    public static void main(String[] args) {
        
        System.out.println("Digite o tamanho de posições do vetor");
        int QTD = input.nextInt();


        int[] vetor = new int[QTD + 1];
        preencherVetor(vetor, QTD);


        System.out.println("Agora, implemente mais um: ");
        int x = input.nextInt();
        int tam = inserirOrdenado(vetor, QTD, x);

        System.out.println(" Vetor final ordenado:");
        System.out.println();
        for(int i = 0; i < tam; i++){

            System.out.print(vetor[i] + " ");

        }
    }
}