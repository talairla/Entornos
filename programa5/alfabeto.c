#include <stdio.h>
#include <stdbool.h>
#include "libreria_booleana.h"

void imprimir_informacion_caracter(char);

int main(int argc, char const *argv[])
{
	char c=0;
	int i=0;
	while ( i < 256 ){

		printf("%d - %c",i,c);
		imprimir_informacion_caracter(c);
		c++;
		i++;

	}
	return 0;
}

void imprimir_informacion_caracter(char c){
	printf("\t");
	printf("¿Es un número?: ");
	if(es_numero(c)){
		printf("Sí - ");
	}else{
		printf("No - ");
	}
	printf("¿Es una letra?: ");
	if(es_letra(c)){
		printf("Sí - ");
	}else{
		printf("No - ");
	}
	printf("¿Es alfanumérico?: ");
	if (es_alfanumerico(c)){
		printf("Sí - ");
	}else{
		printf("No - ");
	}
	printf("\n");
}