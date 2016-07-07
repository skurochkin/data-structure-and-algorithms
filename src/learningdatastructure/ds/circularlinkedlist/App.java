package learningdatastructure.ds.circularlinkedlist;

/**
 * Created by VKurochkin on 7/7/2016.
 */
public class App {


    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(999999);

        myList.displayList();
    }
}
