package com.hatbazar.dao;

import com.hatbazar.domains.User;
import com.hatbazar.interfaces.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcUserDAO implements UserDao{
    @Autowired
    JdbcTemplate test;


    DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void create(User user) {
        System.out.println("\n\n\nuser = " + user);
        String sql = "INSERT INTO user (name,address, email, phone,username, password) VALUES (?, ?, ?,?,?,?)";
//        Connection conn = null;

//        try {

//            String sql = "select * from user where user_name = ? and password = MD5(?)";
        test.update(sql,new Object[]{user.getName(),user.getAddress(),user.getEmail(),user.getPhone(),user.getUsername(), user.getPassword()});
                   //.queryForObject(sql, new Object[] {userName, password}, new BeanPropertyRowMapper(User.class))
//            conn = dS.getConnection();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, user.getName());
//            ps.setString(2, user.getAddress());
//            ps.setString(3, user.getEmail());
//            ps.setString(4, user.getPhone());
//            ps.setString(5, user.getUsername());
//            ps.setString(6, user.getPassword());
//            System.out.println("prepared Statement ::: "+ps);
//            ps.executeUpdate();
//            ps.close();

//        } finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {}
//            }
//        }
    }

    @Override
    public User getUser(Integer id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            User user = new User();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user.setName(rs.getString("name"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
            rs.close();
            ps.close();
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
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

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}