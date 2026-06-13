public enum EnumMethodOverride {
    Monday{
        @Override
        void dummymethod(){
            System.out.println("This is the dummy method called of Monday Variable");
        }
    },
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
     void dummymethod()
    {
        System.out.println("This is the dummy method which is applicable to all the constats");
    }
}
