#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	int acumulador=0;
	int objetivo=0;
	if (argc != 1){
		printf("Uso incorrecto\n");
		printf("El uso correcto es:\n");
		printf("\t%s\n", argv[0]);
		exit(-1);
	}

	printf("Escribe el nivel de triangular que quieres:\n");
 	scanf("%d",&objetivo);

 	if(objetivo == 0 || objetivo < 0){
 		printf("El número no es válido, debe ser un numero natural.\n");
 		printf("Saliendo...");
 		printf("\n");
 		exit(-1);
 	}

	while (objetivo > 0){
		acumulador = acumulador + objetivo;
		objetivo--;
	}

	printf("Resultado: %d\n", acumulador );
	return 0;
}