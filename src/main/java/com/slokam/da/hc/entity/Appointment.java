package com.slokam.da.hc.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="appointment")
public class Appointment {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Date taken;
	private Date reqDate;
	private String comments;
	
	
	@ManyToOne
	@JoinColumn(name="pid")
	private Patient patient;
	
	
	
	
}
