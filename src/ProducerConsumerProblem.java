public class ProducerConsumerProblem {

    public static void main(String[] args) {
        SharedBufferResources sharedBufferResources = new SharedBufferResources(3);
        Thread Producerthread = new Thread(() -> {
            for(int i=0;i<3;i++)
            {
               try{
                   sharedBufferResources.produce(i);
               } catch (Exception e) {
                   throw new RuntimeException(e);
               }
            }
        });


        Thread Consumerthread = new Thread(() -> {
            try{
                sharedBufferResources.consume();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Producerthread.start();
        Consumerthread.start();

    }
}
