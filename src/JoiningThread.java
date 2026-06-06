public class JoiningThread {

    public static void main (String [] args)
    {
        ProducerThread thread = new ProducerThread();
        ProducerThread thread2 = new ProducerThread();
        Thread t1 = new Thread(() -> {
            try {
                thread.produce();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try{
                thread2.produce();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();

        t2.start();
//        try{
//            t1.join();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }



    }
}

