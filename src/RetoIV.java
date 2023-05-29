import java.util.Scanner;
public class RetoIV {
    public static void main(String[] args) {
        /*Haciendo uso de matrices desarrolle un programa que permita simular
        las siguientes acciones de una maquina expendedora de dulces con
        capacidad para 16 productos:

        ❑ Permita llenar la máquina con 16 nombres de productos y su

        respectivo precio.

        ❑ Muestre el catálogo de productos con el código del producto

        (posición), nombre y precio de cada producto ingresado. */
        
        //declarar variables
        int fil, col;
        //declarar e inicializar array
        String productos[][]  = new String[4][4];

        //llenar matriz
        productos[0][0] = "Papas Margarita \n|$1500";
        productos[0][1] = "Galletas Wafer \n|$800";
        productos[0][2] = "Chocolatina Jet \n|$1000";
        productos[0][3] = "Chiclets Adams \n|$600";
        productos[1][0] = "Manimoto \n|$800";
        productos[1][1] = "Chocorramo \n|$1300";
        productos[1][2] = "Agua Cristal \n|$1500";
        productos[1][3] = "CocaCola \n|$1700";
        productos[2][0] = "Jugo Hit \n|$1200";
        productos[2][1] = "Trocipollo \n|$1300";
        productos[2][2] = "BonBonBum \n|$500";
        productos[2][3] = "Barquillo \n|$300";
        productos[3][0] = "Galletas festival \n|$700";
        productos[3][1] = "Gol \n|$1000";
        productos[3][2] = "Nucita \n|$600";
        productos[3][3] = "Besitos \n|$300";

        //mostrar catalogo de productos
        System.out.println("Este es el catálogo de productos con su respectivo código y precio: ");

        for(int filas = 0; filas<productos.length; filas++){
            for(int columnas = 0; columnas<productos.length; columnas++){
                System.out.println("__________________");
                System.out.println("|" + filas +""+ columnas);
                System.out.println("|" + productos[filas][columnas]);
                System.out.println("|_________________\n" );                
            }
        }

        //instanciar clase scanner
        Scanner sc = new Scanner(System.in);


        //preguntar al usuario el producto que quiere
        System.out.println("Ingrese la posición del producto que desea comprar separada por un espacio (ejemplo: 0 1): ");

        //capturar datos
        fil = sc.nextInt();
        col = sc.nextInt();

        //for para mostrar el producto comprado
        for (int filas = 0; filas < productos.length; filas++) {
            for (int columnas = 0; columnas < productos.length; columnas++) {
                if (fil == filas && col == columnas) {
                    System.out.println("El producto comprado es: ");
                    System.out.println("__________________");
                    System.out.println("|" + filas +""+ columnas);
                    System.out.println("|" + productos[filas][columnas]);
                    System.out.println("|_________________\n" ); 
                    System.out.println("¡Gracias por su compra!");
                }
            }
        }

        System.out.println("¡Hasta luego!");

        //cerrar buffer
        sc.close();
    }
}
