
public class Buscar {
	String [] lista = new String [100];
	String oclave = "hola";
	 public boolean buscar() {
		 boolean hola = false;
		 if (oclave.charAt(0) >= 'm') {
			 for (int i = (lista.length/2); i < lista.length; i++) {
				 if (oclave == lista[i]) {
					 hola = true;
				 }else {
					 hola = false;
				 }
				 if (!hola) {
					 for (int j = 0; j < (lista.length/2); j++) {
						 if (oclave == lista[j]) {
							 hola = true;
						 }else {
							 hola = false;
						 }
					 }
				 }
			 }
			 
		 }else {
			 for (int i = 0; i < lista.length; i++) {
				 if (oclave == lista[i]) {
					 hola = true;
				 }else {
					 hola = false;
				 }
			 }
		 }
		return hola; 
	 }
}
