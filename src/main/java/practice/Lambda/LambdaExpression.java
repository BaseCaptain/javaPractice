package practice.Lambda;


public class LambdaExpression {

    public static void main(String[] args) {

        // Reference Video Link :- https://www.youtube.com/watch?v=tCwg16PUZyo&t=1800s

/************************************************************************************/

        // by creating class and accessing it here by creating it;s object
        MyInterImpl myInter = new MyInterImpl();
        myInter.sayHello();

/************************************************************************************/

        // by using anonymous class
        MyInterface i = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
        };
        i.sayHello();

/************************************************************************************/

        //by using lambda function
        MyInterface i2 = () -> {
            System.out.println("Hello from Lambda");
        };
        i2.sayHello();

/************************************************************************************/

        //addition interface
        AdditionInterface additionInterface = (int a, int b) -> {
            return a + b;
        };

        // another shorter way for addition Interface
        AdditionInterface additionInterface1 = (a,b) -> (a+b);

        System.out.println(additionInterface.addTwoNumber(11,33));
        System.out.println(additionInterface1.addTwoNumber(4651,33));

/************************************************************************************/

        // Runnable method using thread and lambda

        Runnable runnableThread = () -> {
            for (int index=1;index<=10;index++) {
                System.out.println("Value of index is "+index);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(runnableThread);
        thread1.setName("JOHN");
        thread1.start();

        Runnable runnableThread2 = () -> {
            for (int index2=1;index2<=10;index2++) {
                System.out.println("Table of 2 is" + 2*index2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread2 = new Thread(runnableThread2);
        thread2.setName("VAIBHAV");
        thread2.start();

    }
}
