package br.com.vitoria.courseSystem.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import br.com.vitoria.courseSystem.entities.Student;
import br.com.vitoria.courseSystem.entities.Team;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Embeddable
public class RegistrationPK implements Serializable{

	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="team_id")
	private Team team;
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(student, team);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistrationPK other = (RegistrationPK) obj;
		return Objects.equals(student, other.student) && Objects.equals(team, other.team);
	}

	
}
