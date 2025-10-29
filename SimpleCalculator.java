package Utility;


public class SimpleCalculator implements iCalculator {

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}
	
	public static void main(String [] args) {
		SimpleCalculator s = new SimpleCalculator();
		
	     System.out.println(s.add(2, 3));
	     System.out.println(s.subtract(2, 3));
	     System.out.println(s.multiply(2, 3));
	     System.out.println(s.divide(6, 3));
	     
		
	}
	
	
	
	
	

}
