package com.hatbazar.dao;

import com.hatbazar.domains.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Item: bsejawal
 * Date: 6/24/13
 * Time: 1:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class ItemDao extends Mysql {
    String table="item";
    public ItemDao() throws IllegalAccessException, InstantiationException {
        this.connect();
    }
    public boolean create(Item item) throws InstantiationException, IllegalAccessException {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO "+table+" (`name`, `address`, `email`, `phone`,`type`,`itemname`, `password`) VALUES (?, ?, ?,?,?,?)");
            setPreparedStatement(item, ps);
            return affect(ps);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Item getItem(int id) throws InstantiationException, IllegalAccessException, SQLException {
        String sql = "SELECT * FROM "+table+" WHERE `id` =? LIMIT 1";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        List<Item> list =rows(find(ps));
        close();
        if (list!=null) return list.get(0);
        return null;
    }


    public List<Item> listItems() throws SQLException, InstantiationException, IllegalAccessException {
        String sql = "SELECT * FROM "+table;
        PreparedStatement ps = conn.prepareStatement(sql);
        List<Item> list = rows(find(ps));
        close();
        if(list ==null)return null;
        else return list;
    }

    public boolean delete(int id) throws SQLException, InstantiationException, IllegalAccessException {
        String sql = "DELETE FROM "+table+" WHERE `id`=? LIMIT 1";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1, id);
        return affect(ps);
    }

    public boolean update(Item item) throws SQLException, InstantiationException, IllegalAccessException {
        String sql = "UPDATE "+table+" SET `name`=?,`address`=?,`email`=?,`phone`=?,`type`=?,`itemname`=?,`password`=? WHERE `id`=? LIMIT 1";
        PreparedStatement ps= conn.prepareStatement(sql);
        setPreparedStatement(item,ps);
        ps.setInt(8,item.getId());
        return affect(ps);
    }

    public List<Item> rows(ResultSet rs) throws SQLException {
        if(rs!=null){
            List<Item> list=new ArrayList<Item>();
            while (rs.next()){
                list.add(row(rs));
            }
            return list;
        }
        return null;
    }
    public Item row(ResultSet rs) throws SQLException {
        Item item = new Item();
        item.setId(rs.getInt("id"));
        item.setName(rs.getString("name"));
        item.setCategory(rs.getString("category"));
        item.setAddedBy(rs.getInt("added_by"));
        item.setPrice(rs.getDouble("price"));
        item.setStatus(rs.getBoolean("status"));
        return item;
    }
    private void setPreparedStatement(Item item, PreparedStatement ps) throws SQLException {
        ps.setString(1, item.getName());
        ps.setString(2, item.getName());
        ps.setString(3, item.getCategory());
        ps.setInt(4, item.getAddedBy());
        ps.setDouble(5, item.getPrice());
        ps.setBoolean(6,item.isStatus());
    }
}