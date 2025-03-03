package com.iiht.store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Chocolate {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long batchId;
	private String name;
	private Long quantity;
	private double price;
	private String expiry;

}
