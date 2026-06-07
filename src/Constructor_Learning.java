public class Constructor_Learning  {
    String name;
    int age;
    Constructor_Learning()
    {
        this(10);
        System.out.println("This is the default Constructor");
    }
    Constructor_Learning(int age)
    {
        this(10,"AA");
        System.out.println("This is the Parameterised Constructor");

    }
    Constructor_Learning(int age,String name)
    {
        this.name = name;
        this.age = age;
        System.out.println("This is the Parameterised Second Constructor");

    }


}
