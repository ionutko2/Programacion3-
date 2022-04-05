package ejercicio1;

public class PilaReferenciaProfe extends PilaEnterosProfe {
	
	// Clase que representa un elemento de la pila
	class ElementoPila{
		// Elemento de la pila
		int elemento;
		ElementoPila siguiente;
		ElementoPila ( int x ){
			elemento = x;
			siguiente = null;
		}
	}
	// vector que almacena la pila
	ElementoPila cima = null;
	//Elementos almacenados en la pila
	int tam = 0;
	
	@Override
	public void push(int x) {
		if ( tam == MAXSIZE) {
			throw new IndexOutOfBoundsException("Pila llena");
		}
		ElementoPila aux = new ElementoPila(x);
		aux.siguiente = cima;
		cima = aux;
		tam++;
	}

	@Override
	public int pop() {
		// Si la pila no esta vacía
		if( cima != null ) {
			ElementoPila aux = cima;
			cima =  cima.siguiente;
			tam--;
			return aux.elemento;
		}
		throw new IndexOutOfBoundsException("Pila vacía");
	}

	@Override
	public int size() {
		ElementoPila aux = cima;
		int size = 0;
		while ( aux != null ){
			size++;
			aux = aux.siguiente;
		}
		return size;
	}

}
