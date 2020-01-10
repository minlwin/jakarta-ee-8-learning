package com.jdc.ee8.cdi;

import javax.annotation.Priority;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;

@Dependent
public class UserObserverOne {

	public void take(@Observes @Priority(1) User user) {
		System.out.println("Observer 1 Do Job!");
		System.out.println(user.getName());
	}
}
