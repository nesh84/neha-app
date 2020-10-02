package com.boot.dev.ops.test.TestApl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipwreck {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="[id]")
	Long id;
	
	@Column(name="[name]")
	String name;
	
	@Column(name="[description]")
	String description;
	
	@Column(name="[condition]")
	String condition;

	public Shipwreck() { }

	public Shipwreck(Long id, String name, String description, String condition) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.condition = condition;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
