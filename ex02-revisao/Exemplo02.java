public class Exemplo02{

    public static void main(String[]args){

        for (int i = 1; i < 100; i++){
            System.out.print(i + " ,");

        }
          System.out.println("Números ímpares a seguir");
        for (int i = 1; i < 100; i+= 2){
            System.out.print(i + " ,");

        }
            System.out.println("Números pares a seguir");
        for (int i = 2; i < 100; i+= 2){
            System.out.print(i + " ,");

        }

            System.out.println("Múltiplos de 3 a seguir");
        for (int i = 3; i < 100; i+= 3){
            System.out.print(i + " ,");

        }

             System.out.println("Sequencia 5");
                for (int i = 1; i <= 99; i++) {
           
            if (i % 3 == 0) {
                System.out.print(i + " , ");
            }
            
            else if (i % 10 == 3) {
                System.out.print(i + " , ");
            }
        }
    }

}