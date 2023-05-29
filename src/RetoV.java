import java.util.Scanner;
public class RetoV {
    public static void main(String[] args) {
        /*Concentrese: El usuario podrá elegir dos 
        posiciones en las que crea que hay caracteres iguales, si acerta, 
        el programa le dice que gano, sino le pregunta si desea volver a jugar*/

        //declarar variables
        int fil, colum, fil2, colum2, resp;
        //declarar matriz
        String caracteres[][] = new String[3][3];

        //rellenar matriz
        
        caracteres [0][0] = ":)";
        caracteres [0][1] = "<3";
        caracteres [0][2] = ":(";
        caracteres [1][0] = ":(";
        caracteres [1][1] = "x";
        caracteres [1][2] = ":)";
        caracteres [2][0] = "<3";
        caracteres [2][1] = ":b";
        caracteres [2][2] = ":b";

        //mostrar concentrese
        System.out.println("\n     CONCENTRÉSE  ");
        System.out.println(" ____________________");
        System.out.println("|__00__|__01__|__02__|");
        System.out.println("|__10__|__11__|__12__|");
        System.out.println("|__20__|__21__|__22__|");

        //instanciar clase scanner
        Scanner sc = new Scanner(System.in);

        do {
            //solicitar al usuario que ingrese la posicion de la cara que desea escoger primero
            System.out.print("\nIngresa la posición de la cara que deseas escoger primero(ejemplo: 0 1): ");

            //capturamos datos
            fil = sc.nextInt();
            colum = sc.nextInt();

            //for para mostrar la ficha seleccionada
            for (int filas = 0; filas < caracteres.length; filas++) {
                for (int columnas = 0; columnas < caracteres.length; columnas++) {
                    if (fil == filas && colum == columnas) {
                        System.out.println("La ficha seleccionada es: "+ caracteres[filas][columnas] + " en la posición " + filas +"" + columnas);
                    }
                }
            }

            //solicitamos al usuario la segunda posición
            System.out.print("\nIngresa la posición de la cara con la que deseas comparar la posición escogida anteriormente (ejemplo: 0 2): ");
            //capturamos datos
            fil2 = sc.nextInt();
            colum2 = sc.nextInt();

            //for para mostrar la segunda ficha seleccionada
            for (int filas = 0; filas < caracteres.length; filas++) {
                for (int columnas = 0; columnas < caracteres.length; columnas++) {
                    if (fil2 == filas && colum2 == columnas) {
                        System.out.println("La ficha seleccionada es: "+ caracteres[filas][columnas] + " en la posición " + filas +"" + columnas + "\n");
                    }
                }
            }

            //si el valor almacenado en la fila y columna ingresadas primeramente es igual al valor almacenado en la fila y columna ingresadas de segundas, entonces
            if (caracteres[fil][colum] == caracteres[fil2][colum2]){
                //se le dice al usuario que ha atinado
                System.out.println("¡Has ganado! las dos fichas son iguales.");
            //sino
            }else{
                //se le dice al usuario que no atinó
                System.out.println("Lástima, las fichas son diferentes. ");
            }
            
            //se le pregunta al usuario si quiere volver a jugar
            System.out.println("¿Quieres volver a jugar? 1.si 2.no");
            //capturamos
            resp = sc.nextInt();
        } while (resp == 1);

        System.out.println("Gracias por jugar ¡Hasta luego!");
        //cerrar buffer
        sc.close();
        
    }
}
