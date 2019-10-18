package com.hyh.baselibrary.inoneinvoke;

/**
 * created by curdyhuang on 2019/10/17
 */
public class InvokeFactory {
    private static IComponentsFactory factory;

    public static IComponentsFactory getFactory(){
        if(factory != null){
            return factory;
        }
        try {
            Class<?> factoryClass = Class.forName("com.hyh.moduleinvoke.ComponentsFactory");
            //ComponentsFactory是app模块的类，通过反射拿到该类
            factory = (IComponentsFactory) factoryClass.newInstance();
            return factory;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public interface IComponentsFactory {
        ICreateTips createTips();
    }
}
