package com.dss.order;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.Properties;

/**
 * @author xiaorong.fu
 * @version 1.0
 * @ClassName DemoDssBusinessOrderApplication
 * @Description TODO
 * @date 2019/12/12 16:53
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableScheduling
@EnableAsync
public class DemoDssBusinessOrderApplication {

    private final static Logger logger = LoggerFactory.getLogger(DemoDssBusinessOrderApplication.class);
    /**
     * 从配置文件中获取配置的任务调度线程数量
     */
    @Value("${swift.taskThreads}")
    private Integer taskTheads;

    public static void main(String[] args) {
        SpringApplication.run(DemoDssBusinessOrderApplication.class, args);
    }

    /**
     * 配置mybatis的分页插件pageHelper
     *
     * @return
     */
    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "false");
        properties.setProperty("autoDialect", "true");
        properties.setProperty("autoRuntimeDialect", "true");
        properties.setProperty("supportMethodsArguments", "true");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

    @Bean
    public TaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        // 线程池大小
        taskScheduler.setPoolSize(taskTheads);
        // 线程名称前缀
        taskScheduler.setThreadNamePrefix("DSS SPRING-BOOT TASK");
        return taskScheduler;
    }
}
