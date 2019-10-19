package com.hyh.baselibrary.inoneinvoke;

/**
 * created by curdyhuang on 2019/10/17
 * 通过代理接口的方式访问主module代码
 */
public class CreateTipsProxy implements ICreateTips {
    private ICreateTips createTips;

    public CreateTipsProxy() {
        //这里创建的是app模块的CreateTips对象，这样就可以调用到主module的代码了
        createTips = InvokeFactory.getFactory().createTips();
    }

    @Override
    public String getStr() {
        return createTips.getStr();
    }
}
