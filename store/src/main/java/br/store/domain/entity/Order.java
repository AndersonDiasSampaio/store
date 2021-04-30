package br.store.domain.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name ="order")
public class Order {
	
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
public void setUserID(User userID) {
	
	this.userID = userID.getId();
}
public Order(Integer id, Integer userID) {
	this.id = id;
	this.userID = userID;
}

public Order() {

}



}
