package com.yash.Q1;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {

	private int stuid;
	private String student_name;
	private float maths;
	private float physics;
	private float chemistry;
	private float biology;
	private float avg;

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public float getMaths() {
		return maths;
	}

	public void setMaths(float maths) {
		this.maths = maths;
	}

	public float getPhysics() {
		return physics;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}

	public float getChemistry() {
		return chemistry;
	}

	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}

	public float getBiology() {
		return biology;
	}

	public Student(int stuid, String student_name, float maths, float physics, float chemistry, float biology,
			float avg) {
		super();
		this.stuid = stuid;
		this.student_name = student_name;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.avg = avg;
	}

	public void setBiology(float biology) {
		this.biology = biology;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", student_name=" + student_name + ", maths=" + maths + ", physics="
				+ physics + ", chemistry=" + chemistry + ", biology=" + biology + ", avg=" + avg + ", getAvg()="
				+ getAvg() + ", getStuid()=" + getStuid() + ", getStudent_name()=" + getStudent_name() + ", getMaths()="
				+ getMaths() + ", getPhysics()=" + getPhysics() + ", getChemistry()=" + getChemistry()
				+ ", getBiology()=" + getBiology() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}

public class Question1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Students");
		int n = scan.nextInt();
		List<Student> students = new ArrayList<>();
		for (int i = 1; i <= n; i++) {

			System.out.println("Enter student id");
			int id = scan.nextInt();
			System.out.println("Enter student Student name");
			String name = scan.next();
			System.out.println("Enter student maths marks");
			float m = scan.nextFloat();
			System.out.println("Enter student physics marks");
			float p = scan.nextFloat();
			System.out.println("Enter student chemistry marks");
			float c = scan.nextFloat();
			System.out.println("Enter student biology marks");
			float b = scan.nextFloat();
			float avg1 = m + p + c + b;
			float avg2 = avg1 / 4;

			students.add(new Student(id, name, m, p, c, b, avg2));

		}

		for (Student student : students) {
			System.out.println("Student " + student.getStudent_name() + " has average marks of " + student.getAvg());
		}

	}

}
