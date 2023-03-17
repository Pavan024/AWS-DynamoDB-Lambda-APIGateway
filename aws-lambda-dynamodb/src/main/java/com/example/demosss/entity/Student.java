package com.example.demosss.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "student")
public class Student {

	@DynamoDBHashKey(attributeName = "studId")
	private String studId;

	@DynamoDBAttribute(attributeName = "name")
	private String name;

	@DynamoDBAttribute(attributeName = "email")
	private String email;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
