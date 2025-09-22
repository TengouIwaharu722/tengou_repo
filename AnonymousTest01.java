package com.ets;

/**
 * 抽象クラスの匿名クラス化
 */
abstract class Animal{
    public void green(){
        System.out.println("こんちには！");
    }
    public abstract void makeSound();
}

public class AnonymousTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {

            @Override
            public void makeSound() {
                System.out.println("君の名は？");        
            }
        };
        animal.green();         //こんちには！
        animal.makeSound();     //君の名は？
    }
}
