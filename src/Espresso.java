/**
 * @ClassName Espresso
 * @Description TODO
 * @Author zhangxj
 * @Date 2020/3/19 15:55
 * @Version 1.0
 **/
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        System.out.println("Esresso cost is called");
        return 1.99;
    }
}
