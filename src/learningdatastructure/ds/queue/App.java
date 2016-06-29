package learningdatastructure.ds.queue;

/**
 * Created by slavkurochkin on 6/26/16.
 */
public class App {

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(300);
        myQueue.insert(10);
        myQueue.insert(1);
        myQueue.insert(12);
        myQueue.insert(22);
        myQueue.view();
    }
}
