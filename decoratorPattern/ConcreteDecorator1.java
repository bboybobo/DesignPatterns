package decoratorPattern;

//具体的装饰器实现者1
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Compnent compnent) {
        super(compnent);
    }

    @Override
    public void operate() {
        super.operate();
        System.out.println("装饰器1 进行装饰");
    }
}
