package ejercicio1;

public class Pila {
private int [] pila=new int[1000];
private int indice=0;

public int[] getPila() {
	return pila; 
}
public int getIndice() {
	return indice; 
}

public void push( int num ) {
	pila[indice]=num;
	indice++;
}
public void pop() {
	pila[indice]=0;
	indice--;
}
public int size() {	
	return indice;
}

}