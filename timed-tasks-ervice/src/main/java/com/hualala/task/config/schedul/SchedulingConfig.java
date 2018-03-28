package com.hualala.task.config.schedul;

import com.hualala.task.util.DateUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration //主要用于标记配置类，兼备Component的效果。
@EnableScheduling //开启定时任务
public class SchedulingConfig {

    /**
     * 位置:1
     * 时间域名:秒
     * 允许值:0-59
     * 允许的特殊字符: , - * /
     */
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

    /**
     * 位置:2
     * 时间域名:分钟
     * 允许值:0-59
     * 允许的特殊字符: , - * /
     */
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
    /*@Scheduled(cron = "0 26/2 * * * ?")
    private void configureTask7(){
        System.out.println(DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

    /**
     * 位置:3
     * 时间域名:小时
     * 允许值:0-23
     * 允许的特殊字符: , - * /
     */
    /*//时--逗号(,)的使用（表达一个列表值）
    @Scheduled(cron = "0 50 16,17 * * ?")
    private void configureTask7(){
        System.out.println("时逗号："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }

    //时--减号(-)的使用（表达一个范围）
    @Scheduled(cron = "0 50 16-17 * * ?")
    private void configureTask8(){
        System.out.println("时减号："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }

    //时--星号(*)的使用（表示对应时间域的每一个时刻）
    @Scheduled(cron = "0 50 * * * ?")
    private void configureTask9(){
        System.out.println("时星号："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }

    //时--斜杠(/)的使用（x/y表达一个等步长序列，x为起始值，y为增量步长值）
    @Scheduled(cron = "0 50 16/1 * * ?")
    private void configureTask10(){
        System.out.println("时斜杠："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/
}
