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
 * Esta clase Municipio, Creo las variables de Municipio con sus setters y getters 
 * y un método para sumar todos los habitantes que tiene esos municipios respecto a sus Localidades.
 * @author Alberto Daguerre
 * @version final 22/10/2021
 */

public class Municipio{
	private String nombre;
	ArrayList <Localidad> localidades = new ArrayList<>();

	/**
	 * Método en el cual puedo añadir localidades a mi municipio.
	 * @param localidad
	 */
	public void annadirLocalidad(Localidad localidad){
		localidades.add(localidad);
	}
	
	/**
	 * Método en el cual me calcula el número total de habitantes que hay dentro del municipio según las localidades que tenga asignadas dicho municipio.
	 * @return
	 */

	public int calcularNumeroTotalHabitantes(){
		int numeroDeHabitantes = 0;
		for (int i = 0; i < localidades.size(); i++) {
			numeroDeHabitantes += localidades.get(i).getNumeroDeHabitantes();
		}
		return numeroDeHabitantes;
		
	}

	/**
	 * Método que me sirve para coger el nombre de mi municipio.
	 * @return
	 */

	public String getNombre(){
		return nombre;
	}

	/**
	 * Método que me sirve para añadirle un nombre cualquiera a mi municipio.
	 * @param nombre
	 */

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	 * Método que me sirve para imprimir todos los datos de mi municipio
	 * @return
	 */
	
	@Override

	public String toString(){
		return "El nombre del Municipio es " + nombre 
			+ " el numero de habitantes del municipio es "
		       	+ calcularNumeroTotalHabitantes();
	}	
	
}
