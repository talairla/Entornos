#include <stdio.h>
#include <stdlib.h>
#include "./libreria_booleana.h"

int main()
{

    char c='9';

    if(es_letra(c)){
        printf("Has escrito la letra: ");
    }
    printf("%c\n",c);
}
