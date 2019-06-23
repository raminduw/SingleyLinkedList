package com.ramindu.singly.linkedlist;

public class Main {
	
	public static void main(String[] args) {
        System.out.println("*****SINGLEY LINKED LIST*****");
        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(456,"John", "Doe");
        Employee marySmith = new Employee(567,"Mary", "Smith");
        Employee mikeWilson = new Employee(899,"Mike", "Wilson");

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println("LINKED LIST is Empty : " +list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println("LINKED LIST Size : " +list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println("LINKED LIST Size : " +list.getSize());
        list.printList();

    }

}
