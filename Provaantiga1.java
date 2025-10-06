import java.util.Scanner;

public class Provaantiga1 {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void preencherVetor(int[] v, int tam){

        for( int i = 0; i < tam; i++){

            System.out.println("Digite o" + (i + 1) + "° elemento do vetor");
            v[i] = input.nextInt();

        }
    }

    public static void imprimirVetor(int[] v){

        System.out.print(" { ");
        for(int i = 0; i < v.length; i++){

            System.out.print(v[i]);

            if(i < v.length - 1){
                System.out.print(" ,");
            }
        
        }
        System.out.print(" }");
    }

    public static int buscaSequencial(int[] v, int tam, int key){

        for(int i = 0; i < tam; i++){

            if(v[i] == key){
                return i;
            }

        }
        return -1;
    }

    public static void vetorResultreverso(int[] vetor1, int[] vetorResult){

        int tam = vetor1.length;

        for(int i = 0; i < tam; i++){

            vetorResult[i] = vetor1[tam - 1 - i];
        }

    }

    public static void somarVetores(int[] vetor1, int[] vetor2, int[] vetorResult){

        int tam = vetor1.length;

        for(int i = 0; i < tam; i++){
            vetorResult[i] = vetor1[i] + vetor2[i];

        }

    }


    public static void criarVetorParImpar(int[] vetor1, int[] vetor2, int[] vetorResult){

        int pos = 0;

        for(int i = 0; i < vetor1.length; i++){

            if(vetor1[i] % 2 != 0){
                vetorResult[pos] = vetor1[i];
                pos++;

            }

        }

        for(int i = 0; i < vetor2.length; i++){
            if(vetor2[i] % 2 == 0){

                vetorResult[pos] = vetor2[i];
                pos++;
            }

        }

    }
    public static void main(String[] args) {
        
        int[] vetor1 = new int[100];
        int[] vetor2 = new int[100];
        int[] vetorResult = new int[100];
        int opcao;
        //Menu:

    do {
        
        System.out.println("-----MENU-----");
        System.out.println("Digite uma das opções abaixo:");
        System.out.println("Opção 1: preencher vetores");
        System.out.println("Opção 2: Imprimir vetor");
        System.out.println("Opção 3: Realizar a busca de um valor");
        System.out.println("Opção 4: Vetor Resultado Reverso");
        System.out.println("Opção 5: Somar valores dos vetores 1 e 2");
        System.out.println("Opção 6: Mostrar ímpares do 1° vetor e pares do 2° vetor");
        System.out.println("Opção 0: SAIR");

         opcao = input.nextInt();

        switch (opcao) {
            case 1:
                preencherVetor(vetor1, vetor1.length);
                preencherVetor(vetor2, vetor2.length);
                break;
        
            case 2:

                imprimirVetor(vetor1);
                imprimirVetor(vetor2);
                break;

            case 3:

                System.out.println("Digite o valor a ser buscado");
                int key = input.nextInt();

                int pos = buscaSequencial(vetor1, vetor1.length, key);
                if(pos == -1){

                    System.out.println("Valor não encontrado");
                }
                else{

                    System.out.println("Valor encontrado na posição : " + pos);
                }
                break;

            case 4:


                    vetorResultreverso(vetor1, vetorResult);
                    imprimirVetor(vetorResult);
                    break;

            case 5: 

                    somarVetores(vetor1, vetor2, vetorResult);
                    System.out.println("Vetor soma resultado: ");
                    imprimirVetor(vetorResult);
                    break;

            case 6:

                    criarVetorParImpar(vetor1, vetor2, vetorResult);
                    System.out.println("Vetor depois de modificado: ");
                    imprimirVetor(vetorResult);
                    break;

            case 0:
                    System.out.println("Saindo...");
                    break;

            default:

                    System.out.println("Opção não encontrada!");
                    break;


        }



    } while ( opcao != 0);
        
    }
}
