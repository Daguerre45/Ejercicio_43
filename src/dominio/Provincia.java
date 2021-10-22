/**
 Copyright 2021 Alberto Daguerre Torres
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package dominio;

import java.util.ArrayList;

/**
 * Esta clase Provincia, Creo las variables de Provincia con sus setters y getters 
 * y un método para sumar todos los habitantes que tiene esas provinias respecto a sus municipios.
 * @author Alberto Daguerre
 * @version final 22/10/2021
 */

public class Provincia{
	private String nombre;
	ArrayList<Municipio> municipios = new ArrayList<>();	

	/**
	 * Método que sirve para añadir municipios la provincia
	 * @param municipio
	 */
	
	public void annadirMunicipios(Municipio municipio){
		municipios.add(municipio);
	}

	/**
	 * Método que sirve para calcular el numero total lde habitantes que tiene la provincia respecto a los habitantes que tiene cada municipio 
	 * @return
	 */
		
	public int calcularNumeroTotalHabitantes(){
		int numeroDeHabitantes = 0;
		for(int i = 0; i < municipios.size(); i++){
			numeroDeHabitantes += municipios.get(i).calcularNumeroTotalHabitantes();
		}
		return numeroDeHabitantes;
	}

	/**
	 * Método que me sirve para coger el valor de nombre, ya que es privado
	 * @return
	 */

	public String getNombre(){
		return nombre;
	}

	/**
	 * Método que sir ve para añadir un nombre cualquiera a la provincia.
	 * @param nombre
	 */

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	 * Método que sirve para imprimir todos los datos de provincia.
	 * @return
	 */
	@Override

	public String toString(){
		return "El nombre de la Provincia es " + nombre 
			+ " el numero de habitantes de la provincia es "
			+ calcularNumeroTotalHabitantes();
	}
}
