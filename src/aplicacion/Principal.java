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

package aplicacion;

import dominio.*;

/**
 * Esta clase Principal da valores a todos los datos tanto de Provincia, como de Municipio, como de Localidad 
 * y es la clase en la cual se ejecuta todo el programa
 * 
 * @author Alberto Daguerre
 * @version final 22/10/2021
 */

public class Principal{
	
	/**
	 * Método main en el cual se me inicializa toda la aplicacion
	 * @param args
	 */
	public static void main(String[] args){
		
		Provincia cant = new Provincia();
		cant.setNombre("Cantabria"); 

		Municipio muni1 = new Municipio();
		muni1.setNombre("Ribamontán al Mar");
		cant.annadirMunicipios(muni1);
			
		Localidad loredo = new Localidad();
		loredo.setNombre("Loredo");
		loredo.setNumeroDeHabitantes(709);
		muni1.annadirLocalidad(loredo);

		Localidad somo = new Localidad();
		somo.setNombre("Somo");
		somo.setNumeroDeHabitantes(1704);
		muni1.annadirLocalidad(somo);
		
		System.out.println(cant);
		System.out.println(muni1);
		System.out.println(loredo);
		System.out.println(somo);
	}
}
