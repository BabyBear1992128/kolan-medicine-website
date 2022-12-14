package com.medicine.kolan.util;

public class GlobalUtil {

    public static int getInt(Object obj){
        if(obj == null) return 0;

        try{
            return Integer.parseInt(obj.toString());
        }catch(Exception e){
            return 0;
        }
    }

    public static String getString(Object obj){
        try{
            return obj.toString();
        }catch(Exception e){
            return "";
        }
    }
}
