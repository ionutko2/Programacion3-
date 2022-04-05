package ejercicio2;

public class Partido implements Comparable{
	private final String nombre;
	private int votos;
	
	
	public String getNombre() {
		return nombre;
	}
	public int getVotos() {
		return votos;
	}
	
	
	
	public Partido( String nombre ){
		this.nombre=nombre;
		votos=0;
	}
	public Partido(String nombre, int votos){
		this.nombre=nombre;
		this.votos=votos;
	}
	
	public void addVotos( int votos ) {
		if( votos>0 ) 
			this.votos+=votos;
	}
	
	public int compareTo(Object o) {
		return -(votos - ((Partido)o).votos);
		/*if(votos<((Partido)o).votos){
			return -1;
		}else if (votos == ((Partido)o).votos){
			return 0;
		}else { return 1;}*/
	}
}