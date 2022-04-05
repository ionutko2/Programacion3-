
public class Quickshort {
	int [] lista = {12,4,6,13,34,54,42,2,99,9,1,56,78};
	int aux;
	public void quickshort(int ini, int fin) {
		int k = 0;
		for (int i = ini; i < fin; i++) {
			if(lista[k] < lista[i]) {
				int j = i - 1;
				aux = lista[i];
				while(j >= ini && lista[j] > aux) {
					lista[j + 1] = lista [j];
					j--;
				}
				lista[k] = aux;
				k = i;
			}
		}
	}
	public void quickshort_bien(int ini, int fin) {
		aux = lista[ini];
		int i = ini, j = fin;
		do {
			while(lista[i] < aux) {
				i++;
			}
			while(lista[i] > aux) {
				j--;
			}
			lista[i] = lista[j];
			lista[j] = aux;
		}while(i < j);
		Quickshort hola = new Quickshort();
		
	}
			
		
	public static void main(String[] args) {
		Quickshort hola = new Quickshort();
		for(int i = 0; i < hola.lista.length; i++) {
			System.out.println("al principio " + hola.lista[i]);
		}
		
		hola.quickshort_bien(0,hola.lista.length);
		for(int i = 0; i < hola.lista.length; i++) {
			System.out.println("al final " + hola.lista[i]);
		}
		
	}
}
