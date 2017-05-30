package strategy;
import java.util.*;
public class TestStrategy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入单价：");
		double price = in.nextDouble();
		System.out.println("请输入数量：");
		double num = in.nextDouble();
		double result = price * num;
		String info = "1:正常收费\n 2:满300反100\n 3:打八折\n";
		System.out.println("请输入序号来选择收费方式：");
		int selected = in.nextInt();
		try {
			CashContext cashContext = new CashContext(selected);
			result = cashContext.getResult(result);
		} catch (Exception e) {
			System.out.println("输入有误");
		}
		System.out.println("总价为：" + result + "元");
	}

}
