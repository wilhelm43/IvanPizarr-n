package cubesort;

public class Cubesort {

    public static int mov1, mov2, cubo; //Variables para ordenar

    public static void main(String[] args) {

        int arreglo[] = {25, 2, 11, 8, 7, 4, 14, 65, 88, 5}; //Crear arreglo

        System.out.println("No esta ordenada,estas torcido"); //Imprime desordenado

        for (int i = 0; i < arreglo.length; i++) { //Recorre para saber el tamaño del arreglo

            System.out.print(arreglo[i] + " ");

        }

        System.out.println(" ");

        mov1 = 1; //Inicializamos variables

        mov2 = arreglo.length; //Inicializamos variables

        cubo = arreglo.length - 1; //Inicializamos variables

        do {

            for (int i = arreglo.length - 1; i > 0; i--) {

                if (arreglo[i - 1] > arreglo[i]) {

                    int aux = arreglo[i]; //Variable aux para hacer 

                    arreglo[i] = arreglo[i - 1]; //intercambio de posicion

                    arreglo[i - 1] = aux; //Se le asigna el valor a aux en el cubo

                    cubo = i;

                    for (int z = 0; z < arreglo.length; z++) { //Recorre para saber el tamaño del arreglo

                        System.out.print(arreglo[z] + " ");

                    }
                    System.out.println("");

                }

            }

            mov1 = cubo + 1; //Iguala en mov1 a cubo + 1

            for (int j = 1; j < arreglo.length; j++) {

                if (arreglo[j - 1] > arreglo[j]) {

                    int aux = arreglo[j]; //Variable aux para hacer 

                    arreglo[j] = arreglo[j - 1]; //intercambio de posicion

                    arreglo[j - 1] = aux; //Se le asigna el valor a au en el cubo

                    cubo = j; //Se le asigna un valor a cubo

                    for (int z = 0; z < arreglo.length; z++) { //Recorre para saber el tamaño del arreglo

                        System.out.print(arreglo[z] + " ");

                    }
                    System.out.println("");

                }

            }

            mov2 = cubo - 1; //Iguala en mov1 a cubo - 1

        } while (mov2 >= mov1); //Como ya se cumplio ya entra

        System.out.println("Ordenada");

        for (int i = 0; i < arreglo.length; i++) { //Recorre el arreglo ya ordenado

            System.out.print(arreglo[i] + " "); //Lo imprime

        }

    }

}
