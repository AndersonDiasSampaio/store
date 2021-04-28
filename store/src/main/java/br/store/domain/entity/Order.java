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
@ManyToOne
@JoinColumn(name ="iduser")
private User user;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}




}
