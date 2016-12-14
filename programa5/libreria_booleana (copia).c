#include "libreria_booleana.h"

bool es_numero(char x){
	if(x >= 48 && x <= 57){
		return true;
	}else{
		return false;
	}
}

bool es_letra(char x){
	if(es_letra_mayuscula(x) || es_letra_minuscula(x)){
		return true;
	}else{
		return false;
	}
}

bool es_letra_mayuscula(char x){
	if(x >= 65 && x <= 90){
		return true;
	}else{
		return false;
	}
}

bool es_letra_minuscula(char x){
	if(x >= 97 && x <= 122){
		return true;
	}else{
		return false;
	}
}

bool es_alfanumerico(char x){
	if(es_letra(x) || es_numero(x)){
		return true;
	}else{
		return false;
	}
}