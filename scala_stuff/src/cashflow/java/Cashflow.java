package cashflow.java;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cashflow {
	private final double amount;
	private final String currency;
	private final LocalDateTime due;

	public Cashflow(double amount, String currency, LocalDateTime due) {
		this.amount = amount;
		this.currency = currency;
		this.due = due;
	}

	public double getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public LocalDateTime getDue() {
		return due;
	}
}
