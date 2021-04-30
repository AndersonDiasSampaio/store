package br.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import br.store.domain.repository.*;
import br.store.domain.entity.*;

@SpringBootApplication
@RestController
public class StoreApplication {

	@Bean
	public CommandLineRunner innit(@Autowired UserRepository users, @Autowired ProdutRepository Product, @Autowired OrderRepository Order
			) {
		return args -> {
			 User user= new User("andersonaaaa5454212", "teste123aaa121");
			 users.save(user);
			 Produt produto = new Produt("teste",(float) 100.2,1);
			 Product.save(produto);
			 List<Produt> ListaProdutos= Product.findAll();
			 for(int a = 0; ListaProdutos.size() > a; a++) {
				 Produt p= new Produt();
				 p=ListaProdutos.get(a);
				 if((p.getId())==1) {
					 System.out.println("lindo");
				 }else {
					 System.out.println("Feio");

				 }
		Order order1 = new Order() ;
			order1.setUserID(2);
			Order.save(order1);
			user.setId(2);
			//OrderController1 controller1= new OrderController1();
		//	controller1.listOrders(user);
			// lógica que ficará no busca pedidos por cliente
			List<Order> listaOrder = Order.findAll();
			List<Order> listadeOrderUser = Order.findAll();
			listadeOrderUser.clear();
			for(int a1 = 0; listaOrder.size() > a1; a1++) {
				Order P = new Order();
				 P.setUserID(listaOrder.get(a1).getUserID());
				 P.setId(listaOrder.get(a1).getId());
				 System.out.println("Primeiro");

				 if((P.getUserID())==user.getId()) {
					 System.out.println("segundo");
					
					 listadeOrderUser.add(P);
				 }else {
					
					 System.out.println("terceiro");
				 }
				 
			 }
			 }
			//User user1 = new User(null, "yy", "yyyaaas1"); // mudar no banco a senha está como uniqui
			//List<User> todosClientes = users.seachall();
			// users.salvar(user1);

			// user1.setId(23);
			// user1.setUserName("testando2asa");
			// user1.setUserPassword("332132sasaaas1212"); // sempre lembrar a senha é
			// uniqui se tiver igual jogará execpcion
			// users.update(user1);


		};
		}
	

	@Value("${application.name}")
	private String applicationName;

	@GetMapping("/hello")
	public String helloword() {
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

}