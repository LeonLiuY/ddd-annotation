package liuyang.ddd.annotation.test;

import liuyang.ddd.annotation.ValueObject;

@ValueObject
public class MyValueObject {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
