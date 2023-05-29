import java.util.Scanner;
public class RetoIII {
    public static void main(String[] args) {

        /*Programa que le solicita al usuario una palabra letra por letra y el numero de intentos. 
        esta palabra se almacena en un array y con ella se hace el juego de ahorcado */

        //biuenvenida al que ingresa la palabra y los intentos
        System.out.println("Bienvenido al juego de ahorcados, a continuación podrá ingresar la palabra clave, su pista y el número de intentos.");

        //declaramos variables
        int cantL, intentos, intentosF = 0;
        String letra, pista;

        //instanciamos clase scanner
        Scanner sc = new Scanner(System.in);

        //solicitamos al usuario que ingrese la cantidad de letras que tiene la palabra
        System.out.print("Ingrese la cantidad de letras: ");

        //capturamos dato
        cantL = sc.nextInt();

        //creamos array para almacenar letras de la palabra y le designamos el tamaño ingresado por el usuario
        String palabra[] = new String[cantL];

        //solicitamos letras
        for (int let = 0; let < cantL; let++) {
            System.out.print("Ingresa la letra " + (let+1) + ": ");

            //capturamos
            palabra[let] = sc.next();
        }

        //solicitamos cantidad de intentos que va a tener el jugador
        System.out.print("Ingrese la cantidad de intentos que va a disponer el jugador: ");

        //capturamos
        intentos = sc.nextInt();

        //solicitamos pista
        System.out.print("Ingrese la pista de la palabra (en una palabra): ");

        //capturamos
        pista = sc.next();

        System.out.println("Listo, la palabra, el número de intentos y la pista quedaron guardados.\n");

        //bienvenida al jugador
        System.out.println("¡Bienvenido al juego de ahorcados!");
        //mostramos pista
        System.out.println("Te daremos una pista: Esta palabra es un/a " + pista);
        
        //for para contar intentos
        for(intentosF = 0; intentosF<intentos; intentosF++){
            System.out.println("Tienes " + intentos + " intentos.");
            System.out.println("Este es tu intento #" + (intentosF+1));
            //for para solicitar letras
            for (int let = 0; let<palabra.length; let++){
                System.out.print("Ingresa una letra: ");
                //capturamos
                letra = sc.next();
                //for para recorrer los valores del array palabra
                for (int letraA = 0; letraA < palabra.length; letraA++) {
                    //si es igual al valor del array palabra
                    if (letra.equals(palabra[letraA])) {
                        System.out.println("¡Has acertado en una letra!");
                    }
                }
                
                
            }
                    
        }
        System.out.print("Muy bien, acertaste todas las letras, la palabra es: ");
                for(int i = 0; i<palabra.length; i++){
                    System.out.print(palabra[i]);
                }
    }
}
