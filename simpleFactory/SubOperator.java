package simpleFactory;

public class SubOperator implements Calculate{
	@Override
	public double getResult(double num1, double num2) {
		return num1 - num2;
	}

}
