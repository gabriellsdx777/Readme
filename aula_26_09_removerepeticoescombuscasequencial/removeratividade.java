    import java.util.Scanner;;
 
 public class removeratividade{

    public static Scanner input = new Scanner(System.in);

    public static int buscaSequencial(int[] v, int tam, int key){

        for(int i = 0; i < tam; i++){

            if(v[i] == key){

                return i;
            }

        }
        return -1;

    }


    public static int removerTodos(int[] v, int tam, int key){

        int novoTam = 0;
         for(int i = 0; i < tam; i+=1){
            if(v[i] != key){
                v[novoTam] = v[i];
                novoTam +=1;
            }

         }
         return novoTam;

    }


    public static void main(String[] args){

        System.out.println("Digite o tamanho do vetor");
        int tam = input.nextInt();

        int[] v = new int[tam];

        for(int i = 0; i< tam; i++){

            System.out.println("Digite o " + (i + 1) + "° elemento do vetor");
            v[i] = input.nextInt();

        }

        System.out.println("Digite a chave");
        int key = input.nextInt();

        int resultado = buscaSequencial(v, tam, key);

        if(resultado != -1){

            System.out.println("Valor no índice: " + resultado);

        }
        else{

            System.out.println("Valor não encontrado no vetor");
        }



    }


 }