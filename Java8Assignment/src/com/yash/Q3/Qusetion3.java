package com.yash.Q3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee{
	int eid;
	String employee_name;
	public int getEid() {
		return eid;
	}
	
	public String getEmployee_name() {
		return employee_name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid, employee_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(employee_name, other.employee_name);
	}

	protected Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", employee_name=" + employee_name + ", getEid()=" + getEid()
				+ ", getEmployee_name()=" + getEmployee_name() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	protected Employee(int eid, String employee_name) {
		super();
		this.eid = eid;
		this.employee_name = employee_name;
	}
	
}
public class Qusetion3 {
	public static void main(String[] args) {
		
	
	List<Employee> employee=new ArrayList<>();
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter no of employee");
	int n=scan.nextInt();
	for(int i=1;i<=n;i++) {
	System.out.println("Enter employee id");
	int id=scan.nextInt();
	System.out.println("Enter employee name");
	String name=scan.next();
	
		employee.add(new Employee(id,name));
	}
	
	List<Employee> empSort=employee.stream().sorted(Comparator.comparing(Employee::getEid)).collect(Collectors.toList());
	List<Employee>empDistinct=empSort.stream().distinct().collect(Collectors.toList());
//	empDistinct.stream().forEach(System.out::println);
	empDistinct.stream().map(e->e.getEmployee_name()+e.getEid()).forEach(System.out::println);

}
}