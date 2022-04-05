
public class SeleccionBurbuja {
boolean ordenado;
	int []vector= new int [100000];
	//de izquierda a derecha llevando el mayor al final y luego viceversa
	void seleccionBurbujaSacudida() {
		
		int ultimapos=0;
		int primerapos=0;
		do {
			ordenado=true;
			for(int j=primerapos;j<(vector.length-(ultimapos+1));j++) {
			if (vector[j]>vector[j+1]) {
				ordenado=false;
				int aux=vector[j];
				vector[j]=vector[j+1];
				vector[j+1]=aux;
				}
			}
			if(ordenado==true) {
				return;
			}

			ultimapos++;
			for(int k=vector.length-(ultimapos+1);k>(vector.length-(vector.length-(primerapos+1)));k--) {
				if (vector[k]<vector[k-1]) {
					ordenado=false;
					int aux= vector[k];
					vector[k]=vector[k-1];
					vector[k-1]=aux;
				}
				}
			primerapos++;
			if(ordenado==true) {
				return;
			}
			}
		while((primerapos+ultimapos)<vector.length);
		}
	//de derecha a izquierda llevando el menor al principio
	void seleccionBurbujaBien() {
		for (int i=vector.length-1;i>0;i--) {
			for(int j=i;j<(vector.length-(i-1));j--) {
				if (vector[j]<vector[j-1]) {
					int aux= vector[j];
					vector[j]=vector[j-1];
					vector[j-1]=aux;
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		SeleccionBurbuja prueba= new SeleccionBurbuja();
		prueba.seleccionBurbujaSacudida();
	 for(int i=0;i<prueba.vector.length;i++) {
		 System.out.println(prueba.vector[i]);
	 }
	}



	

}
