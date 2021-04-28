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
	public CommandLineRunner innit(@Autowired UserRepository users, @Autowired ProdutRepository Product
			) {
		return args -> {
			 User user= new User("andersonaaaa5454", "teste123aaa");
			 users.save(user);
			 Produt produto = new Produt("teste",(float) 1.2,1);
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
				 
			 }
			//User user1 = new User(null, "yy", "yyyaaas1"); // mudar no banco a senha está como uniqui
			//List<User> todosClientes = users.seachall();
			// users.salvar(user1);

			// user1.setId(23);
			// user1.setUserName("testando2asa");
			// user1.setUserPassword("332132sasaaas1212"); // sempre lembrar a senha é
			// uniqui se tiver igual jogará execpcion
			// users.update(user1);

		/*	todosClientes.forEach(System.out::println);

			System.out.println("Buscando clientes");
			List<User> todosClientes2 = users.seachByName("%And%");
			todosClientes2.forEach(System.out::println);

			System.out.println(todosClientes2.size());
			System.out.println(todosClientes2.get(1));

			for (int a = 0; todosClientes2.size() > a; a++) {
				User user3 = new User();
				user3 = todosClientes2.get(a);
				System.out.println(user3.getUserPassword());

			}

*/
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