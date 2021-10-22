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

/**
 * Esta clase Localidad, Creo las variables de localidad con sus setters y getters
 * @author Alberto Daguerre
 * @version final 22/10/2021
 */

public class Localidad{
	
	private String nombre;
	private int numeroDeHabitantes;

	/**
	 * Este método me coge el valor de nombre, ya que es privado.
	 * @return
	 */

	public String getNombre(){
		return nombre;
	}

	/**
	 * Este método me coge el valor de número de habitantes, ya que es privado.
	 * @return
	 */

	public int getNumeroDeHabitantes(){
		return numeroDeHabitantes;
	}

	/**
	 * Este método sirve para poder añadirle un nombre cualquiera a la Localidad.
	 * @param nombre
	 */

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	 * Este método sirve para poder añadirle un numero de habitantes cualquiera a la Localidad.
	 * @param numeroDeHabitantes
	 */

	public void setNumeroDeHabitantes(int numeroDeHabitantes){
		this.numeroDeHabitantes = numeroDeHabitantes;
	}

	/**
	 * Método el cual me permite imprimir la informacion de Localidad.
	 * @return
	 */

	public String toString(){
		return "La localidad " + nombre + " tiene " + numeroDeHabitantes + " habitantes.";
	}

}
