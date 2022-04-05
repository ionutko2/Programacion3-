import java.util.Scanner;
public class InserccionDirecta {
	int [] lista = new int[5];
	int numero = 0;
	Scanner teclado = new Scanner(System.in);
	InserccionDirecta(){
		for (int i = 0; i < lista.length; i++) {
			lista[i] = teclado.nextInt();
		}
	}
	public void inserccion() {
		for (int i = 1; i < lista.length; i++) {
			for (int j = 0; j < i; j++) {
				if(lista[i] < lista[j]) {
					numero = lista[i];
					for (int k = i; k > j; k--) {
						lista[k] = lista[k - 1];
					}
					lista[j] = numero;
				}
			}
		}
	}
	public void buscar() {
		int numero1;
		int primero = 0;
		int ultimo = lista.length;
		boolean bien = false;
		System.out.println("Escribe un número de los de la lista");
		numero1 = teclado.nextInt();
		while(primero <= ultimo && bien == false) {
			int mitad = (primero + ultimo)/2;
			System.out.println(mitad);
			if (numero1 == lista[mitad]) {
				System.out.println(numero1 + " Esta aqui: " + mitad);
				bien = true;
			}else if (numero < lista[mitad]) {
				ultimo = mitad;
			}else {
				primero = mitad;
			}
		}
	}
	public void inserccionBinaria() {

	}
	
	public void seleccionDirecta() {
		int menor;
		for (int j = 0; j < lista.length-1; j++) {
			menor = j; 
			for (int i = j + 1; i < lista.length; i++) {
				if (lista[menor] > lista[i]) {
					menor = i;
				}
			}
			if (j != menor) {
				lista[j] = lista[menor];
			}
			 
			
			for(int i = 0; i < lista.length; i++) {
				System.out.println("lista"  + lista[i]);
			}
		}
		
	}
}
