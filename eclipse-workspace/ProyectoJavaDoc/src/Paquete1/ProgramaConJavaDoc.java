package Paquete1;

public class ProgramaConJavaDoc {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Mesa mesa1 = new Mesa(4, "Madera", 1500, 700, 2000);
		Mesa mesa2 = new Mesa(4, "Metal", 500, 500, 700);

		
		System.out.println(mesa1.toString());
		System.out.println(mesa2.toString());
		
		mesa1.setAnchura(1000);
		
		System.out.println(mesa1.toString());
		
		System.out.println(mesa2.material);
		
		//System.out.println(mesa2.num_patas);
		

	}

}
