package com.hatbazar.interfaces;
import com.hatbazar.domains.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
public interface DAO {
    /**
     * This is the method to be used to create
     * a record in the User table.
     */
    public boolean create(User user) throws InstantiationException, IllegalAccessException;
    /**
     * This is the method to be used to list down
     * a record from the User table corresponding
     * to a passed User id.
     */
    public User getUser(Integer id) throws IllegalAccessException, SQLException, InstantiationException;
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