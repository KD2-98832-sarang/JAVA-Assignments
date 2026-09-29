package com.sunbeam;

import java.util.Scanner;


class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// toString()
	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
	}
}



interface Stack {
	int STACK_SIZE = 5;   // constant

	void push(Employee e);

	Employee pop();
}



class FixedStack implements Stack {
	private Employee[] arr;
	private int top;

	public FixedStack() {
		arr = new Employee[STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Employee e) {
		if (top == STACK_SIZE - 1) {
			System.out.println("Stack is full !!!");
		} else {
			top++;
			arr[top] = e;
			System.out.println("Employee pushed successfully");
		}
	}

	@Override
	public Employee pop() {
		if (top == -1) {
			System.out.println("Stack is empty !!!");
			return null;
		} else {
			Employee e = arr[top];
			arr[top] = null;
			top--;
			return e;
		}
	}
}

class GrowableStack implements Stack {
	private Employee[] arr;
	private int top;

	public GrowableStack() {
		arr = new Employee[STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Employee e) {
		
		if (top == arr.length - 1) {
			Employee[] temp = new Employee[arr.length * 2];

			for (int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}

			arr = temp;

			System.out.println("Stack size increased");
		}

		top++;
		arr[top] = e;

		System.out.println("Employee pushed successfully");
	}

	@Override
	public Employee pop() {
		if (top == -1) {
			System.out.println("Stack is empty !!!");
			return null;
		} else {
			Employee e = arr[top];
			arr[top] = null;
			top--;
			return e;
		}
	}
}

public class Program {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Stack stack = null;

		int choice;

		while ((choice = menu()) != 5) {

			switch (choice) {

			case 1:
				if (stack == null) {
					stack = new FixedStack();
					System.out.println("Fixed Stack selected");
				} else {
					System.out.println("Stack already selected");
				}
				break;

			case 2:
				if (stack == null) {
					stack = new GrowableStack();
					System.out.println("Growable Stack selected");
				} else {
					System.out.println("Stack already selected");
				}
				break;

			case 3:
				if (stack == null) {
					System.out.println("NO stack chosen !!!");
				} else {
					System.out.print("Enter Employee ID: ");
					int id = sc.nextInt();

					System.out.print("Enter Employee Name: ");
					String name = sc.next();

					System.out.print("Enter Employee Salary: ");
					double salary = sc.nextDouble();

					Employee e = new Employee(id, name, salary);

					stack.push(e);
				}
				break;

			case 4:
				if (stack == null) {
					System.out.println("NO stack chosen !!!");
				} else {
					Employee e = stack.pop();

					if (e != null) {
						System.out.println("Popped Employee:");
						System.out.println(e);
					}
				}
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}

		System.out.println("Program terminated");
	}
	public static int menu() {
		System.out.println("\nMENU ");
		System.out.println("1. Choose Fixed Stack");
		System.out.println("2. Choose Growable Stack");
		System.out.println("3. Push Data");
		System.out.println("4. Pop Data");
		System.out.println("5. Exit");
		System.out.print("Enter choice: ");

		return sc.nextInt();
	}
}