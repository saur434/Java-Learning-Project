public enum EnumAbstractMethod implements EnumInterface{
    MONDAY {
        @Override
        void message() {
            System.out.println("Start of the week");
        };

        @Override
        public void Enumimplementinterface() {
            System.out.println("This is the interface monday method");
        }
    },

    TUESDAY {
        @Override
        void message() {
            System.out.println("Second day");
        }
    };

    abstract void message();
    @Override
    public void Enumimplementinterface(){
        System.out.println("Enum can implement the interfaces");
    }
}
