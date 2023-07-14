package br.com.vitoria.courseSystem.entities;

import java.util.Objects;

import br.com.vitoria.courseSystem.entities.pk.ResultPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_result")
public class Result {
	@EmbeddedId
	private ResultPK id = new ResultPK();
	private Double grade;
	
	public Student getStudent() {
		return id.getStudent();
	}

	public void setStudent(Student student) {
		id.setStudent(student);
	}
	
	public Test getTest() {
		return id.getTest();
	}

	public void setTest(Test test) {
		id.setTest(test);
	}
	

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	public Double grade() {
		return this.getGrade();
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
		Result other = (Result) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
