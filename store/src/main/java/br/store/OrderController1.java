package br.store;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.store.domain.entity.Order;
import br.store.domain.entity.User;
import br.store.domain.repository.OrderRepository;
import br.store.domain.repository.ProdutRepository;
import br.store.domain.repository.UserRepository;

public class OrderController1 {



	
	@Autowired UserRepository users; 
	@Autowired OrderRepository Order;
	public List<Order> listOrders(User user){
		List<Order> listaOrder = Order1.findAll();
		List<Order> listadeOrderUser = Order.findAll();
		listadeOrderUser.clear();
		for(int a1 = 0; listaOrder.size() > a1; a1++) {
			Order P = new Order();
			 P.setUserID(listaOrder.get(a1).getUserID());
			 P.setId(listaOrder.get(a1).getId());
			 System.out.println("Primeiro");

			 if((P.getUserID())==user.getId()) {
				
				 listadeOrderUser.add(P);
			 }else {
				
			 }
			 
		 }

		return listadeOrderUser;

	}
}
*/