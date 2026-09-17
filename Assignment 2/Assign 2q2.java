class Emp{
	String firstName;
	String lastName;
	double monthlySalary;
	
	Emp(String firstName,String lastName,double monthlySalary){
		this.firstName=firstName;
		this.lastName=lastName;
		if(monthlySalary>0) {
			this.monthlySalary=monthlySalary;
		}
	}
	void setFirstName(String firstName) {
		this.firstName=firstName;
	}
     String  getFirstName() {
		return firstName;
	}
     
 	void setLastName(String lastName) {
		this.lastName=lastName;
	}
     String  getLastName() {
		return lastName;
	}
     void setMonthlySalary(double salary) {
    	 if(salary>0) {
    		 monthlySalary=salary;
    	 }
     }
     double getMonthlySalary() {
    	 return monthlySalary;
     }
	
     double getYearlySalary() {
    	 return monthlySalary*12;
     }
}




public class Employee {

	public static void main(String[] args) {
		Emp s1=new Emp("Sarang ","Todkar",45000);
		Emp s2=new Emp("Vighnesh ","Patil",55000)

		System.out.println("Before salary increase");	
		System.out.println(s1.getFirstName() +""+s1.getYearlySalary());
		System.out.println(s2.getFirstName() +""+s2.getYearlySalary());
		
		s1.setMonthlySalary(s1.getMonthlySalary()*1.10);
		s2.setMonthlySalary(s1.getMonthlySalary()*1.10);
		
		 System.out.println("\nAfter Raise:");
	     System.out.println(s1.getFirstName() + " " + s1.getYearlySalary());
	     System.out.println(s2.getFirstName() + " " + s2.getYearlySalary());
	}

}
