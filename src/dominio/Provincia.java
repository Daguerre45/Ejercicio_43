package dominio;

import java.util.ArrayList;

public class Provincia{
	private String nombre;

	ArrayList<Municipio> municipios = new ArrayList<>();	
	
	public void annadirMunicipios(Municipio municipio){
		municipios.add(municipio);
	}
		
	public int calcularNumeroTotalHabitantes(){
		int numeroDeHabitantes = 0;
		for(int i = 0; i < municipios.size(); i++){
			numeroDeHabitantes += municipios.get(i).calcularNumeroTotalHabitantes();
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
		return "El nombre de la Provincia es " + nombre 
			+ " el numero de habitantes de la provincia es "
			+ calcularNumeroTotalHabitantes();
	}
}
