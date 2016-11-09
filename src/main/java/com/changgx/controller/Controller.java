package com.changgx.controller;/**
 * Created by Administrator on 2016/11/8.
 */

import com.changgx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Administrator 2016/11/8
 */
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }


    @RequestMapping("/findByISDN/{ISDN}")
    @ResponseBody
    public String findByISDN(@PathVariable int ISDN) {
        return bookService.findBookByISDN(ISDN).toString();
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() {
        return bookService.findAll().toString();
    }
}
