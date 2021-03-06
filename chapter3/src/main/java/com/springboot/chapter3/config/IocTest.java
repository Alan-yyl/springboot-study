package com.springboot.chapter3.config;


import com.springboot.chapter3.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author yyl
 * @version 1.0
 * @date 2020/12/3 19:31
 */
@Slf4j
public class IocTest {
    public static void main(String[] args) {
        // AnnotationConfigApplicationContext间接继承了ApplicationContext
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        // 从IoC容器中获取Bean
        // ctx.getBeanNamesForType(Object.class);
        // 使用slf4j进行日志输出
        log.info(Arrays.toString(ctx.getBeanNamesForType(Object.class)));
    }
}
