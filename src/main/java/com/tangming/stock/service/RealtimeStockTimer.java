package com.tangming.stock.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 实时股票查询定时器
 *
 * @author : 唐明
 * @date : Created in 11:10 2017/8/30
 * @modified By:
 */
@Service
public class RealtimeStockTimer {
private static final Logger log = LoggerFactory.getLogger(RealtimeStockTimer.class);

    //TODO: 测试方法
    public static void main(String[] args) {
        /*Runnable runnable = () -> {
            // task to run goes here
            System.out.println("Hello !!");
        };
        ScheduledExecutorService service = Executors
                .newSingleThreadScheduledExecutor();
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
        service.scheduleAtFixedRate(runnable, 10, 5, TimeUnit.SECONDS);*/
    }

    //TODO: 测试方法
    @Scheduled(cron = "1/3 * * * * ?")
    public void test() {
        System.out.println(11111);
    }
}
