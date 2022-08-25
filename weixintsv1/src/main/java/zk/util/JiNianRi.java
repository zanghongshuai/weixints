package zk.util;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName JiNianRi
 * @Description TODO
 * @Author ydzhao
 * @Date 2022/8/2 17:32
 */
@Logger
public class JiNianRi {
    /**
     * 恋爱
     */
    static String lianAi = "2018-05-21";
    /**
     * 领证
     * /

    /**
     * 结婚
     */
    static String jieHun = "2022-07-08";
    /**
     * 生日
     */
    static String shengRi = "2023-03-14";
    static String linZheng = "2022-03-19";


    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 距离date还有多少天
     * @param date
     * @return
     */
    public static int before(String date) {
        int day = 0;
        try {
            long time = simpleDateFormat.parse(date).getTime() - System.currentTimeMillis();
            System.out.println(simpleDateFormat.parse(date).getTime() + "111:"+System.currentTimeMillis() + "222"+time);
            day = (int) (time / 86400000L);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day;
    }


    /**
     * 已经过去date多少天
     * @param date
     * @return
     */
    public static int after(String date) {
        int day = 0;
        try {
            long time = System.currentTimeMillis() - simpleDateFormat.parse(date).getTime();
            day = (int) (time / 86400000L);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day;
    }

    public static int getJieHun() {
        return before(jieHun);
    }

    public static int getLinZhen() {
        return before(linZheng);
    }

    public static int getLianAi() {
        return before(lianAi);
    }

    public static int getShengRi(){
        return before(shengRi);
    }

    public static void main(String[] args) {
        System.out.println(getShengRi());
    }


}
