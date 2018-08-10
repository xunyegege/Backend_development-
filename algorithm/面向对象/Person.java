/*
        _                         _             
                                        (_)                       | |            
                     __ _   __ _ __   __ _  _ __    ___  ___    __| |  ___  _ __ 
                    / _` | / _` |\ \ / /| || '_ \  / __|/ _ \  / _` | / _ \| '__|
                   | (_| || (_| | \ V / | || | | || (__| (_) || (_| ||  __/| |   
                    \__, | \__,_|  \_/  |_||_| |_| \___|\___/  \__,_| \___||_|   
                     __/ |                                                       
                    |___/  


*/

package 面向对象;

public class Person {
    private String name = "12321";
    private int age = 11;
    private String sex = "man";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void BD() {
        System.out.println("我会蹦迪");
    }

    @Override
    public String toString() {
        String printString = "name=" + this.getName() + "\t" + "sex=" + this.getSex() + "\t" + "age=" + this.getAge();
        return printString;


    }


    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.toString());
    }
}
