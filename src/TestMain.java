import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String str = df.format(new Date(Long.valueOf(1551974400000L)));
//        System.out.println(str);
        Date currentTime = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String currentTimeString = df.format(currentTime);
        //如果当前数据的活动开始时间等于或小于系统时间，则设置为进行中
        String activityStartDateString = df.format("2019-07-04");
        if (String.valueOf(DateCrossUtil.compare_date(activityStartDateString, currentTimeString)).equals("0")
                || String.valueOf(DateCrossUtil.compare_date(activityStartDateString, currentTimeString)).equals("-1")){
            System.out.println();
            //测试本地创建分支提交
        }
    }
}
