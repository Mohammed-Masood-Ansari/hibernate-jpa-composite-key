package com.ibm.hibernate_composite_key_and_enum.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class AccountId implements Serializable{

	private String accountNumber;
	private String accountType;
	
}
