package com.gary;

import com.gary.service.BookService;
import com.gary.service.impl.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Version: v1.0
 * @Author: create by gary
 * @Date: 2022/11/1 22:24
 */
public class App {
    public static void main(String[] args) {
        // 获取IOC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取对象
        BookService bookService = (BookService) applicationContext.getBean("bookService");

        bookService.save();
    }
}
