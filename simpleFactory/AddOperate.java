package simpleFactory;

public class AddOperate implements Calculate{
	@Override
	public double getResult(double num1, double num2) {
		return num1 + num2;
	}

}
