


import java.util.Scanner;

abstract class Fruit {

    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    public Fruit(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isFresh = true;
    }

    public String getName() {
        return name;
    }

    public boolean getIsFresh() {
        return isFresh;
    }

    public void setIsFresh(boolean isFresh) {
        this.isFresh = isFresh;
    }

    @Override
    public String toString() {
        return "Name: " + name + ",Color: " + color
                + ", Weight: " + weight;
    }

    public abstract String taste();
}

class Apple extends Fruit {

    public Apple(String name, double weight, String color) {
        super(name, weight, color);
    }

    public String taste() {
        return "Sweet and sour";
    }
}

class Mango extends Fruit {

    public Mango(String name, double weight, String color) {
        super(name, weight, color);
    }

    public String taste() {
        return "Sweet";
    }
}

class Orange extends Fruit {

    public Orange(String name, double weight, String color) {
        super(name, weight, color);
    }

    public String taste() {
        return "Sour";
    }
}

public class FruitBasket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int n = sc.nextInt();

        Fruit[] basket = new Fruit[n];
        int counter = 0;
        int choice;

        do {

            System.out.println("\n0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names");
            System.out.println("5. Display fresh fruits");
            System.out.println("6. Display stale tastes");
            System.out.println("7. Mark fruit stale");
            System.out.println("8. Mark sour fruits stale");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 0:
                    System.out.println("Exit");
                    break;

                case 1:
                case 2:
                case 3:

                    if (counter == n) {
                        System.out.println("Basket is full!");
                        break;
                    }

                    System.out.print("Enter name: ");
                    String name = sc.next();

                    System.out.print("Enter weight: ");
                    double weight = sc.nextDouble();

                    System.out.print("Enter color: ");
                    String color = sc.next();

                    if (choice == 1) {
                        basket[counter++] =
                                new Mango(name, weight, color);
                    } else if (choice == 2) {
                        basket[counter++] =
                                new Orange(name, weight, color);
                    } else {
                        basket[counter++] =
                                new Apple(name, weight, color);
                    }

                    System.out.println("Fruit added!");
                    break;

                case 4:

                    for (Fruit f : basket) {
                        if (f != null) {
                            System.out.println(f.getName());
                        }
                    }
                    break;

                case 5:

                    for (Fruit f : basket) {
                        if (f != null && f.getIsFresh()) {
                            System.out.println(f);
                            System.out.println("Taste: " + f.taste());
                        }
                    }
                    break;

                case 6:

                    for (Fruit f : basket) {
                        if (f != null && !f.getIsFresh()) {
                            System.out.println(
                                    f.getName() + " : " + f.taste()
                            );
                        }
                    }
                    break;

                case 7:

                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    if (index < 0 || index >= counter) {
                        System.out.println("Invalid index!");
                    } else {
                        basket[index].setIsFresh(false);
                        System.out.println("Fruit marked stale.");
                    }
                    break;

                case 8:

                    for (Fruit f : basket) {
                        if (f != null &&
                                f.taste().equals("Sour")) {
                            f.setIsFresh(false);
                        }
                    }

                    System.out.println(
                            "All sour fruits marked stale."
                    );
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
