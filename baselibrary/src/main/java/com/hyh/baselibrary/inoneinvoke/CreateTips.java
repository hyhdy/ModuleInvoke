package com.hyh.baselibrary.inoneinvoke;

/**
 * created by curdyhuang on 2019/10/17
 */
public class CreateTips implements ICreateTips {
    private ICreateTips createTips;

    public CreateTips() {
        //这里创建的是app模块的CreateTips对象，这样就可以调用到主module的代码了
        createTips = InvokeFactory.getFactory().createTips();
    }

    @Override
    public String getStr() {
        return createTips.getStr();
    }
}
