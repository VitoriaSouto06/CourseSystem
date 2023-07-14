package br.com.vitoria.courseSystem.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_course")
public class Course implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer workload;
	private Double price;
	@Column(name="minimun_grade")
	private Double minimumGrade;
	
	@JsonIgnore
	@OneToMany(mappedBy="course")
	private Set<Team> teams = new HashSet<>();
	
	public Course() {
		
	}

	public Course(String name, Integer workload, Double price, Double minimumGrade) {
	
		this.name = name;
		this.workload = workload;
		this.price = price;
		this.minimumGrade = minimumGrade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWorkload() {
		return workload;
	}

	public void setWorkload(Integer workload) {
		this.workload = workload;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getMinimumGrade() {
		return minimumGrade;
	}

	public void setMinimumGrade(Double minimumGrade) {
		this.minimumGrade = minimumGrade;
	}

	
	public Set<Team> getTeams() {
		return teams;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}