package com.bby175.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EoM {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String lastName;
	private Integer voteAmount;
	
	public EoM () {
		
	}

	public EoM(String firstName, String lastName, Integer voteAmount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.voteAmount = voteAmount;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getVoteAmount() {
		return voteAmount;
	}

	public void setVoteAmount(Integer voteAmount) {
		this.voteAmount = voteAmount;
	}
	
	
	
	
}
