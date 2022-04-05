
public class Buscar2 {
	public boolean Buscar(){
		String [] lista = new String [100];
		String oclave = "hola";
		boolean hola = false;
		int p = 0; //primero
		int u = lista.length -1; //ultimo
		while (p <= u) {
			int m = (o+u)/2; //mitad
			if (ocadena == lista[m].clave) {
				hola = true;
				return hola;
			}else if(oclave <lista[m].clave) {
				u = m;
			}else{
				p = m;
			}
		}return (clase == lista[m].clave);
	}
}
