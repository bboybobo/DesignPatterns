package simpleFactory;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String op;
		double num1, num2;
		num1 = in.nextDouble();
		op = in.next();
		num2 = in.nextDouble();
		Calculate cal = OperateFactory.createOperate(op);
		System.out.println(cal.getResult(num1, num2));
	}

}
