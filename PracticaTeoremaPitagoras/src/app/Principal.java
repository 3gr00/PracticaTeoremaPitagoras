package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Creamos un triangulo rectangulo con catetos enteros entre 0 y 10.
		 */
		

		TrianguloRectangulo t1 = new TrianguloRectangulo(4, 8);

		//Triangulo por defecto 
		
		TrianguloRectangulo t2 = new TrianguloRectangulo();
		
		/**
		 * Calcular area y perimetro triangulo 1
		 */
		
		double a1 = t1.area();
        double p1 = t1.perimetro();
        
        /**
         * Calcular area y perimetro triangulo 2
         */
        
        double a2 = t2.area();
        double p2 = t2.perimetro();



	}

}
