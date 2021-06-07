Algoritmo multiplo_cinco
	
	Definir opciones Como Caracter
	Definir random Como Entero
	
	opciones = "a"
	Mientras opciones == "a" Hacer
		Escribir "Multiplos de 5"
		random = Aleatorio(1,50)
		Escribir random*5
		Escribir " a.- Continuar  s.- Salir"
		leer opciones
	Fin Mientras
FinAlgoritmo
