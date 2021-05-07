package JavaDS;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
	 @Test
	    void given3NumbersInQueueWhenEnqueueShouldBeDoneByFIFO() {
	        int key;
	        MyNode<Integer> myFirstNode = new MyNode<>(key = 56);
	        MyNode<Integer> mySecondNode = new MyNode<>(key = 30);
	        MyNode<Integer> myThirdNode = new MyNode<>(key = 70);
	        MyQueue myQueue = new MyQueue();
	        myQueue.enqueue(myFirstNode);
	        myQueue.enqueue(mySecondNode);
	        myQueue.enqueue(myThirdNode);
	        INode peak = myQueue.peak();
	        Assert.assertEquals(peak,myFirstNode);
	        boolean result = peak.getNext().equals(mySecondNode);
	        Assert.assertTrue(result);
	    }

	    @Test
	    void given3NumbersInQueueSoThatDequeueShouldDoneByFIFO() {
	        int key;
	        MyNode<Integer> myFirstNode = new MyNode<>(key = 56);
	        MyNode<Integer> mySecondNode = new MyNode<>(key = 30);
	        MyNode<Integer> myThirdNode = new MyNode<>(key = 70);
	        MyQueue myQueue = new MyQueue();
	        myQueue.enqueue(myFirstNode);
	        myQueue.enqueue(mySecondNode);
	        myQueue.enqueue(myThirdNode);
	        INode dequeue = myQueue.dequeue();
	        Assert.assertEquals(dequeue,myFirstNode);


	    }}
