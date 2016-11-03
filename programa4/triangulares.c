#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	int acumulador=0;
	int objetivo;
	if (argc != 2){
		printf("Uso incorrecto\n");
		printf("El uso correcto es:\n");
		printf("\t%s núm_orden\n", argv[0]);
		exit(-1);
	}

	printf("Primer parámetro: %s\n", argv[1] );
	
	objetivo = atoi( argv[1] );

	while (objetivo < 0){
		acumulador = acumulador + objetivo;
		objetivo--;
	}

	printf("Resultado: %d\n", acumulador );
	return 0;
}