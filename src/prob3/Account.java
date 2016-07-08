package prob3;

public class Account {
	private String accountNo;
	private int balance;

	public Account(String accountNo) {
		setAccountNo(accountNo);
	}

	public void save(int num) {
		balance = balance + num;
		System.out.println(accountNo + " 계좌에 " + balance + "만원이 입금되었습니다.");
	}

	public void deposit(int num) {
		balance = balance - num;
		System.out.println(accountNo + " 계좌에 " + balance + "만원이 출금되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}