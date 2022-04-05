
public class Shellshort {
	int [] lista = new int [1000000];
	int aux;
	boolean ordenado = true;
	int [] k = {9,5,3,1};
	
	public void shellshort() {
		do {
			ordenado = true;
			for (int j = 0; j < k.length; j++) {
				for (int i = 0; i < (lista.length - k[j]); i++)   {
					if (lista[i] > lista [i+k[j]]) {
						aux = lista[i];
						lista[i] = lista[i+k[j]];
						lista[i + k[j]] = aux;
						ordenado = false;
					}
				}
				
			}	
		}while (ordenado == false);
		
	}
	public void shellshort_bien() {

		for (int j = 0; j < k.length; j++) {
			for (int i = 0; i < (lista.length - k[j]); i++)   {
				
				 int l = i;
				 aux = lista[l + k[j]];
				 while (l >= 0 && lista[l] > aux) {
					 lista[l +k[j]] = lista[l];
					 l -= k[j];
				 }
				 lista[l + k[j]] = aux;
			}
			
		}	
	}
			
		
	public static void main(String[] args) {
		Shellshort hola = new Shellshort();
		for(int i = 0; i < hola.lista.length; i++) {
			System.out.println("al principio " + hola.lista[i]);
		}
		System.out.println(System.currentTimeMillis());
		hola.shellshort_bien();
		System.out.println(System.currentTimeMillis());
		for(int i = 0; i < hola.lista.length; i++) {
			System.out.println("al final " + hola.lista[i]);
		}
		
	}
}
