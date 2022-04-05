package ejercicio1;

public abstract class PilaEnterosProfe {

	/**
	 * N�mero de elementos m�ximo que soporta la pila
	 */
	public final int MAXSIZE = 100;
	
	/**
	 * Inserta un entero en la pila
	 * @param x El numero a insertar
	 */
	public abstract void push (int x);
	
	public abstract int pop();
	
	public abstract int size();
}
