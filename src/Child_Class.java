public class Child_Class extends Parent_Class {
    int age;
    String name;

    Child_Class()
    {
        super();
        this.age = 20;
        this.name = "Ram";
    }
    void m1()
    {
        System.out.println("This is the child class method");
        System.out.println(name);
    }
}
