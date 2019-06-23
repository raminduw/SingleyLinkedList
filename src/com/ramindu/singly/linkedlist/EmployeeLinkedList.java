package com.ramindu.singly.linkedlist;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	private int size;
	
	public void addToFront(Employee employee){
		EmployeeNode node = new EmployeeNode(employee);
		node.setNextNode(head);
		head = node;
		size++;
	}
	public Employee removeFromFront() {
		  if (isEmpty()) {
	            return null;
	        }
		  EmployeeNode removedNode = head;   
		  head = head.getNextNode();
		  size--;
		  return removedNode.getEmployee();
	}
	
	
	public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    } 
    
    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextNode();
        }
        System.out.println("null");
    }

}
