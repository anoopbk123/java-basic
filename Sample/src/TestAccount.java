class Account{
	int acc_no;
	String name;
	float amount;
	void insert(int a,String n,float amt) {
		acc_no=a;
		name=n;
		amount=amt;
	}
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt+"deposited");
	}
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("insefficient balance");
		}
			else {
				amount=amount-amt;
				System.out.println(amt+"widthdrawn");
			}
		}
	void balance() {
		System.out.println(amount);
	}
}
public class TestAccount {

}
