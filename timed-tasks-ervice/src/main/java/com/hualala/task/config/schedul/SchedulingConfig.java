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


    /**
     * 位置:4
     * 时间域名:日
     * 允许值:1-31
     * 允许的特殊字符: , - * / L W C
     * L在日期字段中，表示这个月份的最后一天，如一月的31号，非闰年二月的28号
     * W：该字符只能出现在日期字段里，是对前导日期的修饰，表示离该日期最近的工作日。
     * 例如15W表示离该月15号最近的工作日，如果该月15号是星期六，则匹配14号星期五；如果15日是星期日，则匹配16号星期一；
     * 如果15号是星期二，那结果就是15号星期二。
     * 但必须注意关联的匹配日期不能够跨月，如你指定1W，如果1号是星期六，结果匹配的是3号星期一，而非上个月最后的那天。
     * W字符串只能指定单一日期，而不能指定日期范围；
     * LW组合：在日期字段可以组合使用LW，它的意思是当月的最后一个工作日；
     * C：该字符只在日期和星期字段中使用，代表“Calendar”的意思。它的意思是计划所关联的日期，如果日期没有被关联，则相当于日历中所有日期。
     * 例如5C在日期字段中就相当于日历5日以后的第一天。1C在星期字段中相当于星期日后的第一天。
     */
    /*//日--逗号(,)的使用（表达一个列表值）
    @Scheduled(cron = "0 24 18 28,29 * ?")
    private void configureTask11(){
        System.out.println("日逗号："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }

    //日--减号(-)的使用（表达一个范围）
    @Scheduled(cron = "0 24 18 28-29 * ?")
    private void configureTask12(){
        System.out.println("日减号："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }

    //日--星号(*)的使用（表示对应时间域的每一个时刻）
    @Scheduled(cron = "0 24 18 * * ?")
    private void configureTask13(){
        System.out.println("日星号："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }

    //日--斜杠(/)的使用（x/y表达一个等步长序列，x为起始值，y为增量步长值）
    @Scheduled(cron = "0 24 18 28/1 * ?")
    private void configureTask14(){
        System.out.println("日斜杠："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

   /* //日--L的使用
    @Scheduled(cron = "0 22 18 l 3 ?")
    private void configureTask15(){
        System.out.println("日L："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

   /* //日--W的使用
    @Scheduled(cron = "0 22 18 28W 3 ?")
    private void configureTask16(){
        System.out.println("日W："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

    /*//日--LW的使用
    @Scheduled(cron = "0 22 18 LW 3 ?")
    private void configureTask17(){
        System.out.println("日LW："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/

   /* //日--C的使用
    @Scheduled(cron = "0 22 18 28C 3 ?")
    private void configureTask18(){
        System.out.println("日C："+DateUtil.getCurrentDate("yyyy-MM-dd-HH-mm-ss-SSS"));
    }*/
}
