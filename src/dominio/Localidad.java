package dominio;

public class Localidad{
	
	private String nombre;
	private int numeroDeHabitantes;

	public String getNombre(){
		return nombre;
	}

	public int getNumeroDeHabitantes(){
		return numeroDeHabitantes;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setNumeroDeHabitantes(int numeroDeHabitantes){
		this.numeroDeHabitantes = numeroDeHabitantes;
	}

	public String toString(){
		return "La localidad " + nombre + " tiene " + numeroDeHabitantes + " habitantes.";
	}

}
