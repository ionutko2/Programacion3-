package ejercicio2;

import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		int ELECTORES =23563600;
		final int MAXVOTOS = 500;
		final int Partidos =20;
		final int ESCAÑOS =3000;
		
		Random r = new Random();
		int numVotos;
		int electores=ELECTORES;
		
		int [] votos= {10000,25000,30000,12000};
		String []p= new String [Partidos];
		
		for(int i = 1; i <= Partidos; i++) {
			p[i-1] = "p" + (i < 10 ? "0": "") + i;
		}
		
		Votacion v= new Votacion(ESCAÑOS);
		while (electores > 0) {
			numVotos = r.nextInt(MAXVOTOS);
			int auxPartido=r.nextInt(Partidos+2);
			if(auxPartido < Partidos) {
				v.insertarVotos(p[auxPartido], numVotos);
			}
			electores -= numVotos;
		}
		
		v.calcular();
		
		System.out.println(v);
	}

}
