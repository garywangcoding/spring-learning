package com.gary.service.impl;

import com.gary.dao.BookDao;
import com.gary.dao.impl.BookDaoImpl;
import com.gary.service.BookService;

/**
 * @Description:
 * @Version: v1.0
 * @Author: create by gary
 * @Date: 2022/11/1 22:10
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
