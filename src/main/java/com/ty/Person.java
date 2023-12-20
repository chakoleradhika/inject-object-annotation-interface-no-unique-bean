package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person
{
	//when we areusing auto wired we are using AutoWired it is injecting the mobile implementation
	@Autowired
	@Qualifier(value="nokia")
	private Mobile mobile;
	
	public void use()
	{
		System.out.println("person is using phone");
		mobile.call();
	}

//	@Autowired
//	public Person(Mobile mobile) {
//		super();
//		this.mobile = mobile;
//	}

	
}
