package com.hatbazar.services;

import com.hatbazar.dao.UserDao;
import com.hatbazar.domains.User;
import com.hatbazar.utilities.Utils;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
//import org.springframework.dao.core.JdbcTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 5/29/13
 * Time: 9:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserService {
    public boolean authenticate(User user, HttpServletRequest request) throws InstantiationException, IllegalAccessException, SQLException {
        System.out.println("userService -> in authencate :::: ");
        UserDao userDao = new UserDao();
        return isLogin(userDao.authenticate(user), request);
    }
    public boolean isLogin(User user, HttpServletRequest request){
        if(!Utils.checkNull(user.getUsername()) && !Utils.checkNull(user.getName())){
            request.getSession().setAttribute("isLogin","true");
            request.getSession().setAttribute("userId",user.getId());
            return true;
        }
        return false;
    }
    public User get(int id) throws InstantiationException, IllegalAccessException {
        UserDao userDao = new UserDao();
        return userDao.getUser(id);
    }
}

//        user.setPassword("123456789");
//        user.setUsername("testusername");
//        user.setPhone("testphone");
//        user.setEmail("testEmail");
//        user.setAddress("testAddress");
//        user.setName("testName");
//        userDao.create(user);
//        System.out.println("\n\n\nUserService.authencate in user service \n\n");