#include <stdio.h>
#include <stdlib.h>
#include "./libreria.h"

int main(int argc, char const *argv[])
{
	int resultado=0;
	int objetivo=0;

	comprobar_errores(argc, argv);

	printf("Escribe el nivel de triangular que quieres:\n");
 	scanf("%d",&objetivo);

 	resultado = calcular_triangular(objetivo);

	printf("Resultado: %d\n", resultado );
	return 0;
}