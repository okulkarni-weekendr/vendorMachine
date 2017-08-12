package cashflow.java;

import java.time.LocalDateTime;

public class LoyaltyCard {
	private Long id;
	private String userName;
	private LocalDateTime expirationDate;
	private String _3digitPin;

	public LoyaltyCard(Long id, String userName, LocalDateTime expirationDate, String _3digitPin) {
		this.id = id;
		this.userName = userName;
		this.expirationDate = expirationDate;
		this._3digitPin = _3digitPin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String get_3digitPin() {
		return _3digitPin;
	}

	public void set_3digitPin(String _3digitPin) {
		this._3digitPin = _3digitPin;
	}
}
