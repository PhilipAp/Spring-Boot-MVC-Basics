package com.philip.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@NotEmpty
	@Pattern(regexp = "[^0-9]+")
	private String name;
	
	
	@Min(value = 18)
	@Max(value = 75)
	@NotNull
	private Integer age;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String country;	

}
