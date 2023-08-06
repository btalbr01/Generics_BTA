package main;

import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {		
		GenericLinkedList<String> myList=new GenericLinkedList<String>();
		GenericLinkedList<Integer> myIntList=new GenericLinkedList<Integer>();
		GenericLinkedList<Double> myDoubleList=new GenericLinkedList<Double>();
		
		GenericNode<String> aNode=new GenericNode<String>();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new GenericNode<String>();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		GenericNode tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		GenericNode<Integer> bNode=new GenericNode<Integer>();
		bNode.setData(55);
		myIntList.addNode(bNode);
		bNode = new GenericNode<Integer>();
		bNode.setData(23);
		myIntList.addNode(bNode);
		
		GenericNode tempnode2=myIntList.getList();
		do 
		{
			System.out.println(tempnode2.getData());
			tempnode2=tempnode2.getNextNode();
		} while (tempnode2!=null);
		
		GenericNode<Double> cNode=new GenericNode<Double>();
		cNode.setData(2.25);
		myDoubleList.addNode(cNode);
		cNode = new GenericNode();
		cNode.setData(52.675);
		myDoubleList.addNode(cNode);
		
		GenericNode tempnode3=myDoubleList.getList();
		do 
		{
			System.out.println(tempnode3.getData());
			tempnode3=tempnode3.getNextNode();
		} while (tempnode3!=null);
	}//end main
}//end class