package com.example;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Message {
	@Id
	@GeneratedValue
	public Integer id;
	public String text;
	@Temporal(TemporalType.TIMESTAMP)
	public Date createdAt;
	public String username;
}