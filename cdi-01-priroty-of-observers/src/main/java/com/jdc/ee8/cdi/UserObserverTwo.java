package com.jdc.ee8.cdi;

import javax.annotation.Priority;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;

@Dependent
public class UserObserverTwo {

	public void take(@Observes @Priority(2) User user) {
		System.out.println("Observer 2 Do Job!");
		System.out.println(user.getName());
	}

}
