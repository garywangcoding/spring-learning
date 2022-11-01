package com.gary;

import com.gary.service.impl.BookServiceImpl;

/**
 * @Description:
 * @Version: v1.0
 * @Author: create by gary
 * @Date: 2022/11/1 22:24
 */
public class App {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
    }
}
