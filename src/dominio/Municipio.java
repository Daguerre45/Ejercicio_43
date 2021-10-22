package dominio;

import java.util.ArrayList;

public class Municipio{
	private String nombre;
	
	ArrayList <Localidad> localidades = new ArrayList<>();

	public void annadirLocalidad(Localidad localidad){
		localidades.add(localidad);
	}
	

	public int calcularNumeroTotalHabitantes(){
		int numeroDeHabitantes = 0;
		for (int i = 0; i < localidades.size(); i++) {
			numeroDeHabitantes += localidades.get(i).getNumeroDeHabitantes();
		}
		return numeroDeHabitantes;
		
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	@Override

	public String toString(){
		return "El nombre del Municipio es " + nombre 
			+ " el numero de habitantes del municipio es "
		       	+ calcularNumeroTotalHabitantes();
	}	
	
}
