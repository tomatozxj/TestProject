/**
 * @ClassName Beverage
 * @Description TODO
 * @Author zhangxj
 * @Date 2020/3/19 15:50
 * @Version 1.0
 **/
public abstract class  Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
