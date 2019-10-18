package com.hyh.moduleinvoke;

import android.util.Log;

/**
 * created by curdyhuang on 2019/10/16
 * 主模块的类，在子模块通过某种方式可以调用到该类的方法
 */
public class MyInvoke {
    public String getStr(){
        return "I am main module";
    }
}
