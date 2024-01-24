
package triangulo_proyecto;

public class Metodo {

    private int n;

    public Metodo(int n) {
        this.n = n;
    }

    public void Matriz() {
        String[][] matrizInf = new String[n][n];
        String[][] matrizSup = new String[n][n];

        // Llenamos la matriz triangular inferior
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                matrizInf[i][j] = "*";
            }
        }

        // Llenamos la matriz triangular superior
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                matrizSup[i][j] = "*";
            }
        }

        System.out.println("Matriz Triangular Inferior:");
        System.out.println(" ");
        imprimirMatriz(matrizInf);

        System.out.println("\nMatriz Triangular Superior:");
        System.out.println(" ");
        imprimirMatriz(matrizSup);
    }

    private void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = " ";
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}