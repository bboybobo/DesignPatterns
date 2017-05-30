package strategy;

public class CashContext {
	CashSuper cs = null;
	
	public CashContext(int type) {
		switch (type){
			case 1:
				//正常收费
				cs = new CashNomal();
				break;
			case 2:
				//满300反100
				cs = new CashReturn(300, 100);
				break;
			case 3:
				//打八折
				cs = new CashRebate(0.8);
				break;
		}
	}
	
	public double getResult(double money){
		return cs.acceptCash(money);
	}
}
