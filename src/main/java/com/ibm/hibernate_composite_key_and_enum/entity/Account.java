package com.ibm.hibernate_composite_key_and_enum.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	@EmbeddedId
	private AccountId accountId;
	private String accountName;
	private String accountEmail;
	
	
}
