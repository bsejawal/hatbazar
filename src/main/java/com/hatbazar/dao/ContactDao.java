package com.hatbazar.dao;


import com.hatbazar.domains.Contact;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 6/22/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class ContactDao extends Mysql {
    String table="contact";
    public ContactDao() throws IllegalAccessException, InstantiationException {
        connect();
    }
    public boolean create(Contact contact) throws InstantiationException, IllegalAccessException {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO "+table+" (`name`, `email`, `phone`,`subject`,`message`,`is_new`) VALUES (?, ?, ?,?,?,?)");
            ps.setString(1, contact.getName());
            ps.setString(3, contact.getEmail());
            ps.setString(3, contact.getPhone());
            ps.setString(4, contact.getSubject());
            ps.setString(5, contact.getMessage());
            ps.setBoolean(6, contact.isNew());
            return affect(ps);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
