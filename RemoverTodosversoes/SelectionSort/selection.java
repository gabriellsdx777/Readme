    public static void selectionSort(int[] v, int tam){


        int posMenor, aux;
        for(int i = 0; i <= tam - 2; i+=1){
            posMenor = i;
            for(int j = i; i < tam; i +=1){

                if(v[j] < v[posMenor]){

                    posMenor = j;
                }

            }
            aux = v[i];
            v[i] = v[posMenor];
            v[posMenor] = aux;
        }

    }