public class Static_Class_Example {
   static int var1 = 10;
    int var2 = 20;

    void m1()
    {
        int var3=0;
        System.out.println("This is the instance m1 method call");
    }
    static void m2()
    {
        System.out.println("The value of var1 is: " + var1);
        System.out.println("This is the static m2 method call");
    }
    final void m3(int ...a)
    {

        System.out.println("This is the final m3 method call");
    }

}
