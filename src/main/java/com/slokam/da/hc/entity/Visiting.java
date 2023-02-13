package com.slokam.da.hc.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="visiting")
public class Visiting {


	@Id
	@GeneratedValue
	private Integer id;
	private Date time;
	@OneToOne
	@JoinColumn(name="did")
	private Doctor doctor;
	@OneToOne
	@JoinColumn(name="fkaid")
	private Appointment appointment;
	
	

	
	
}
