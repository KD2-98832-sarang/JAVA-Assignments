import java.util.*;
public class CreditLimitCalculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the account No :");
		int accountNo=sc.nextInt();
		
		System.out.println("Enter the begining balance :");
		int beginingBal=sc.nextInt();
		
		System.out.println("Enter the total charges:");
		int charges=sc.nextInt();
		
		System.out.println("Enter the total credits : ");
		int credits=sc.nextInt();
		
		System.out.println("Enter the credit limit:");
		int creditLimit=sc.nextInt();
		
		int newBalance=beginingBal+charges-credits;
		
		
		System.out.println(" account No :" + accountNo);
		System.out.println(" new balance :" + newBalance  );
		
		if(newBalance>creditLimit) {
			System.out.println("credit limit exceed");
		}else {
			System.out.println("credit limit not exceed");
		}
		
		
		sc.close();
	}

}
