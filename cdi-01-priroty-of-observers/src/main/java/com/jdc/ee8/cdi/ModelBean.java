package com.jdc.ee8.cdi;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ModelBean {

	private User user;
	
	@Inject
	private Event<User> userUpdateEvent;
	
	@PostConstruct
	private void init() {
		user = new User();
	}
	
	public String save() {
		userUpdateEvent.fire(user);
		return null;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
