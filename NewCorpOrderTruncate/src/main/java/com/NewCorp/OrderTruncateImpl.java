package com.NewCorp;

import org.springframework.stereotype.Service;

/**
 * Implementation class for Truncating the Order
 * @author Sinto
 *
 */
@Service
public class OrderTruncateImpl implements OrderTruncate{
	
	private int trucateStringLength = truncateString.length();

	public OrderTruncateImpl() {
	}
	/**
	 * Truncate the order details depends on the input string
	 */
	@Override
	public String truncate(String orderDetails, int resultStringLength) {
		int inputStringLength = orderDetails.length();
		if(resultStringLength<=trucateStringLength){
			return orderDetails;
		}
		if(inputStringLength<=resultStringLength){
			return orderDetails;
		}
		int calculateVal  = (resultStringLength-trucateStringLength)/2;
		String firstPart  =  orderDetails.substring(0, calculateVal);
		String secondPart =  orderDetails.substring(inputStringLength-calculateVal);
		String resultString = firstPart + truncateString + secondPart;
		return resultString;
	}
	public static void main(String[] args) {
		String orderString = "123456789012345678901234567890";
		OrderTruncate orderTruncate = new OrderTruncateImpl();
		System.out.println(orderTruncate.truncate(orderString, 25));
		
		System.out.println(orderTruncate.truncate( "1234567890" , 5));
		System.out.println(orderTruncate.truncate( "123456789012345678901234567890" , 31));
	}
}
