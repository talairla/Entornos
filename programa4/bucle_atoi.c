#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	int resultado;
	int b;

	printf("Programa: %s\n", argv[0] );
	printf("Primer parámetro: %s\n", argv[1] );
	
	b = atoi( argv[1] );

	while (b >= 0){
		printf("%d\n", b );
		b--;
	}

	printf("Resultado: %d\n", resultado );

	return 0;
}