package practice;

/*
    abstract class checkBinary {
        public abstract void start();
    }

    class bike extends checkBinary {
        public void start() {
            System.out.println("Stars with kick");
        }
    }

     class car extends  checkBinary {
        public void start() {
            System.out.println("Starts with key");
        }
        public static void main(String[] args) {
            bike bk = new bike();
            bk.start();
            car cr = new car();
            cr.start();
        }
    }
*/

/*
// Polymorphism - Compile time
class checkBinary {
    //compile time poly, static, method over(same name,same class, diff argument;- type,seq,number)

    void method1(int a, String b) {
        System.out.println(a);
        System.out.println(b);
    }

    void method1(String a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        checkBinary cb = new checkBinary();
        cb.method1(3,"hello1");
        cb.method1("Hello",7);
    }
}
*/

/*
// Runtime polymorphism
class checkBinary {
    //Runtime poly, dynamic, method overriding(same name, diff class, same arguments:- type,seq,number, IS-A relationship
    void method1(int a, int b) {
        System.out.println(a+b);
    }
}

 class second extends checkBinary {
    void method1(int a,int b){
        System.out.println(a);
    }

     public static void main(String[] args) {
        checkBinary ck = new checkBinary();
        ck.method1(7,8);
        second sc = new second();
        sc.method1(6,7);
     }
 }
*/

/*
// Encapsulation
class checkBinary {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getSurname() {
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
}
*/


import java.util.Date;

interface Address {
    public static final String addressLine = null;
    public static final String city = null;
    public static final String zip = null;
}

class NaturalPerson implements Address {
    Integer id;
    String name;
    Date dateOfBirth;
    Integer age;
    Address address;
}

class LegalPerson implements Address {
    Integer id;
    String name;
    Integer numberOfEmployees;
    Address address;
}




