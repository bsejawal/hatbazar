package com.hatbazar.interfaces;
import com.hatbazar.domains.User;

import java.util.List;
import javax.sql.DataSource;
public interface UserDao {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the User table.
     */
    public void create(User user);
    /**
     * This is the method to be used to list down
     * a record from the User table corresponding
     * to a passed User id.
     */
    public User getUser(Integer id);
    /**
     * This is the method to be used to list down
     * all the records from the User table.
     */
    public List<User> listUsers();
    /**
     * This is the method to be used to delete
     * a record from the User table corresponding
     * to a passed User id.
     */
    public void delete(Integer id);
    /**
     * This is the method to be used to update
     * a record into the User table.
     */
    public void update(Integer id, Integer age);
}