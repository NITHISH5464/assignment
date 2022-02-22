package assignment10;

public class Bank extends SBI {

public void maximamLoanAmount() {
	// TODO Auto-generated method stub
	System.out.println("99900000000");
	
}

public void creditScore() {
	// TODO Auto-generated method stub
	System.out.println("2000");
}

public void minimumBalance() {
	// TODO Auto-generated method stub
	System.out.println("500");
}

public void cibilScore() {
	// TODO Auto-generated method stub
	System.out.println("780");
}

@Override
public void ITLoan() {
	// TODO Auto-generated method stub
	System.out.println("7654345");
}
public static void main(String[] args) {
	Bank input=new Bank();
	input.bankBalance();
    input.cibilScore();
    input.creditScore();
    input.ITLoan();
    input.minimumBalance();
    input.maximumLoanAmount();
    input.maximamLoanAmount();
    
	
}

}
