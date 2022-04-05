package ejercicio1;

public abstract class PilaEnterosProfe {

	/**
	 * Número de elementos máximo que soporta la pila
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
