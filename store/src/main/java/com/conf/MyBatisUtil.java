package com.conf;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
    private String resource = "mybatis-config.xml"; //"com/conf/mybatis-config.xml"
    private SqlSession session = null;

    public SqlSession getSession(){
        try {
            InputStream reader = Resources.getResourceAsStream(resource);
            System.out.println();
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sqlSessionFactory.openSession();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return session;
    }
}
