package src;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.*;

public class main {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(12345678, 987654, "Mr J Smith", "savings", 1.1, 25362.91);
		BankAccount account2 = new BankAccount(87654321, 234567, "Ms J Jones", "current/checking", 0.2, 550);
		BankAccount account3 = new BankAccount(74639572, 946284, "Dr T Williams", "savings", 1.1, 4763.32);
		BankAccount account4 = new BankAccount(94715453, 987654, "Ms S Taylor", "savings", 1.1, 10598.01);
		BankAccount account5 = new BankAccount(16254385, 234567, "Mr P Brown", "current/checking", 0.2, -195.74);
		BankAccount account6 = new BankAccount(38776543, 946284, "Ms F Davies", "current/checking", 0.2, -503.47);
		BankAccount account7 = new BankAccount(87609802, 987654, "Mr B Wilson", "savings", 1.1, 2.5);
		BankAccount account8 = new BankAccount(56483769, 234567, "Dr E Evans", "current/checking", 0.2, -947.72);
		
		List<BankAccount> accounts = new ArrayList<>(Arrays.asList(account1, account2, account3, account4, account5, account6, account7, account8));
		System.out.println("Number of accounts: "+accounts.stream().count());
		Predicate<BankAccount> isOverdrawn = account -> account.getBalance() < 0 ? true: false;
		System.out.println("# of overdrawn accounts: "+accounts.stream().filter(isOverdrawn).count());
		Comparator <BankAccount> sortBalance = 
				(BankAccount one, BankAccount other) -> Double.compare(one.getBalance(), other.getBalance());
		Function<BankAccount, Double> accountBalance = account -> account.getBalance();
		System.out.println("Highest account balance: "+ accounts.stream().max(sortBalance));
		//System.out.println("Average account balance: "+ accounts.stream())
		
		
		
		
	}

}
