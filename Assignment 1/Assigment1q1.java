import java.util.Scanner;
public class assigment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		System.out.println("Entered Number:"+Integer.toBinaryString(num));
		System.out.println("Entered Number:"+Integer.toOctalString(num));
		System.out.println("Entered Number:"+Integer.toHexString(num));
	}

}
