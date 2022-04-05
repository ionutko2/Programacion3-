package ejercicio1;

import java.util.Random;

public class Main {

	public static int numeroAleatorio() {
		Random r = new Random();
		int numero_random=r.nextInt(2000); 
	return numero_random;
	}
	
	public static void main(String[] args) {
		Pila pila = new Pila();
		int numero_random;
		for (int i = 0; i < 100; i++) {
			numero_random=numeroAleatorio();
			if(numero_random < 1300) {
				pila.push(numeroAleatorio());
			}else {
				if (pila.getIndice()>0 ) {
					pila.pop();
				}
			}
		}
		// este for vale pa imprimir la pila e ir borrando cada valor que es imprimido
		for(int contador = pila.getIndice(); contador>0;contador--) {
			System.out.println(pila.getPila()[contador]);
			pila.getPila()[contador]=0;
		}
		
	}

}