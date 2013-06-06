package com.hatbazar.services;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 5/29/13
 * Time: 9:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserService {
    JdbcTemplate myJdbc;

    public JdbcTemplate getMyJdbc() {
        return myJdbc;
    }

    public void setMyJdbc(JdbcTemplate myJdbc) {
        this.myJdbc = myJdbc;
    }
}
