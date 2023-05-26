package br.com.vitoria.courseSystem.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_class")
public class Class implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer number;
	@Column(name="start_date")
	private Date startDate;
	@Column(name="number_Vacancies")
	private Integer numberVacancies;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
	
	public Class() {
		
	}

	public Class( Integer number, Date startDate, Integer numberVacancies) {
		
		this.number = number;
		this.startDate = startDate;
		this.numberVacancies = numberVacancies;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getNumberVacancies() {
		return numberVacancies;
	}

	public void setNumberVacancies(Integer numberVacancies) {
		this.numberVacancies = numberVacancies;
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
		Class other = (Class) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
