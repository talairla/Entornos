#include "./libreria.h"

int calcular_triangular(int nivel){
	
	int acumulador=0;

 	if(nivel == 0 || nivel < 0){
 		printf("El número no es válido, debe ser un numero natural.\n");
 		printf("Saliendo...");
 		printf("\n");
 		exit(-1);
 	}

	while (nivel > 0){
		acumulador = acumulador + nivel;
		nivel--;
	}
	return acumulador;

}

void comprobar_errores(int num_parametros, char const *vector_parametros[]){

	if (num_parametros != 1){
		printf("Uso incorrecto\n");
		printf("El uso correcto es:\n");
		printf("\t%s\n", vector_parametros[0]);
		exit(-1);
	}
}