package com.covenant.springboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="bookc")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String isbn;
	
	@ManyToOne
	@JoinColumn(name="authorc_id")
	@JsonManagedReference
	private Author author;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Lend> lends;
}
