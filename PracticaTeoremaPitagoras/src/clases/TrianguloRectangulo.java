package clases;

public class TrianguloRectangulo {

	//Cateto 1
	double a;
	//Cateto 2
	double b;
	//hipotenusa
	double c;
	
	/**
	 * Constructor por defecto 
	 */
	
	public TrianguloRectangulo () {
		
		this.a = 1;
		this.b = 1;
		this.c = calcularHipotenusa();
		
	}
	
	/**
	 * Constructor que recibe 2 catetos
	 * @param a cateto 1
	 * @param b cateto 2
	 */
	
	public TrianguloRectangulo (double a, double b) {
		
	        if (a <= 0 || b <= 0) {
	            throw new IllegalArgumentException("Los catetos deben ser mayores que cero.");
	        }else {
	        	this.a = a;
		        this.b = b;
		        this.c = calcularHipotenusa();
	    }

	}
	
	/**
	 * Calcular la Hipotenusa
	 * @return Hipotenusa
	 */
	
	public double calcularHipotenusa () {
		
		return  Math.sqrt((a*a) + (b*b));
		
	}
	
	/**
	 * Calcular area
	 * @return area
	 */
	
	public double area() {
		
        return (a * b) / 2;
        
    }
	
	/**
	 * Calcular Perimetro
	 * @return Perimetro
	 */
	
	public double perimetro() {
		 
		return a + b + c;
	        
	    }


	/**
	 * GET A
	 * @return a
	 */
	
	public double getA() {
		
        return a;
    }
	
	/**
	 * GET B
	 * @return b
	 */
	
	public double getB() {
		
        return b;
    }

	
	/**
	 * ToString
	 */
	
	public String toString () {
		
		String mensaje = "";
		
		mensaje += "Cateto 1: " + this.a + "\n";
		mensaje += "Cateto 2: " + this.b + "\n";
		mensaje += "Hipotenusa : " + this.c + "\n";
		
		return mensaje;
		
	}

	
}
