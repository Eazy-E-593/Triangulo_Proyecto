
package triangulo_proyecto;

import java.util.Scanner;

public class Triangulo_Proyecto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Ingrese el número de filas de la matriz: ");
        n = sc.nextInt();

        Metodo tri = new Metodo(n);
        tri.Matriz();
    }
}
