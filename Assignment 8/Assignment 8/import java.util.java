import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // Create ArrayList
        List<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Print original list
        System.out.println("Original List:");
        System.out.println(colors);

        // Sort the list
        colors.sort(null);

        // Print sorted list
        System.out.println("Sorted List:");
        System.out.println(colors);
    }
}