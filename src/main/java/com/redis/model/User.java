package com.redis.model;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class User implements Serializable{
	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
}
