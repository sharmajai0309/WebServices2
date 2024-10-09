package com.Backend.jai.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "StdTab")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private Integer stdId;
	
	@Column(name = "sname")
	@NotBlank(message = "Name must Be Filled")
	@NotEmpty(message = "Name must Not Be Empty")
	@NotNull(message = "Name must Not Be Null")
	@Pattern(regexp = "^[a-zA-Z\\s'-]+$", message = "Invalid name format")
	@Size(min = 2,max = 100)
	private String stdName;
	
	
	@Pattern(regexp = "^(Male|Female|Other)$", message = "Invalid gender. Must be 'Male', 'Female', or 'Other'") 
	@Column(name = "sgen")
	private String stdGen;
	
	 
	@Column(name = "scourse")
	@NotBlank(message = "Course must Be Filled")
	@Pattern(regexp = "^(BCA|MCA|BCom|BTech|BBA|MBA|BSc|MSc|BA|MA|BPharm|MPharm|BE|ME)$", message = "Invalid course. Must be one of 'BCA', 'MCA', 'BCom', 'BTech', 'BBA', 'MBA', 'BSc', 'MSc', 'BA', 'MA', 'BPharm', 'MPharm', 'BE', or 'ME'")
	private String stdCourse;
	
	@NotBlank(message = "Address must Be Filled")
	@Pattern(regexp = "^[a-zA-Z0-9\\s,.-/]+$", message = "Invalid address format")
	@Column(name = "saddr")
	private String stdAddr;


}
