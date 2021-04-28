package br.store.domain.entity;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name ="user")
public class User {
private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="iduser")
private Integer id;
@Column(name="userName")
public String userName;
@Column(name="userPassword")
private String userPassword;

public User(String userName, String userPassword) {
	
	this.userName = userName;
	this.userPassword = userPassword;
}
public User() {
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public String toString() {
	  return"ID - "+this.id   + ", Nome - "+this.userName+", Senha - "+this.userPassword;
	}
}
