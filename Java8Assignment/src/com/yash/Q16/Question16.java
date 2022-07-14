package com.yash.Q16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Item {
	int itemid;
	String item_name, category_name;
	double price;
	String date_of_manufacturing, date_of_expiring;

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDate_of_manufacturing() {
		return date_of_manufacturing;
	}

	public void setDate_of_manufacturing(String date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}

	public String getDate_of_expiring() {
		return date_of_expiring;
	}

	public void setDate_of_expiring(String date_of_expiring) {
		this.date_of_expiring = date_of_expiring;
	}

	protected Item(int itemid, String item_name, String category_name, double price, String date_of_manufacturing,
			String date_of_expiring) {
		super();
		this.itemid = itemid;
		this.item_name = item_name;
		this.category_name = category_name;
		this.price = price;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiring = date_of_expiring;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", item_name=" + item_name + ", category_name=" + category_name + ", price="
				+ price + ", date_of_manufacturing=" + date_of_manufacturing + ", date_of_expiring=" + date_of_expiring
				+ "]";
	}

}

public class Question16 {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();

		items.add(new Item(1, "bag", "travel", 3000, "22/10/2024", "22/10/2026"));
		items.add(new Item(2, "mouse", "computer_accessories", 4500, "02/01/2020", "26/10/2029"));
		items.add(new Item(3, "pen", "study", 500, "22/10/2020", "11/05/2027"));
		items.add(new Item(4, "book", "study", 300, "15/04/2024", "16/09/2029"));
		items.add(new Item(5, "table", "furniture", 6000, "23/10/2021", "23/10/2026"));

		Scanner scan = new Scanner(System.in);
		System.out.println(
				" 1.to find item by cateory name\n 2.find item by starting name \n 3.find product on basis of date \n 4.find product by price range ");
		int ch = scan.nextInt();
		while (true) {
			switch (ch) {
			case 1:
				System.out.println("Enter category name");
				String category = scan.next();
				List<Item> i = items.stream().filter(e -> e.category_name.contains(category))
						.collect(Collectors.toList());
				i.stream().forEach(System.out::println);
				break;

			case 2:
				System.out.println("Enter item starting name");
				String itemname = scan.next();
				List<Item> ii = items.stream().filter(e -> e.item_name.startsWith(itemname))
						.collect(Collectors.toList());
				ii.stream().forEach(System.out::println);
				break;
			case 3:
				System.out.println("Enter  date");
				String date = scan.next();
				List<Item> ii2 = items.stream()
						.filter(e -> e.date_of_expiring.contains(date) || e.date_of_manufacturing.contains(date))
						.collect(Collectors.toList());
				ii2.stream().forEach(System.out::println);
				break;
			case 4:
				System.out.println("Enter  max range");
				int maxrange = scan.nextInt();
				System.out.println("Enter  min range");
				int minrange = scan.nextInt();
				List<Item> iii = items.stream().filter(m -> m.price > minrange && m.price < maxrange)
						.collect(Collectors.toList());
				iii.stream().forEach(System.out::println);
				break;

			}
			System.out.println(
					" 1.to find item by cateory name\n 2.find item by starting name \n 3.find product on basis of date \n 4.find product by price range ");
			System.out.println("if want to exit press 5");
			ch = scan.nextInt();
			if (ch == 5) {
				break;
			}
		}

	}

}
