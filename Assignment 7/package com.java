package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ISBN = " + isbn +
				", Price = " + price +
				", Author = " + authorName +
				", Quantity = " + quantity;
	}
}

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Book> list = new ArrayList<>();

		int choice;

		do {
			System.out.println("\n----- LIBRARY MENU -----");
			System.out.println("1. Add new book");
			System.out.println("2. Display all books in forward order");
			System.out.println("3. Display all books in reverse order");
			System.out.println("4. Delete book at given index");
			System.out.println("5. Sort books by price in descending order");
			System.out.println("0. Exit");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter ISBN: ");
				String isbn = sc.next();

				System.out.print("Enter price: ");
				double price = sc.nextDouble();

				System.out.print("Enter author name: ");
				String authorName = sc.next();

				System.out.print("Enter quantity: ");
				int quantity = sc.nextInt();

				Book b = new Book(isbn, price, authorName, quantity);

				list.add(b);

				System.out.println("Book added successfully.");
				break;

			case 2:
				System.out.println("\nBooks in Forward Order:");

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				break;

			case 3:
				System.out.println("\nBooks in Reverse Order:");

				for (int i = list.size() - 1; i >= 0; i--) {
					System.out.println(list.get(i));
				}
				break;

			case 4:
				System.out.print("Enter index to delete: ");
				int index = sc.nextInt();

				if (index >= 0 && index < list.size()) {
					list.remove(index);
					System.out.println("Book deleted successfully.");
				} else {
					System.out.println("Invalid index.");
				}
				break;

			case 5:
				list.sort((b1, b2) -> Double.compare(b2.getPrice(), b1.getPrice()));

				System.out.println("Books sorted by price in descending order.");
				break;

			case 0:
				System.out.println("Program ended.");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 0);

		sc.close();
	}
}