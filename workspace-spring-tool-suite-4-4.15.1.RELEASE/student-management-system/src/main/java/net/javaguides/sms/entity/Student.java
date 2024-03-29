package net.javaguides.sms.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name")
	private String lasttName;
	@Column(name="email")
	private String email;
public Student() {}
public Student(String firstName, String lasttName, String email) {
	super();
	this.firstName = firstName;
	this.lasttName = lasttName;
	this.email = email;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLasttName() {
	return lasttName;
}
public void setLasttName(String lasttName) {
	this.lasttName = lasttName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
