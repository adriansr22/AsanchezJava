package metodes1_AdrianSanchez;
public class metodes1_2 {

	public static void main(String[] args) 	{
		testMi();
		System.out.println();	
		testMI();
	}

	public static double min(double x, double y, double z) {
		double retorn = x; 
			    
	    if (y < retorn) {
	    	retorn = y; 
	    	}
	    if (z < retorn) {
	    	retorn = z; 
	    	}
	    return retorn; 
	    }
    public static double mitjana(double x, double y, double z) {
        if ((x > y && x < z) || (x > z && x < y)) {
            return x; 
        } else if ((y > x && y < z) || (y > z && y < x)) {
            return y; 
        } else {
            return z; 
        }
    }

		
		public static void testMi() {
			cMi(7.2, 3.5, 1.1, 1.1);
		    cMi(3.5, 7.2, 1.1, 1.1);  
		    cMi(-5.0, 0.0, 2.5, -5.0); 
		    cMi(0.0, 0.0, 0.0, 0.0); 
		    cMi(10.0, 5.0, 15.0, 5.0);
		    
	    }
		
		public static void cMi(double x, double y, double z, double resultat) {
	       System.out.printf("min(%.1f, %.1f, %.1f) -> %.1f  ", x, y, z, resultat);
	       if (resultat != min(x, y, z))
	            System.out.println("Test KO!!!");
	        else
	            System.out.println("Test OK");
		}
		
		public static void testMI() {
			cMI(3, 1, 5, 3);
		    cMI(10, 20, 15, 15);  
		    cMI(7, 7, 7, 7);
		    cMI(-5, 0, -10, -5);
		       
	    }
		
		public static void cMI(double x, double y, double z, double resultat) {
	       System.out.printf("mitjana(%.1f, %.1f, %.1f) -> %.1f  ", x, y, z, resultat);
	       if (resultat != mitjana(x, y, z))
	            System.out.println("Test KO!!!");
	        else
	            System.out.println("Test OK");
		}
		
}







