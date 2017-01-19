package conversor;

import java.util.ArrayList;

public class ConversorDivisas {

	/**
	 * @param args
	 */
	ArrayList<Divisa> divisas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ConversorDivisas(){
		divisas = new ArrayList<Divisa>();
	}
	
	/**
	 * @param divisas
	 */
	public ConversorDivisas(ArrayList<Divisa> divisas) {
		this.divisas = divisas;
	}
	
	
	public void insertarDivisa(String codigo, double valor){
		Divisa divisa_nueva = new Divisa(codigo,valor);
		
		divisas.add(divisa_nueva);
		
	}
	
}
