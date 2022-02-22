 package assignment3;

public class employeeDetails {
  
	public void emploeeName(String empName,int id) {
		System.out.println("NAME"+":"+empName);	
		System.out.println("EMP ID"+":"+id);
		
	}
	public void employeeNumber(long empNumber) {
	System.out.println("EMP NO"+":"+empNumber);		
	}
	public void empAddress(String empAddress) {
		System.out.println("EMP NAME"+":"+empAddress);
		
				}
	public void employeeSalary(double empSalary) {
		System.out.println("EMP SALARY"+":"+empSalary);
		
	}
	public static void main(String[] args) {
		employeeDetails input=new employeeDetails();
		input.emploeeName("NITHISH", 7218);
		input.empAddress("dubai kuruku santhu");
		input.employeeNumber(987654312);
		input.employeeSalary(90000);
	}
}
