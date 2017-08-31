package decoratorPattern;

//具体构件
public class ConcreteCompnet extends Compnent{
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
