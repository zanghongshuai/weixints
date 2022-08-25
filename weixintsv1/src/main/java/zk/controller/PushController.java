package zk.controller;

/**
 *@ClassName PushController
 *@Description TODO
 *@Author ydzhao
 *@Date 2022/8/2 15:48
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zk.util.Pusher;


@RestController
public class PushController {
    //要推送的用户openid
    private static String kq = "o8cwa60qwLNeyNsRZYFahzZpW5UQ";
    private static String zang = "o8cwa6yNB__iGuUGC6Bl_XPuouME";


    /**
     * 微信测试账号推送
     *
     */
    @GetMapping("/push")
    public void push() {
        Pusher.push(kq);
    }

    /**
     * 微信测试账号推送
     * */
    @GetMapping("/push/zang")
    public void pushZyd() {
        Pusher.push(zang);
    }


    /**
     * 微信测试账号推送
     * */
    @GetMapping("/push/{id}")
    public void pushId(@PathVariable("id") String id) {
        Pusher.push(id);
    }
}