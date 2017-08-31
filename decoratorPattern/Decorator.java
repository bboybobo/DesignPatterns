package decoratorPattern;

//装饰器角色
public class Decorator extends Compnent{
    private Compnent compnent;

    protected Decorator(Compnent compnent) {
        this.compnent = compnent;
    }

    public void operate() {
        compnent.operate();
    }
}
