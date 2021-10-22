package aplicacion;

import dominio.*;

public class Principal{
	
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
