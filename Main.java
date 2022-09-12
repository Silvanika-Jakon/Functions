import java.lang.Math.*;

class Main {
    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(cosinus(45.0));
        System.out.println(sinus(90.0));
        System.out.println(exp(11.635));
        System.out.println(average(1, 2, 3, 4, 5));
        System.out.println(pow(2, 10));
    }

    public static int fact(int x) {
    	int result = 1;
    	if (x != 0) {
        	for (int elem = 1; elem< x+1; elem++ ) 
        		{result *= elem;}
        }
        else {result = 1;}
        return result;
    }
    
    public static double cosinus(double x) {
    	double rad = Math.toRadians(x);
    	return Math.cos(rad);
    }
    
     public static double sinus(double x) {
    	double rad = Math.toRadians(x);
    	return Math.sin(rad);
	}
	
	public static double exp(double x) {
    	return Math.exp(x);
	}
	
	public static int average(int... array) {
    	int result = 0;
       	for (int elem : array ) 
        		{result += elem;}
        return result / array.length;
    }
    
    public static int pow(int digit, int power){
		int powResult = 1;
    	for (int i = 0; i < power;  i++) {
    		powResult *= digit;
    	}
    	return powResult;
    }

}