package paquete2;

import Paquete1.Mesa;

public class PruebaMesa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mesa m1 = new Mesa(4, "Madera", 3000, 4000, 1000);
		
		System.out.println(m1.toString());
		System.out.println(m1.getMaterial());
		System.out.println(m1.toXML());
	}

}
