import java.util.Scanner;
public class RetoII {
    public static void main(String[] args) {
        /*aplicación para almacenar el tiempo por cada competidor. El usuario
        debe especificar cuantos competidores participarán en la
        competencia y digitar los nombres y tiempos de cada uno. Muestre en
        pantalla cada nadador con su respectivo tiempo. Plantee de qué
        forma podría determinar quien es el ganador. */

        System.out.println("Bienvenido, aquí podrá ingresar n cantidad de competidores, el nombre de estos y los tiempos obtenidos en la competencia, para así, saber el ganador.");

        //declarar variables
        int cantComp;
        float tiempoMenor;

        //instanciar clase scanner
        Scanner sc = new Scanner(System.in);

        //solicitar cantidad de competidores
        System.out.println("Ingrese la cantidad de competidores: ");

        //capturamos dato
        cantComp = sc.nextInt();

        //declaramos arrays y su tamaño
        int competidores[] = new int[cantComp];
        String nombreC[] = new String[cantComp];
        float tiempoC[] = new float[cantComp];

        for (int comp = 0; comp < competidores.length; comp ++){
            //solicitar nombres de los competidores
            System.out.println("Ingrese el nombre del competidor " + (comp + 1) + ": ");

            //capturar dato en el array
            nombreC[comp] = sc.next();

            //solicitar tiempo del nadador
            System.out.println("Ingrese el tiempo del competidor " + (comp + 1) + ":" );

            //capturar dato
            tiempoC[comp] = sc.nextFloat();
        }

        //mostrar competidores y sus tiempos
        System.out.println("Los competidores son: ");

        for(int com = 0; com<nombreC.length; com++){
            System.out.println("Competidor " + (com + 1)+ ": " + nombreC[com] + " - " + " Tiempo: " +  tiempoC[com] + " minutos");
        }

        //saber cual nadador tuvo el tiempo menor

        //asignar valor de la posición 0 del array tiempoC a la variale tiempoMenor 
        tiempoMenor = tiempoC[0];

        //for para determinar tiempo menor de los competidores

        for (int com = 0; com <tiempoC.length; com++){
            //si el dato que se encuentra en el array tiempoC es menor a lo que hay en la variale tiempoMenor
            if(tiempoC[com] < tiempoMenor){
                //le asignamos a la variable tiempoMenor lo que hay en la posición com del array tiempoC
                tiempoMenor = tiempoC[com];
                //mostrar el competidor ganador y su tiempo
                System.out.println("El ganador es " + nombreC[com] + " con un tiempo de " + tiempoMenor + " minutos.");
            }
        }

        System.out.println("Hasta luego.");

        //cerrar buffer
        sc.close();
    }
}
