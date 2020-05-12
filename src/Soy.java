/**
 * @ClassName Soy
 * @Description TODO
 * @Author zhangxj
 * @Date 2020/3/19 16:22
 * @Version 1.0
 **/
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public  Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        System.out.println("Soy cost is called");
        return 0.11+beverage.cost();
    }
}
