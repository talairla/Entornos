## Un Makefile nos ayuda a compilar, crear pruebas, limpiar etc.
## Utiliza el programa make del entorno de linux. 
## Instalar make: sudo apt-get install make (también está incluido en el build-essentials)
## En el Makefile el caracter almohadilla '#' intruduce un comentario como estas líneas.
#
##El makefile se compone de reglas con esta estructura (nótese que antes de cada
##comando va un caracter tabulador (NO SON ESPACIOS, ES UN TABULADOR):
##Regla de Makefile:
# objetivo: dependencia1 dependencia2 dependencia3
# 	comando1
# 	comando2
#
#Las dependencias (o prerequisitos) pueden ser también otros objetivos:
#	-Véase abajo el objetivo all que sólo depende de otro objetivo que es $(TARGET)
#
#Tanto comandos como dependencias pueden omitirse:
#	-Véase abajo el objetivo all, sin comandos
#	-Véase abajo el objetivo clean, sin dependendias
#
#Sustituciones en el Makefile:
# VARIABLE=valor
#	Para utilizarla variable se pone $(VARIABLE) dentro de las reglas, abajo sucede con:
#	CC, CFLAGS y TARGET
#
# $@
# 	sustituye al nombre del objetivo de la regla en la que esta.
#
# $<
#	sustituye a la primera dependencia (o prerrequisito) de la lista
#
# $^
#	sustituye a toda la lista de dependencias o prerrequisitos
#
#Estas sustituciones nos permiten generar Makefiles genéricos que funcionen para la
#compilación de diferentes programas.
#
#Dividir la compilacion en reglas diferentes de un Makefile nos permite evitar
#la compilación de un fichero si éste no ha cambiado, con lo que nos ahorra tiempo.
#además, es muy cómodo de utilizar. La orden make (a solas) intentará crear el
#primer objetivo definido.

#Si queremos llamar a un objetivo concreto usaremos: make objetivo_concreto
#Desde el terminal, y en la misma carpeta en que se encuentre el Makefile.

#Por último, el fichero debe llamarse exactamente Makefile (con la M mayúscula y el resto no)
#para que sea leído por defecto por la orden make. Si quisieramos crear varios Makefiles podemos
#hacer que make lea otro Makefile que no sea el por defecto con el parámetro -f. Por ejemplo:
#make -f Makefile2

CC=g++
CFLAGS= -Wall
TARGET=programa

all: $(TARGET)

#En esta regla no se aplican sustituciones.
libreria.o: libreria.c libreria.h
	gcc -Wall -c libreria.c -o libreria.o

#En esta regla aplicacando sustituciones.
libreria2.o: libreria2.c libreria2.h
	$(CC) $(CFLAGS) -c $< -o $@

$(TARGET): libreria.o libreria2.o triangulares3.c
	$(CC) $(CFLAGS) $^ -o $@

#La regla clean se incluye en muchos proyectos como un estándar de facto
#y normalmente se usa para borrar los ficheros compilados ejecutables generados
#podría llamarse limpiar o cualquier otra cosa, pero la llamaremos clean.
clean:
	rm $(TARGET)
	rm *.o
