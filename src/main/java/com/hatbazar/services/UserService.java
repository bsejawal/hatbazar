package com.hatbazar.services;

import com.hatbazar.dao.JdbcUserDAO;
import com.hatbazar.domains.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.dao.core.JdbcTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 5/29/13
 * Time: 9:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserService {
    @Autowired
    JdbcUserDAO userDao;

    public void authencate(User user){
        user.setPassword("123456789");
        user.setUsername("testusername");
        user.setPhone("testphone");
        user.setEmail("testEmail");
        user.setAddress("testAddress");
        user.setName("testName");
        userDao.create(user);
        System.out.println("\n\n\nUserService.authencate in user service \n\n");
    }
//    ApplicationContext context =
//            new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
//
//
//    public void callJDBCTEmplateExample(){
//        JdbcUserDAO jdbcUserDAO =
//                (JdbcUserDAO)context.getBean("userDao");
//    }
}
