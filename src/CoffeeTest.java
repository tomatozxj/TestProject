/**
 * @ClassName CoffeeTest
 * @Description TODO
 * @Author zhangxj
 * @Date 2020/3/19 16:23
 * @Version 1.0
 **/
public class CoffeeTest {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage.getDescription();
        System.out.println(beverage.getDescription()+beverage.cost());
    }
}
