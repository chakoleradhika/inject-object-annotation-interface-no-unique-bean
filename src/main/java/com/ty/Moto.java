package com.ty;

import org.springframework.stereotype.Component;

@Component
public class Moto implements Mobile {

	public void call() {
		System.out.println("calling moto mobile");

	}

}
