import java.util.Random;
public class Lista {
	public static void main(String[] args) {
		long t;
		long tiempo = 0;
		for (int k = 0; k < 10; k++) {
		Random aleatorio = new Random();
		Shellshort hola = new Shellshort();
		for(int i = 0; i < hola.lista.length; i++) {
			hola.lista[i] = aleatorio.nextInt(999999999);
		}
		
		t = System.currentTimeMillis();
		hola.shellshort();
		t = System.currentTimeMillis() - t;
		System.out.println("Prueba n?mero " + (k + 1) + " Primer n?mero " + hola.lista[0] + " El n?mero del medio " + hola.lista[50000] + " ?ltimo n?mero " + hola.lista[hola.lista.length - 1] + " Tiempo " + t);
		tiempo = tiempo + t;
		}
		System.out.println(tiempo/100 + " ms");
	}
}
