package JavaDS;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
	
	    @Test
	    public void given3NumbersInTheLinkedList_LinkedListShouldPassTheTest() {
	        int key;
	        MyNode<Integer> myFirstNode = new MyNode<>(key = 56);
	        MyNode<Integer> mySecondNode = new MyNode<>(key = 30);
	        MyNode<Integer> myThirdNode = new MyNode<>(key = 70);
	        myFirstNode.setNext(mySecondNode);
	        mySecondNode.setNext(myThirdNode);
	        boolean result = (myFirstNode.getNext().equals(mySecondNode))&&
	                          (mySecondNode.getNext().equals(myThirdNode));
	        Assert.assertTrue(result);
	    }
	}
}
