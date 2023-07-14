package br.com.vitoria.courseSystem.entities;

import java.time.Instant;
import java.util.Objects;

import br.com.vitoria.courseSystem.entities.pk.RegistrationPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_registration")
public class Registration {
	@EmbeddedId
	private RegistrationPK id = new RegistrationPK();
	private Instant dateRegistration;
	private Integer installments;
	public Registration() {
		super();
	}
	public Registration(Team team,Student student,Instant dateRegistration, Integer installments) {
		id.setTeam(team);
		id.setStudent(student);
		this.dateRegistration = dateRegistration;
		this.installments = installments;
	}
	
	public Team getTeam() {
		return id.getTeam();
	}
	public Student getStudent() {
		return id.getStudent();
	}

	public void setTeam(Team team) {
		id.setTeam(team);
		
	}
	public void setStudent(Student student) {
		id.setStudent(student);
		
	}
	public Instant getDateRegistration() {
		return dateRegistration;
	}
	public void setDateRegistration(Instant dateRegistration) {
		this.dateRegistration = dateRegistration;
	}
	public Integer getInstallments() {
		return installments;
	}
	public void setInstallments(Integer installments) {
		this.installments = installments;
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
		Registration other = (Registration) obj;
		return Objects.equals(id, other.id);
	}

	

}

