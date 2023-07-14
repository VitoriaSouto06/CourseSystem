package br.com.vitoria.courseSystem.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_team")
public class Team implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer number;
	private Instant date;
	@Column(name="number_of_vacancies")
	private Integer numberOfVacancies;
	
	
	@ManyToMany
	@JoinTable(name="tb_team_student",
	joinColumns = @JoinColumn(name="team_id"),
	inverseJoinColumns = @JoinColumn(name="student_id"))
	private Set<Student> students = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="courses_id")
	private Course course;
	
	public Team(Integer number, Instant date, Integer numberOfVacancies) {
		
		this.number = number;
		this.date = date;
		this.numberOfVacancies = numberOfVacancies;
	}
	public Team() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Instant getDate() {
		return date;
	}
	public void setDate(Instant date) {
		this.date = date;
	}
	public Integer getNumberOfVacancies() {
		return numberOfVacancies;
	}
	public void setNumberOfVacancies(Integer numberOfVacancies) {
		this.numberOfVacancies = numberOfVacancies;
	}
	

	
	public Set<Student> getStudents() {
		return students;
	}
	
	public Course getCourse() {
		return course;
	}
	
	
	public void setCourse(Course course) {
		this.course = course;
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
		Team other = (Team) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
