package decoratorPattern;

//具体的装饰器实现者2
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Compnent compnent) {
        super(compnent);
    }

    @Override
    public void operate() {
        System.out.println("装饰器2 进行装饰");
        super.operate();
    }
}
