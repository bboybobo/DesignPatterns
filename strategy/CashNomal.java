//正常收费实现类
package strategy;

public class CashNomal implements CashSuper{
	@Override
	public double acceptCash(double money) {
		return money;
	}

}
