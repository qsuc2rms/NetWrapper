package com.hss01248.net.wrapper;

import android.util.Log;

/**
 * Created by Administrator on 2017/1/18 0018.
 */

public class MyLog {

    private static boolean isLog = true;
    private static String tag = "netwrapper";

    public static void e(String obj){
        if(isLog){
            Log.e(tag,obj);
        }
    }

    public static void i(String obj){
        if(isLog){
            Log.i(tag,obj);
        }
    }

    public static void d(String obj){
        if(isLog){
            Log.d(tag,obj);
        }
    }



    public static void json(Object obj){
        if(isLog){
            Log.i(tag,MyJson.toJsonStr(obj));
        }
    }
}
