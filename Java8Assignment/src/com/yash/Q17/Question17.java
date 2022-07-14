package com.yash.Q17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

//Question no 17

class Employee {
	String emp_name, date_of_birth, date_of_joining, date_of_resign, work_location, department;
	double salary;

	public String getEmp_name() {
		return emp_name;
	}

	protected Employee() {
		super();
//TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	protected Employee(String emp_name, String date_of_birth, String date_of_joining, String date_of_resign,
			String work_location, String department, double salary) {
		super();
		this.emp_name = emp_name;
		this.date_of_birth = date_of_birth;
		this.date_of_joining = date_of_joining;
		this.date_of_resign = date_of_resign;
		this.work_location = work_location;
		this.department = department;
		this.salary = salary;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getDate_of_resign() {
		return date_of_resign;
	}

	public void setDate_of_resign(String date_of_resign) {
		this.date_of_resign = date_of_resign;
	}

	public String getWork_location() {
		return work_location;
	}

	public void setWork_location(String work_location) {
		this.work_location = work_location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}

public class Question17 {
	public static void main(String[] args) throws ParseException {
		ArrayList<Employee> I = new ArrayList<Employee>();
		I.add(new Employee("abhishek", "1996-01-03", "22/05/2022", "22/05/2024", "hinjewadi", "JavaTraniee", 25000));
		I.add(new Employee("nilesh", "1993-11-05", "15/05/2021", "22/05/2029", "wakad", "PythonTraniee", 35000));
		I.add(new Employee("namdev", "2000-12-07", "22/05/2022", "22/05/2027", "indore", "JavaTraniee", 12000));
		I.add(new Employee("anurag", "2004-02-09", "22/05/2020", "22/05/2030", "pune", "SapTrainee", 40000));
		I.add(new Employee("ajinkya", "1997-23-05", "22/05/2019", "22/05/2023", "satara", "SapTrainee", 10000));
		I.add(new Employee("prakash", "1996-30-06", "22/05/2020", "22/05/2030", "hinjewadi", "JavaTraniee", 28000));

		Scanner scan = new Scanner(System.in);
		System.out.println(
				" 1.to find department with max and min employees \n 2.employee in particular department \n 3.find employee experience \n 4.find average salary of employee by department \n 5.find highest and lowest salary of employee by department ");

		while (true) {
			int ch = scan.nextInt();
			switch (ch) {
			case 1:
				Map<String, Long> a = I.stream()
						.collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()));
				long maxValueInMap = (Collections.max(a.values()));
				long min = (Collections.min(a.values()));
				System.out.println(min);

				for (Entry<String, Long> entry : a.entrySet()) {

					if (entry.getValue() == maxValueInMap) {

						System.out.println("The Department having maximum no of Employee :" + entry.getKey());
					}
					if (entry.getValue() == min) {

						System.out.println("The Department having minimum no of Employee :" + entry.getKey());
					}

				}
				break;

			case 2:
				System.out.println("Enter department");
				String dep = scan.next();
				I.stream().filter(e -> e.department.contains(dep)).map(e -> e.emp_name).forEach(System.out::println);

				break;
			case 3:

				I.stream().map(j -> j.date_of_joining).collect(Collectors.toList());
				I.stream().map(r -> r.date_of_resign).collect(Collectors.toList());
				List<Employee> ii = I.stream().sorted((e1, e2) -> e2.date_of_resign.compareTo(e1.date_of_joining))
						.collect(Collectors.toList());

				List<Employee> empdatediff = new ArrayList<>();
				for (int i = 0; i <= I.size() - 1; i++) {
					String date1 = I.get(i).date_of_joining;

					String date2 = I.get(i).date_of_resign;

					SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
					Date firstdate = sdf.parse(date1);
					Date seconddate = sdf.parse(date2);

					long diffInM = Math.abs(seconddate.getTime() - firstdate.getTime());
					long diff = TimeUnit.DAYS.convert(diffInM, TimeUnit.MILLISECONDS);
					System.out.println(I.get(i).emp_name + " has experience " + diff / 365);

				}
				break;

			case 4:
				System.out.println("Enter department");
				String dep2 = scan.next();

				Double y = I.stream().filter(e -> e.getDepartment().contains(dep2)).mapToDouble(val -> val.salary)
						.average().getAsDouble();
				System.out.println("Average salary of employee is : " + y);

				break;
			case 5:
				System.out.println("Enter Deparment");
				String depp4 = scan.next();
				Double maximum = I.stream().filter(e -> e.department.contains(depp4)).mapToDouble(e -> e.getSalary())
						.max().getAsDouble();
				System.out.println("maximum salary is " + maximum);

				Double minimum = I.stream().filter(m -> m.department.contains(depp4)).mapToDouble(e -> e.getSalary())
						.min().getAsDouble();
				System.out.println("Minimum salary is " + minimum);

				ch = scan.nextInt();

				if (ch == 5) {
					break;
				}
				break;
			}

		}
	}
}