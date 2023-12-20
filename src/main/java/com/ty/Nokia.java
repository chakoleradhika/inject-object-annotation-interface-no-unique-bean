package com.ty;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Nokia implements Mobile
{
	public void call() {
		System.out.println("calling using nokia");
		
	}

}
