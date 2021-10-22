compilar:limpiar
	mkdir bin
	javac src/dominio/Localidad.java -d bin
	javac -cp bin src/dominio/Municipio.java -d bin
	javac -cp bin src/dominio/Provincia.java -d bin
	javac -cp bin src/aplicacion/Principal.java -d bin
ejecutar:compilar
	java -cp bin aplicacion.Principal
limpiar:
	rm -rf bin
