package net.authorize.data;

import java.io.Serializable;

/**
 * Merchants can opt to send a payment gateway generated email receipt to
 * customers who provide an email address with their transaction.
 *
 * The email receipt includes a summary and results of the transaction.
 * 
 * @deprecated since version 1.9.8
 * @deprecated We have reorganized and simplified the Authorize.Net API to ease integration and to focus on merchants' needs.
 * @deprecated We have deprecated AIM, ARB, CIM, and Reporting as separate options, in favor of AuthorizeNet::API (package: net.authorize.api.*).
 * @deprecated We have also deprecated SIM as a separate option, in favor of Accept Hosted. See https://developer.authorize.net/api/reference/features/accept_hosted.html for details on Accept Hosted.
 * @deprecated For details on AIM, see https://github.com/AuthorizeNet/sample-code-java/tree/master/src/main/java/net/authorize/sample/PaymentTransactions.
 * @deprecated For details on the deprecation and replacement of legacy Authorize.Net methods, visit https://developer.authorize.net/api/upgrade_guide/.
 *
 */
@Deprecated
public class EmailReceipt implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static final int MAX_EMAIL_LENGTH = 255;

	private String email;
	private boolean emailCustomer = false;
	private String headerEmailReceipt;
	private String footerEmailReceipt;
	private String merchantEmail;

	private EmailReceipt() { }

    public static EmailReceipt createEmailReceipt() {

		return new EmailReceipt();
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the emailCustomer
	 */
	public boolean isEmailCustomer() {
		return emailCustomer;
	}

	/**
	 * @param emailCustomer the emailCustomer to set
	 */
	public void setEmailCustomer(boolean emailCustomer) {
		this.emailCustomer = emailCustomer;
	}

	/**
	 * @return the headerEmailReceipt
	 */
	public String getHeaderEmailReceipt() {
		return headerEmailReceipt;
	}

	/**
	 * @param headerEmailReceipt the headerEmailReceipt to set
	 */
	public void setHeaderEmailReceipt(String headerEmailReceipt) {
		this.headerEmailReceipt = headerEmailReceipt;
	}

	/**
	 * @return the footerEmailReceipt
	 */
	public String getFooterEmailReceipt() {
		return footerEmailReceipt;
	}

	/**
	 * @param footerEmailReceipt the footerEmailReceipt to set
	 */
	public void setFooterEmailReceipt(String footerEmailReceipt) {
		this.footerEmailReceipt = footerEmailReceipt;
	}

	/**
	 * @return the merchantEmail
	 */
	public String getMerchantEmail() {
		return merchantEmail;
	}

	/**
	 *
	 * @param merchantEmail
	 */
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
}
