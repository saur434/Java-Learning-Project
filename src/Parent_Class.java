public class Parent_Class {
    String name;
    int age;
    Parent_Class()
    {
        this(10);
        System.out.println("This is the default Constructor");
    }
    Parent_Class(int age)
    {
        this(10,"AA");
        System.out.println("This is the Parameterised Constructor");

    }
    Parent_Class(int age,String name)
    {
        this.name = name;
        this.age = age;
        System.out.println("This is the Parameterised Second Constructor");

    }

}
