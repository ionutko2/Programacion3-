package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] votosPartidos = {10000, 25000, 30000, 12000};
		// rellenamos la matriz con el metodo y la imprimimos
		int[][]matriz = rellenarMatriz(votosPartidos);
		imprimir(matriz);
		
		
		
		
		
		
	}
	static int[][] rellenarMatriz (int[] votosPartidos){
		int[][] matriz = new int [5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0) {
					matriz[i][j] = j + 1;
				}
				else {
					matriz[i][j] = votosPartidos[i-1] / matriz[0][j];
				}
				
			}
		}
		return matriz;
	}
	static void imprimir (int[][]matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	static int[] votos (int[][] matriz) {
		int[] votos = new int [5];
		int max = matriz[0][0];
		for (int k = 0; k < 5; k++) {
			for (int i = 1; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length - 1; j++) {
					if (matriz[i][j] > matriz[i][j+1]) {
						max = matriz[i][j];
					}
				}
			}
			votos[k] = max; 
		}
		
		return votos;
	}
}
