package com.event.geru.interview.oportun;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Develop a program called ATM. It allows customers to deposit and withdraw in
 * these denominations: 20, 10, 5, and 1 dollar bills.
 * 
 * Deposit: Customer inputs the number of currency notes in each denomination
 * 
 * D.1) If any input values are negative, print "Incorrect deposit amount". D.2)
 * If all the input values are zero, print "Deposit amount cannot be zero". D.3)
 * If the input values are valid, increment the balances of corresponding dollar
 * bills and print the available new balances in each denomination and the total
 * balance.
 * 
 * Withdraw: Customer input the amount to withdraw. ATM dispenses the 20, 10, 5,
 * and 1 dollar bills as needed.
 * 
 * W.1) If the input amount is zero, negative, or over the current balance,
 * print "Incorrect or insufficient funds". W.2) If the input amount is in valid
 * range, print the number of current notes dispensed in each denomination. Use
 * the available higher denomination first. Also, print the available new
 * balances in each denomination and the total balance. W.3) If any denomination
 * is not available to cover the withdrawal amount, do not reduce the balances.
 * Instead, print "Requested withdraw amount is not dispensable". See Withdraw 3
 * scenario below.
 * 
 * For example,
 * 
 * Deposit 1: 10s: 8, 5s: 20 ---------------------------------
 * 
 * Balance: 20s=0, 10s=8, 5s=20, 1s=0, Total=180
 * 
 * Deposit 2: 20s: 3, 5s: 18, 1s: 4 ----------------------------------------
 * 
 * Balance: 20s=3, 10s=8, 5s=38, 1s=4, Total=334
 * 
 * Withdraw 1: 75 ---------------------
 * 
 * Dispensed: 20s=3, 10s=1, 5s=1 Balance: 20s=0, 10s=7, 5s=37, 1s=4, Total=259
 * 
 * Withdraw 2: 122 ----------------------
 * 
 * Dispensed: 10s=7, 5s=10, 1s=2 Balance: 20s=0, 10s=0, 5s=27, 1s=2, Total=137
 * 
 * Withdraw 3: 63 ----------------------
 * 
 * Output: "Requested withdraw amount is not dispensable"
 * 
 * Note: At this stage, the ATM has only two 1 dollar bills. So, the withdrawal
 * amount cannot be dispensed.
 * 
 * Withdraw 3: 253 ----------------------
 * 
 * Output: "Incorrect or insufficient funds"
 * 
 * Withdraw 4: 0 -------------------
 * 
 * Output: "Incorrect or insufficient funds"
 * 
 * Withdraw 5: -25 ----------------------
 * 
 * Output: "Incorrect or insufficient funds"
 * 
 * @author vikram
 *
 */
public class ATM {

	public static TreeMap<Integer, Integer> deposit = new TreeMap<Integer, Integer>(Collections.reverseOrder());

	public void deposit(TreeMap<Integer, Integer> deposit) {

		Integer balance = 0;
		System.out.print("Balance:");

		for (Map.Entry<Integer, Integer> entry : deposit.entrySet()) {
			Integer denomination = entry.getKey();
			balance += (denomination * entry.getValue());
			System.out.print(entry.getKey() + "=" + entry.getValue());
			System.out.print(",");
		}

		System.out.println("Total Balance " + balance);
	}

	public void withdraw(Integer value) {

		// balance -= value;
		System.out.print("Dispensed:");

		for (Map.Entry<Integer, Integer> entry : deposit.entrySet()) {
			Integer denomination = entry.getKey();
			Integer result = value / denomination;

			System.out.print(denomination + "s");
			System.out.print("=" + result + ",");

			if (result > 0 || value > 0) {
				value -= result * denomination;
				deposit.put(denomination, entry.getValue() - result);
			}
		}

		System.out.println();

		deposit(deposit);

	}

	public static void main(String args[]) {

		ATM atm = new ATM();
		int numberOfTraction = 0;

		Integer count, denomination;

		Scanner scanner = new Scanner(System.in);
		numberOfTraction = scanner.nextInt();
		System.out.println("Enter number of transactions " + numberOfTraction);

		while (numberOfTraction >= 0) {

			String input = scanner.nextLine();

			if (input.contains("Deposit")) {
				String results[] = input.split(",");

				for (int i = 0; i < results.length; i++) {

					String[] eachamount = results[i].split(":");

					if (i == 0) {
						count = Integer.parseInt(eachamount[2].trim());
						denomination = Integer.parseInt(eachamount[1].substring(01, eachamount[1].length() - 1).trim());

						if (deposit.containsKey(denomination))
							deposit.put(denomination, deposit.get(denomination) + count);
						else
							deposit.put(denomination, count);
					} else {
						count = Integer.parseInt(eachamount[1].trim());
						denomination = Integer.parseInt(eachamount[0].substring(0, eachamount[0].length() - 1).trim());

						if (deposit.containsKey(denomination))
							deposit.put(denomination, deposit.get(denomination) + count);
						else
							deposit.put(denomination, count);
					}

				}

				atm.deposit(deposit);
			}
			if (input.contains("Withdraw ")) {
				String results[] = input.split(":");
				Integer withdraw = Integer.parseInt(results[1].trim());

				atm.withdraw(withdraw);
			}

			numberOfTraction--;
		}
		scanner.close();

	}
}
