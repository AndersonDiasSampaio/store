package br.store.domain.entity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import br.store.domain.repository.OrderRepository;
import br.store.domain.repository.UserRepository;
@Entity
@Table(name ="order1")
public class Order {
	private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;

private Integer userID;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getUserID() {
	return userID;
}
public void setUserID(Integer userID) {
	
	this.userID = userID;
}
public Order(Integer id, Integer userID) {

	this.id = id;
	this.userID = userID;
}
public Order( Integer userID) {

		this.userID = userID;
}

public Order() {

	
}




}





