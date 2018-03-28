package com.hualala.task.config.schedul;

import com.hualala.task.util.DateUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration //主要用于标记配置类，兼备Component的效果。
@EnableScheduling //开启定时任务
public class SchedulingConfig {
    //秒--逗号(,)的使用（表达一个列表值）
    /*@Scheduled(cron = "10,20,30 * * * * ?")//每逢10、20、30秒时执行
    private void configureTask1(){
        System.out.println(DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

    //秒--减号(-)的使用（表达一个范围）
    /*@Scheduled(cron = "10-30 * * * * ?")//每逢10到30秒之间时执行
    private void configureTask2(){
        System.out.println(DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

    //秒--星号(*)的使用（表示对应时间域的每一个时刻）
    /*@Scheduled(cron = "* * * * * ?")//每秒执行
    private void configureTask3(){
        System.out.println(DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

    //秒--斜杠(/)的使用（x/y表达一个等步长序列，x为起始值，y为增量步长值）
    /*@Scheduled(cron = "0/20 * * * * ?")
    private void configureTask3(){
        System.out.println(DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

    //分--逗号(,)的使用（表达一个列表值）
   /* @Scheduled(cron = "* 9,10,11 * * * ?")//逢9、10、11分钟的任意时刻
    private void configureTask4(){
        System.out.println(DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

    //分--减号(-)的使用（表达一个范围）
   /* @Scheduled(cron = "* 16-17 * * * ?")
    private void configureTask5(){
        System.out.println(DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

    //分--星号(*)的使用（表示对应时间域的每一个时刻）
    /*@Scheduled(cron = "0 * 16 * * ?")
    private void configureTask6(){
        System.out.println(DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

    //分--斜杠(/)的使用（x/y表达一个等步长序列，x为起始值，y为增量步长值）
    @Scheduled(cron = "0 26/2 * * * ?")
    private void configureTask7(){
        System.out.println(DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }
}
