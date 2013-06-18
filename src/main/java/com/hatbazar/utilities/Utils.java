package com.hatbazar.utilities;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 6/18/13
 * Time: 12:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class Utils {
    public static boolean checkNull(String st){
        return st == null || st == "" || st == "undefined" || st == "null" || st == "NULL";
    }
}
