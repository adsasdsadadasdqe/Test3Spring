package io.javabrains.springbootquickstart.topic;

public class Topic {
	
	private String id;
	private String name;
	private String description;
	
	public Topic() {
		
		
	}
	
	public Topic(String id,String name,String description) {
		super();
		this.id=id;
		this.name=name;
		this.description=description;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description=description;
	}

}
