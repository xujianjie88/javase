package com.xujj.designpattern.prototype;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-19 14:26
 **/
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 10, "��ɫ");

        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);

    }

}
