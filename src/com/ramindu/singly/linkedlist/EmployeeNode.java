package com.ramindu.singly.linkedlist;

public class EmployeeNode {
	private EmployeeNode nextNode;
	private Employee employee;
	
	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(EmployeeNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public String toString() {
        return employee.toString();
    }

}
