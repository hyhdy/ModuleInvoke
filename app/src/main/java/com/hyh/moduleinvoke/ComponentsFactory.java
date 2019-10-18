package com.hyh.moduleinvoke;

import com.hyh.baselibrary.inoneinvoke.ICreateTips;
import com.hyh.baselibrary.inoneinvoke.InvokeFactory;

/**
 * created by curdyhuang on 2019/10/17
 */
public class ComponentsFactory implements InvokeFactory.IComponentsFactory {
    @Override
    public ICreateTips createTips() {
        return new CreateTips();
    }
}
