package com.vpb.day3;

public class Dog {
    public void bark(){
        System.out.println("woof");
    }
    public void  bark( int  n ){
        for (int i =1; i <=n; i++){
            System.out.println(" yoi yoi");
        }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(); // khoi tao 1 con dog
        dog1.bark();
        dog1.bark(3);

        Dog2 dog2 = new Dog2();
        dog2.bark();
    }

}
class Dog2 extends Dog{
    @Override
    public void bark(){
        System.out.println("yack");
    }
}