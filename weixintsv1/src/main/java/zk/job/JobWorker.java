package zk.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import zk.util.Pusher;


/**
 *@ClassName JobWorker
 *@Description TODO
 *@Author ydzhao
 *@Date 2022/8/2 16:00
 */
@Component
public class JobWorker {
    //要推送的用户openid
    private static String openId = "o8cwa60qwLNeyNsRZYFahzZpW5UQ";

    @Scheduled(cron = "0 30 7 * * ?")
    public void goodMorning(){
        Pusher.push(openId);
    }

}
