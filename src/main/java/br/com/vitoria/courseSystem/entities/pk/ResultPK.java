package br.com.vitoria.courseSystem.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import br.com.vitoria.courseSystem.entities.Student;
import br.com.vitoria.courseSystem.entities.Test;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ResultPK implements Serializable{

	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="student_pk_id")
	private Student student;
	@ManyToOne
	@JoinColumn(name="test_pk_id")
	private Test test;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(student, test);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultPK other = (ResultPK) obj;
		return Objects.equals(student, other.student) && Objects.equals(test, other.test);
	}

	
	
	
	

}
