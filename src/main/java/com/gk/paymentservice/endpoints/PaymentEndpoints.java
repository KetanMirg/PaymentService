package com.gk.paymentservice.endpoints;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentEndpoints {
	
	@RequestMapping(value="/getpaymentbyproductid/{id}",method=RequestMethod.GET)
	public String getPaymentForProduct(@PathVariable("id") String id)
	{
		System.out.println("Product id :-"+id);
		return "Rs34000";
	}

}
