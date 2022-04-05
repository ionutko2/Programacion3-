package ejercicio1;

import java.util.Random;

public class ProgramaProfe {
	public static void main (String [] Args) {
		final int MAXOPERACIONES = 10;
		
		PilaEnterosProfe p = new PilaReferenciaProfe();
		Random r = new Random();
		
		for ( int i = 0; i < MAXOPERACIONES; i++) {
			int x = r.nextInt();
			boolean meter = r.nextBoolean();
			if (meter || i < 20)
				p.push(x);
			else
				p.pop();
		}
		PilaEnterosProfe aux = new PilaVectorProfe();
		while ( p.size() > 0) {
			aux.push(p.pop());
		}
		while ( aux.size() > 0) {
			int x = aux.pop();
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
