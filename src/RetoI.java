import java.util.Scanner;
public class RetoI {
    public static void main(String[] args) {
        /*programa que solicite la cantidad de notas a evaluar en
        una materia y el valor de cada una de dichas notas. Calcule el
        promedio de dichas de notas para obtener la nota final y agregue las
        siguientes anotaciones según corresponda:

        ✓ Si la nota es menor que 3 Reprobaste
        ✓ Si la nota está entre 3 y 4.0 Pasaste Raspando
        ✓ Si la nota es mayor que 4.0 Aprobaste con buenos resultados*/

        System.out.println("Bienvenido, aquí podrá ingresar n cantidad de notas a evaluar, sacar el promedio de estas y saber si el estudiante paso o no.");

        //declaramos variables
        int cant;
        float suma = 0, prom = 0;

        //instanciar clase scanner
        Scanner sc = new Scanner(System.in);

        //solicitar al usuario la cantidad de notas
        System.out.print("Ingrese la cantidad de notas a promediar: ");

        //capturamos dato
        cant = sc.nextInt();

        //declaramos array y definimos su tamaño

        float notas[] = new float[cant]; 

        //for para solicitar las notas
        for (int nota = 0; nota < cant; nota++) {

            do {
                //solicitamos la nota
                System.out.println("Ingrese la nota #" + (nota+1) + " en un rango de 1.0 a 5.0: ");

                //capturamos dato en el array
                notas[nota] = sc.nextFloat();

            //mientras la nota ingresada sea menor a 1 o mayor a 5 se reinicia el ciclo
            } while (notas[nota] < 1 || notas[nota] > 5);

            //sumamos notas
            suma += notas[nota];
        }

        //sacamos promedio
        prom = suma/cant;

        //if para mostrarle al usuario si el estudiante pasa o no
        if (prom < 3) {
            //el estudiante reprueba
            System.out.println("El estudiante tiene un promedio de " + prom + " por tanto reprueba.");
        }else if (prom >= 3 && prom < 4){
            //el estudiante pasa raspando
            System.out.println("El estudiante tiene un promedio de " + prom + " por tanto pasa raspando.");
        }else if (prom > 4){
            //el estudiante pasa con buenos resultados
            System.out.println("El estudiante tiene un promedio de " + prom + " por tanto pasa con buenos resultados.");
            
        }

        System.out.println("Hasta luego.");

        //cerramos buffer
        sc.close();
    }
}
