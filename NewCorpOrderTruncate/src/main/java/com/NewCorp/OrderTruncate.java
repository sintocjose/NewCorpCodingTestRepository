package com.NewCorp;

/**
 * 
 * Interace for Order Truncate 
 * @author Sinto
 */
public interface OrderTruncate {
	
	public static final String truncateString = " ... (truncated) ... ";
	public String truncate(String orderDetails,int resultStringLength);

}
