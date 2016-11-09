package com.changgx.service;/**
 * Created by Administrator on 2016/11/8.
 */

import com.changgx.bean.Book;
import com.changgx.mapper.BookMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Administrator 2016/11/8
 */
@Service
public class BookService {
    private static final Logger logger = LoggerFactory
            .getLogger(BookService.class);
    @Autowired
    private BookMapper bookMapper;

    public List<Book> findAll() {
        logger.info("findAll log...");
        return bookMapper.findAll();
    }

    public Book findBookByISDN(int ISDN) {
        return bookMapper.findBookByISDN(ISDN);
    }
}
