
public class SeleccionDirecta {

	int []vector= {1,4,6,13,34,54,42,2,9};
	void seleccionDirecta() {
		int menor=0;
		for(int i=0; i<vector.length;i++) {
			menor=i;
			for(int j=i;j<vector.length;j++) {
			if(vector[i]>vector[j]) 
				menor=j;
			}
			if (i!=menor) {
				int aux= vector[i];
				vector[i]=vector[menor];
				vector[menor]=aux;
			}
		}
		
	}
	public static void main(String[] args) {
	 SeleccionDirecta prueba = new SeleccionDirecta();
	 prueba.seleccionDirecta();
	 for(int i=0;i<prueba.vector.length;i++) {
		 System.out.println(prueba.vector[i]);
	 }
	}

}
