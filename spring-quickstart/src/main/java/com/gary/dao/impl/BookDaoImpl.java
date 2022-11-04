package com.gary.dao.impl;

import com.gary.dao.BookDao;

/**
 * @Description:
 * @Version: v1.0
 * @Author: create by gary
 * @Date: 2022/11/1 22:09
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }


}
