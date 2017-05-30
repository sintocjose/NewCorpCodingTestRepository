package com.NewCorp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sinto
 *
 */
@RestController
public class SubscriptionController {
	
	@Autowired
	public OrderTruncate orderTruncate;
	
	@RequestMapping (value = "/subscribe" , method = RequestMethod. GET )
	public String subscribe(HttpServletRequest request ) {
		//String orderDetails = getOrderDetails( request );
		//String truncatedOrderDetails = truncate( orderDetails, 250 );
		String orderString = "123456789012345678901234567890";
		OrderTruncate orderTruncate = new OrderTruncateImpl();
		System.out.println(orderTruncate.truncate(orderString, 25));
		return orderTruncate.truncate(orderString, 25);
	}

}
