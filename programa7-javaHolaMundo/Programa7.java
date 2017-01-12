public class Programa7{
	
	public static void main(String[] args) {

		Double res;
		Double operando1;
		Double operando2;

		if(args.length==2){
			
			operando1 = Double.parseDouble(args[0]);
			operando2 = Double.parseDouble(args[1]);

			res = operando1 + operando2;
			System.out.println("Resultado = " + res);
			
		}else{
			System.out.println("Error en los argumentos/parámetros");
		}
	}	
}