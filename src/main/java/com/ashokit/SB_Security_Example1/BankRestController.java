package com.ashokit.SB_Security_Example1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

	@GetMapping("/home")
	public String getMessage() {
		String msg = "Welcome to Ashok IT Bank";
		return msg;
	}

	@GetMapping("/balance")
	public String getBalance() {
		String msg = "Your current balance 458 Rs";
		return msg;
	}

	@GetMapping("/statement")
	public String getStatement() {
		String msg = "Your statement is generated";
		return msg;
	} 
	@GetMapping("/myloan")
	public String getLoan() {
		String msg = "Your Loan closed";
		return msg;
	} 
	@GetMapping("/contact")
	public String contact() {
		String msg = "Thank you for contacting customer care, we will get back to you soon";
		return msg;
	} 
}
