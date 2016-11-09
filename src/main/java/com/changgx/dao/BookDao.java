package com.changgx.dao;/**
 * Created by Administrator on 2016/11/8.
 */

import com.changgx.bean.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Administrator 2016/11/8
 */
@Component
public class BookDao {
    @Autowired
    private SqlSession sqlSession;

    public Book findAll(long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }

}
