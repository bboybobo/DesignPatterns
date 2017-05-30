package simpleFactory;

public class OperateFactory {
	public static Calculate createOperate(String operate){
		Calculate oper = null;
		switch (operate) {
		case "+":
			oper = new AddOperate();
			break;
		case "-":
			oper = new SubOperator();
			break;
		default:
			break;
		}
		return oper;
	}
}
