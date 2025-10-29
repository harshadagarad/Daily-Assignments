package Utility;

public class ScientificCalculator extends SimpleCalculator implements iScientificCalculator {

	
	
	
	


@Override
	public double sin(double angle) {
		// TODO Auto-generated method stub
		return angle;
	}

	@Override
	public double cos(double angle) {
		// TODO Auto-generated method stub
		return angle;
	}

	@Override
	public double tan(double angle) {
		// TODO Auto-generated method stub
		return angle;
	}

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return super.add(a, b);
	}

	@Override
	public double subtract(int a, int b) {
		// TODO Auto-generated method stub
		return super.subtract(a, b);
	}

	@Override
	public double multiply(int a, int b) {
		// TODO Auto-generated method stub
		return super.multiply(a, b);
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		return super.divide(a, b);
	}

public static void main(String [] args) {
	ScientificCalculator c = new ScientificCalculator();
	
	//System.out.println(Math.toRadians(20.8));
	System.out.println(c.add(2, 3));
	System.out.println(c.subtract(2, 3));
	System.out.println(c.multiply(2, 3));
	System.out.println(c.divide(6, 3));
	
	//System.out.println(Math.sin(20.6));
	//System.out.println(Math.cos(20.6));
	//System.out.println(Math.tan(20.6));
	
	
	System.out.println(c.cos(20.4));
	//System.out.println(c.tan(20.6));
}
}







