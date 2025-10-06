  import java.util.Scanner;

public class Conjuntosreestruturada {
    
public static Scanner input = new Scanner(System.in);

public static void preencherVetor(int[] v, int tam){

    for(int i = 0; i< tam; i++){
       System.out.println("Digite o " + (i + 1) + "° elemento do vetor");
       v[i] = input.nextInt();

}

}

public static void imprimirVetor(int[] v, int tam){

    System.out.print(" { ");
    for(int i = 0; i < tam; i++){
        //System.out.println("Vetor na posição: " + i + " = "+  v[i] );

        System.out.print(v[i] + " ");
        if(i < tam -1){
            System.out.print(" ,");

        }
    }
    System.out.print(" }");

    }


public static void somarVetores(int[] vetorA, int[] vetorB, int[] vetorResult){

   int tam = vetorA.length;

    for(int i = 0; i < tam; i++){

        vetorResult[i] = vetorA[i] + vetorB[i];

    }

}

public static void verRepetidos(int[] vetorA, int[] vetorB, int tam){

    for(int i = 0; i < tam; i++){

        for(int j = 0; j < tam; j++){

            if(vetorA[i] == vetorB[j]){

                int jaMostrado = 0;

                for (int k = 0; k < i; k++) {
                    if (vetorA[i] == vetorB[k]) {
                        for (int m = 0; m < vetorB.length; m++) {
                            if (vetorA[k] == vetorB[m]) {
                                jaMostrado = 1;
                                break;
                            }
                            }
                        }

            }
            if (jaMostrado == 0) {
                    System.out.print(vetorA[i] + " ");
                }

                break;
        }   
                 

    }
}

}

public static void diferencadeVetoresAeB(int[] vetorA, int[] vetorB, int[] vetorResult){
    int tam = vetorA.length;
    for(int i = 0; i < tam; i++){

        vetorResult[i] = vetorA[i] - vetorB[i];

    }
}

public static void diferencadeVetoresBeA(int[] vetorA, int[] vetorB, int[] vetorResult){
        int tam = vetorA.length;
        for(int i = 0; i < tam; i++){

        vetorResult[i] = vetorB[i] - vetorA[i];

    }

}

public static void main(String[] args) {
    
    int[] vetorA = new int[30];
    int[] vetorB = new int[30];
    int[] vetorResult = new int[30];

    int opcao;


    do {
        
        System.out.println("-----MENU------");
        System.out.println("Opção 1: Inserir elemento no conjunto A");
        System.out.println("Opção 2: Inserir elemento no conjunto B");
        System.out.println("Opção 3: Imprimir os conjuntos A e B");
        System.out.println("Opção 4: Imprimir união/soma A e B");
        System.out.println("Opção 5: Imprimir a interseção entre A e B");
        System.out.println("Opção 6: Imprimir vetor A - B");
        System.out.println("Opção 7: Imprimir vetor B - A");
        System.out.println("Opção 0: SAIR");

        System.out.println("Digite a opção abaixo: ");
        opcao = input.nextInt();

        switch (opcao) {

            case 1:
                
                preencherVetor(vetorA, vetorA.length);
                break;

            case 2:

                preencherVetor(vetorB, vetorB.length);
                break;

            case 3:
                System.out.println("Vetor A: ");
                imprimirVetor(vetorA, vetorA.length);

                System.out.println();

                System.out.println("Vetor B: ");
                imprimirVetor(vetorB, vetorB.length);
                break;

            case 4: 

                System.out.println("Soma dos vetores A e B:");
                somarVetores(vetorA, vetorB, vetorResult);
                imprimirVetor(vetorResult, vetorA.length);
                
            case 5: 
                
                System.out.println("Interseção: ");
                verRepetidos(vetorA, vetorB, vetorA.length);
                break;

            case 6: 

                System.out.println("Vetor A - Vetor B: ");
                diferencadeVetoresAeB(vetorA, vetorB, vetorResult);
                break;

            case 7:

                System.out.println("Vetor B - Vetor A: ");
                diferencadeVetoresBeA(vetorA, vetorB, vetorResult);
                break;

            case 0: 

                System.out.print("Saindo do menu...");
                break;

            default:
                System.out.println("Nenhuma opção encontrada");
                break;
        }




    } while (opcao != 0);
}
}
