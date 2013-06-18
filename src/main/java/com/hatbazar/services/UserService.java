package com.hatbazar.services;

import com.hatbazar.dao.UserDao;
import com.hatbazar.domains.User;
//import org.springframework.dao.core.JdbcTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 5/29/13
 * Time: 9:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserService {
//    @Autowired
//    JdbcTemplate jdbcTemplate;

    public void authencate(User user) throws InstantiationException, IllegalAccessException {
        UserDao userDao = new UserDao();
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
//        DAO jdbcUserDAO =
//                (DAO)context.getBean("userDao");
//    }
}
