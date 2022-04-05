package ejercicio1;
public class PilaVectorProfe extends PilaEnterosProfe {

	// vector que almacena la pila
	private int [] pila = new int [MAXSIZE];
	//�ltima posici�n usada en el vector: cantidad de elementos en la pila
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
		// Si la pila no esta vac�a
		if( cima > 0 ) {
			return pila[--cima];
		}
		throw new IndexOutOfBoundsException("Pila vac�a");
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return cima;
	}

}
