package decoratorPattern;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

//客户端使用
public class Client {
    public static void main(String[] args) throws Exception{
        Compnent compnent = new ConcreteCompnet();
        compnent = new ConcreteDecorator1(compnent);
        compnent = new ConcreteDecorator2(compnent);

        //上面三句话等同于下面这一句
        Compnent compnent1 = new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteCompnet()));

        compnent.operate();

        //类似的，java.io包中我们常用的这句话也可以理解了：
        InputStream is = new DataInputStream(new BufferedInputStream(new FileInputStream("a.txt")));




    }
}
