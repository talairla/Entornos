#include <stdio.h>
int main(int argc, char const *argv[])
{
	float numerador;
	float denominador;
	float resultado;

	numerador = 4;
	denominador = 5;
	resultado = numerador / denominador;
	printf("El numerador es: %f\n",numerador);
	printf("El denominador es: %f\n",denominador);
	printf("El resultado es: %f\n",resultado);

	return 0;
}