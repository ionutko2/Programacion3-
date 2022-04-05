
public class Main {

	public static void main(String[] args) {
		Shellshort hola = new Shellshort();
		for(int i = 0; i < hola.lista.length; i++) {
			System.out.println("al principio " + hola.lista[i]);
		}
		
		hola.shellshort();
		for(int i = 0; i < hola.lista.length; i++) {
			System.out.println("al final " + hola.lista[i]);
		}
		
	}

}
