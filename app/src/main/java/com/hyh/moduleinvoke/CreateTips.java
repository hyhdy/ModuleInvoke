package com.hyh.moduleinvoke;

import com.hyh.baselibrary.inoneinvoke.ICreateTips;

/**
 * created by curdyhuang on 2019/10/17
 */
public class CreateTips implements ICreateTips {
    @Override
    public String getStr() {
        return "tips is I am main module";
    }
}
