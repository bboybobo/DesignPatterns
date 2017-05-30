//返利收费实现类
package strategy;

public class CashReturn implements CashSuper {
	private double moneyCondition = 0D;
	private double moneyReturn = 0D;
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	@Override
	public double acceptCash(double money) {
		double result = money;
		if(money >= moneyCondition){
			result -= Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
