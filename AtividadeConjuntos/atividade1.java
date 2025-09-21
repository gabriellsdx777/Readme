   import java.util.Scanner;

    public class atividade1{

        static int tamA = 0;
        static int tamB = 0;
        public static Scanner input = new Scanner(System.in);

        public static int adicionarElementoAoConjunto(int[] conjunto, int tamanhoAtual) {
            if (tamanhoAtual < conjunto.length) {
                System.out.print("Digite o elemento a ser inserido: ");
                int elemento = input.nextInt();
                conjunto[tamanhoAtual] = elemento;
                return tamanhoAtual + 1; 

              }  else {
                     System.out.println("O conjunto está cheio!");
                     return tamanhoAtual; 
    }
}

        public static void imprimirVetor(int[] v, int tam){

            System.out.print(" { ");
            for(int i = 0; i < tam; i++){
                System.out.print(v[i]);
                if (i < tam -1){
                    System.out.print(", ");

                }
                
            }
             System.out.println("} ");
        }


        public static int unirSemRepetidos(int[] a, int tamA, int[] b, int tamB, int[] uniao) {
        int tamUniao = 0;

        for (int i = 0; i < tamA; i++) {
            uniao[tamUniao] = a[i];
            tamUniao++;
      }

        for (int i = 0; i < tamB; i++) {
            boolean repetido = false;
            for (int j = 0; j < tamA; j++) {
                if (b[i] == a[j]) {
                    repetido = true;
                    break;
            }
        }
        if (!repetido) {
            uniao[tamUniao] = b[i];
            tamUniao++;
        }
    }

    return tamUniao;
}

        public static int intersecaoConjuntos(int[] a, int tamA, int[] b, int tamB, int[] intersecao) {
         int tamIntersecao = 0;

         for (int i = 0; i < tamA; i++) {
          for (int j = 0; j < tamB; j++) {
            if (a[i] == b[j]) {
                
                boolean jaAdicionado = false;
                for (int k = 0; k < tamIntersecao; k++) {
                    if (intersecao[k] == a[i]) {
                        jaAdicionado = true;
                        break;
                    }
                }
                if (!jaAdicionado) {
                    intersecao[tamIntersecao] = a[i];
                    tamIntersecao++;
                }
                break; 
            }
        }
    }

    return tamIntersecao;
}

    public static int diferencaConjuntos(int[] a, int tamA, int[] b, int tamB, int[] diferenca) {
    int tamDiferenca = 0;

    for (int i = 0; i < tamA; i++) {
        boolean encontrado = false;
        for (int j = 0; j < tamB; j++) {
            if (a[i] == b[j]) {
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            diferenca[tamDiferenca] = a[i];
            tamDiferenca++;
        }
    }

    return tamDiferenca;
}


        public static void main(String[] args) {
            

         int[] conjuntoA = new int[30];
         int[] conjuntoB = new int[30];

         while(true){

         System.out.println("----MENU----");
         System.out.println(" ");
         System.out.println("Digite a oção desejada:");
         System.out.println("1) Inserir 1 elemento no conjunto A");
         System.out.println("2) Inserir 1 elemento no conjunto B");
         System.out.println("3) Imprimir os conjuntos A e B");
         System.out.println("4) Gerar e imprimir a união de A e B");
         System.out.println("5) Gerar e imprimir a interseção entre A e B");
         System.out.println("6) Gerar e imprimir a diferença entre A e B");
         System.out.println("7) Gerar e imprimir a diferença entre B e A");
         System.out.println(" ");
         int opcao = input.nextInt(); 


            switch (opcao) {

                case 1:
                    
                tamA = adicionarElementoAoConjunto(conjuntoA, tamA);
                    break;

                case 2:
                tamB = adicionarElementoAoConjunto(conjuntoB, tamB);
                break;

                case 3:
                System.out.print("Conjunto A: ");
                imprimirVetor(conjuntoA, tamA);

                System.out.print("Conjunto B: ");
                imprimirVetor(conjuntoB, tamB);
                break;

                case 4:

                int[] uniao = new int[conjuntoA.length + conjuntoB.length];
                int tamUniao = unirSemRepetidos(conjuntoA, tamA, conjuntoB, tamB, uniao);

                System.out.print("União de A e B: ");
                 imprimirVetor(uniao, tamUniao);
                 break;


                case 5:

                int[] intersecao = new int[Math.min(tamA, tamB)]; 
                int tamIntersecao = intersecaoConjuntos(conjuntoA, tamA, conjuntoB, tamB, intersecao);

                System.out.print("Interseção (repetidos entre A e B): ");
                imprimirVetor(intersecao, tamIntersecao);
                if (tamIntersecao == 0) {
                    System.out.println("Não há elementos em comum entre os conjuntos.");
                        } else {
                            System.out.print("Interseção (repetidos entre A e B): ");
                            imprimirVetor(intersecao, tamIntersecao);
                        }
                break;

                case 6:

                int[] diferencaAB = new int[tamA];
                int tamDiferencaAB = diferencaConjuntos(conjuntoA, tamA, conjuntoB, tamB, diferencaAB);
                System.out.print("Diferença A - B: ");
                imprimirVetor(diferencaAB, tamDiferencaAB);
                break;

                case 7: 

                int[] diferencaBA = new int[tamB];
                int tamDiferencaBA = diferencaConjuntos(conjuntoB, tamB, conjuntoA, tamA, diferencaBA);
                System.out.print("Diferença B - A: ");
                imprimirVetor(diferencaBA, tamDiferencaBA);
                break;

                default:

                System.out.println("Opção Inválida, informe uma opção existente");
                break;

            }

         }

         
     }

}