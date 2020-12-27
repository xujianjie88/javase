package com.xujj.designpattern.decorator;

/**
 * @description:装饰模式就是给一个对象增加一些新的功能，
 *  而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 * @author: xujianjie
 * @create: 2020-08-09 11:10
 **/
public class Source implements Sourceable  {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
