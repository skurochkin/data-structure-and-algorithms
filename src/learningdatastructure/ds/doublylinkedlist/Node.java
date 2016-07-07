package learningdatastructure.ds.doublylinkedlist;

/**
 * Created by VKurochkin on 7/7/2016.
 */
public class Node {
    int data;
    Node next = null;
    public Node previous;

    public void displayNode(){
        System.out.println("{ " + data + " } ");
    }
}
