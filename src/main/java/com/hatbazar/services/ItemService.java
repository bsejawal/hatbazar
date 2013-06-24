package com.hatbazar.services;

import com.hatbazar.dao.ItemDao;
import com.hatbazar.domains.Item;
import com.hatbazar.utilities.Utils;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Item: bsejawal
 * Date: 6/24/13
 * Time: 1:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class ItemService {
    public Item get(int id) throws InstantiationException, IllegalAccessException, SQLException {
        ItemDao itemDao = new ItemDao();
        return itemDao.getItem(id);
    }

    public boolean save(HttpServletRequest request, RedirectAttributes attributes) throws InstantiationException, IllegalAccessException, UnsupportedEncodingException, NoSuchAlgorithmException, SQLException {
        Item item = itemInstance(request);
        if(isValid(item, request, attributes)){
            ItemDao itemDao = new ItemDao();
            boolean flag = false;
            if(item.getId()==0)flag= itemDao.create(item);
            else flag= itemDao.update(item);
            if (flag)attributes.addFlashAttribute("message","Data Save Successfully");
            return flag;
        }
        return false;
    }
    private Item itemInstance(HttpServletRequest request) throws IllegalAccessException, InstantiationException, UnsupportedEncodingException, NoSuchAlgorithmException, SQLException {
        Item item=null;
        if(!Utils.checkNull(request.getParameter("id")))item = get(Integer.parseInt(request.getParameter("id")));
        else{
            item = new Item();
            item.setAddedBy(Integer.parseInt(request.getSession().getAttribute("userId").toString()));
        }
        if(!Utils.checkNull(request.getParameter("name"))) item.setName(request.getParameter("name").trim());
        if(!Utils.checkNull(request.getParameter("category"))) item.setCategory(request.getParameter("category").trim());
        if(!Utils.checkNull(request.getParameter("price"))) item.setPrice(Double.parseDouble(request.getParameter("type").trim()));
        if(!Utils.checkNull(request.getParameter("status"))) item.setStatus(request.getParameter("status").trim());
        if(!Utils.checkNull(request.getParameter("contactPerson"))) item.setContactPerson(request.getParameter("contactPerson").trim());
        if(!Utils.checkNull(request.getParameter("contactPhone"))) item.setContactPhone(request.getParameter("contactPhone").trim());
        if(!Utils.checkNull(request.getParameter("details"))) item.setDetails(request.getParameter("details").trim());
        return item;
    }
    public boolean isValid(Item item, HttpServletRequest request, RedirectAttributes attributes) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String msg = "";
        if(item.getName()==null || Utils.checkNull(item.getName())) msg += "Name is required field";
        if(item.getCategory() == null || Utils.checkNull(item.getCategory())) msg += "<br />Category is required field";
        if(item.getPrice()==0) msg += "<br />Price Role is required field";
        if(item.getStatus() == null || Utils.checkNull(item.getStatus())) msg += "<br />Status is required field";
        if(item.getContactPerson() == null || Utils.checkNull(item.getContactPerson())) msg += "<br />Contact Person is required field";
        if(item.getContactPhone() == null || Utils.checkNull(item.getContactPhone())) msg += "<br />Contact Phone is required field";
        if(item.getDetails() == null || Utils.checkNull(item.getDetails())) msg += "<br />Details is required field";
        attributes.addFlashAttribute("error",msg);
        return msg=="";
    }
    public List<Item> findAll() throws IllegalAccessException, SQLException, InstantiationException {
        ItemDao itemDao = new ItemDao();
        return itemDao.listItems();
    }
    public void delete(HttpServletRequest request, RedirectAttributes attributes) throws InstantiationException, IllegalAccessException, SQLException {
        int id=Integer.parseInt(request.getParameter("id"));
        ItemDao itemDao=new ItemDao();
        attributes.addFlashAttribute("tab","item_list");
        if(itemDao.delete(id))attributes.addFlashAttribute("message","Data delete successfully");
        else attributes.addFlashAttribute("error","Item not exists, Refresh your browser properly");
    }

}
