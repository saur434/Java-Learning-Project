public class ProducerThread {


    public  void produce() throws Exception {
        System.out.println("Thread is in the producing mode");


        System.out.println("Lock Acquired in producer mode");
        try{
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Lock Released in producer mode");
    }

    public  void Consume() throws Exception {
        System.out.println("Thread is in the Consuming mode");


        System.out.println("Lock Acquired in consumer mode");
        try{
            Thread.sleep(3000);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Lock Released in consumer mode");
    }
}
