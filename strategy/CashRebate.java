//打折算法实现类
package strategy;

public class CashRebate implements CashSuper{
	private double moneyRebate = 1D;
	public  CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}
	@Override
	public double acceptCash(double money) {
		return money*moneyRebate;
	}

}
