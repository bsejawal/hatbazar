package com.hatbazar.dao;

import com.hatbazar.domains.User;
import com.hatbazar.interfaces.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends Mysql implements DAO {
    public UserDao() throws IllegalAccessException, InstantiationException {
        this.connect();
    }
    @Override
    public boolean create(User user) throws InstantiationException, IllegalAccessException {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO user (name,address, email, phone,username, password) VALUES (?, ?, ?,?,?,?)");
            ps.setString(1, user.getName());
            ps.setString(2, user.getAddress());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getUsername());
            ps.setString(6, user.getPassword());
            return affect(ps);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User getUser(Integer id) throws InstantiationException, IllegalAccessException {
        String sql = "SELECT * FROM user WHERE id = ?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            return setSingleRow(find(ps));
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> listUsers() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(Integer id, Integer age) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
    public User authenticate(User user) throws SQLException, InstantiationException, IllegalAccessException {
        String sql = "SELECT * FROM `user` WHERE `username`=? AND `password`=MD5(?) LIMIT 1";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2,user.getPassword());
        return setSingleRow(find(ps));
    }

    public User setSingleRow(ResultSet rs) throws SQLException {
        User user = new User();
        while (rs.next()) {
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setName(rs.getString("name"));
            user.setPhone(rs.getString("phone"));
            user.setEmail(rs.getString("email"));
        }
        return user;
    }
}