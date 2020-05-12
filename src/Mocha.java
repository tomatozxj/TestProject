/**
 * @ClassName Mocha
 * @Description TODO
 * @Author zhangxj
 * @Date 2020/3/19 15:57
 * @Version 1.0
 **/
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        System.out.println("Mocha cost is called");
        return 0.20+beverage.cost();
    }
}
