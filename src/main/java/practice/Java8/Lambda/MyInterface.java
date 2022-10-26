package practice.Java8.Lambda;

@FunctionalInterface //contains only one method
public interface MyInterface {
    public abstract void sayHello();

    // it can be accessible by 3 types
    // by creating new class and implementing the interface by creating body of abstract method (Standard method)
    // by implementing it through anonymous class
    //by lambda function
}
