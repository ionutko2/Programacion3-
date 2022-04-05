package ejercicio1;
public class PilaVectorProfe extends PilaEnterosProfe {

	// vector que almacena la pila
	private int [] pila = new int [MAXSIZE];
	//última posición usada en el vector: cantidad de elementos en la pila
	private int cima = 0;
	
	@Override
	public void push(int x) {
		// Si la pila no esta llena
		if (cima < MAXSIZE) {
			pila[cima++] = x;
		}else {
			throw new IndexOutOfBoundsException("Pila llena");
		}
	}

	@Override
	public int pop() {
		// Si la pila no esta vacía
		if( cima > 0 ) {
			return pila[--cima];
		}
		throw new IndexOutOfBoundsException("Pila vacía");
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return cima;
	}

}
