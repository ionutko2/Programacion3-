package ejercicio2;

public class ListaPartido {
	private final int MAXSIZE=100;
	/**
	  *Lista de partidos con sus votos
	  */
	Partido [] l;
	int limite;
	
	public ListaPartido() {
		l= new Partido[MAXSIZE];
	}
	public ListaPartido(int size) {
		l= new Partido[size];
	}
	public void annadirVotos(String partido, int votos) {
		for(int i=0;i<limite ;i++) {
			if(l[i].getNombre().equals(partido)) {
				l[i].addVotos(votos);
				return;
			}
		}
			l[limite++]=new Partido(partido,votos);
			return;
		
	}
	public void insertarVotos(String partido, int votos) {
		l[limite++] = new Partido(partido,votos);
	}
	public int getVotos (int posicion) {
		return l[posicion].getVotos();
	}
}
