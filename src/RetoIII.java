//Importar la libreria de Scanner
import java.util.Scanner;
public class RetoIII {
    public static void main(String[] args) {
        /*Programa que le solicita al usuario una palabra letra por letra y el numero de intentos. 
        esta palabra se almacena en un array y con ella se hace el juego de ahorcado */

        //Declaramos las variables y si es necesario les asignamos un valor
        String pal, letra, letras[]  = null, palabraGuion[] = null, compr[], palab = null;
        int inte = 0, num = 0, num1 = 0, limp1 , limp, cont1;

        //Creamos la clase scanner para poder capturar datos
        Scanner sc = new Scanner(System.in);


        //biuenvenida al que ingresa la palabra y los intentos
        System.out.println("Bienvenido al juego de ahorcados, a continuación podrás ingresar la palabra clave.");

                System.out.println("¿Cuantas letras tiene tu palabra?");
                //Capturamos cual es la cantidad de espacios en el array
                //Array para guardar la palabra que asigna el usuario
                letras = new String[num = sc.nextInt()];
                //Array con guiones que se le muestra al jugador
                palabraGuion = new String[num];
                //Array para realizar a comparacion de las elecciones del usuario
                compr = new String[num];

                //Ciclo for para pedir y capturar las letras de la palabra
                //Usamos length para contar el numero de espacios para el array
                for (int i = 0; i < letras.length; i++){
                    //solicitamos letras
                    System.out.print("Ingresa la letra "+(i+1)+" de la palabra: ");
                    letras[i] = (pal = sc.next().toLowerCase());
                    //Guradamos los mismos valores en los mismos espacios del array que va a observar el usuario
                    compr[i] = pal;
                    //Guardamos los valores que va a ver el creador del juego en primera instancia
                    palabraGuion[i] = "_";
                }

                // Ciclo while para que el codigo se ejecute el numero de veces del tamaño del array.
                //Este array es usado para que cuaando el usuario gane, termine el juego
                while (num1 < letras.length){
                    //Ciclo while para condicionar que no se excedan el numero de intentos permitidos
                    while(inte < 4){
                        //Contador para saber si seguir mostrando un mensaje
                        cont1=0;
                        // Ciclo for para que  se vayan comparando diferentes posiciones de las letras
                        for(int i = 0; i < letras.length;){
                            System.out.println("\n");
                            
                            System.out.println("\n¡Juguemos ahorcados!");
                            //Ciclo for para mostrar los guiones de acuerdo a la cantidad de letras
                            for (int j = 0; j < palabraGuion.length; j+=1){
                                System.out.print(palabraGuion[j]);
                            }

                            //Mensajes para mostrar el numero de intentos que llevan y solicitar la letra
                            System.out.println("\n\nEste es tu intento numero: " + (inte+1));
                            System.out.print("Digita la letra " + (i+1) + " : ");
                            letra = sc.next().toLowerCase();


                            //Contadores/Limpiadores
                            //Contador cuenta las veces que la letra fue comparada y no estaba dentro del array.Limpiador
                            limp = 0;
                            //Contador para saber si ya no hay mas letras que comparar. Limpiador
                            num1 = 0;
                            //Contador para saber si seguir mostrando un mensaje.Limpiador
                            limp1 = 0;

                            //Ciclo for para comparar si la letra que se ingreso es correcta
                            for (int j = 0; j < letras.length; j+=1){
                                //Condicional para saber si es correcta la palabra y que esta no se haya ingresado antes
                                if (compr[j].equalsIgnoreCase(letra) && letras[j] != null){
                                    //Contador para mostrar que ya se puede seguir a la siguiente letra
                                    i+=1;
                                    //Guardamos la letra que selecciono el usuario para mostrarla y mostrar el progreso
                                    palabraGuion[j] = letras[j];
                                    //Guardamos un null dentro del array palabra para que no se compare esa posicion
                                    letras[j] = null;
                                    //Rompemos el ciclo para que siga con la siguiente palabra
                                    break;

                                //Condicional en caso de que el usuario ingreso una letra que ya fue verificada
                                } else if (letras[j] == null && compr[j].equalsIgnoreCase(letra)) {
                                    //Guardamos la letra que el usuario ingreso
                                    palab = palabraGuion[j];
                                    //Variable para luego mostrar al usuario que esa letra ya no se repite
                                    limp1=1;

                                } else {
                                    //Contador que va sumando las veces que la letra fue comparada y no estaba dentro del array
                                    limp+=1;
                                }
                            }

                            //Condicional para saber si mostrar un mensaje
                            if (limp1 != 0){
                                //Mensaje de que la palabra ingresada ya fue registrada
                                System.out.println("Esta letra "+palab+" ya no se repite");
                                //Condicional para saber si seguir mostrando elm
                                if (cont1 == 0){
                                    limp1 = 0;
                                }
                            }

                            //Ciclo for para comparar si ya se termino de encontrar todas las letras
                            for (int j = 0; j< letras.length; j+=1){
                                //Comparar si la posicion hay un null
                                if (letras[j] == null){
                                    //Contador para ir sumando el numero de veces que hay null dentro del array
                                    num1+=1;
                                }
                            }

                            //Condicional para saber si mostrar si la letra ingresada es incorrecta
                            if (limp == letras.length){
                                System.out.println("La letra ingresada es incorrecta");
                                //Contador para ir sumando cada vez que se equivoca el usuario
                                inte+=1;
                            }


                            //Condicional para acabar con el juego si el usuario acerto todas las oportunidades
                            if (num1 == letras.length){
                                inte = 4;
                                break;
                            }

                        }
                    }
                }


        //Condicional para saber si se acerto correctamente todas las letras y mostrar mensaje de Felicitacion
        if(num1 == letras.length){
            System.out.print("\n¡Ganaste! La palabra es: ");
            //Ciclo para mostrar la palabra guardada
            for (int i = 0; i < letras.length; i++){
                System.out.print(palabraGuion[i]);
            }
        //Mensaje para saber si gasto todos sus intentos
        }else if(inte == 4){
            System.out.println("Excediste el numero de intentos");
        }

        System.out.println("\nGracias por jugar. Hasta luego.");

        //Cerramos el buffer
        sc.close();
    }
}