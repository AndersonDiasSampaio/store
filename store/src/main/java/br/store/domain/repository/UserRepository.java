package br.store.domain.repository;

import br.store.domain.entity.User;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/*
@Repository
public class Users {

	@Autowired
	private EntityManager entityManager;

	private String nome;

	@Transactional
	public User salvar(User user) {

		entityManager.persist(user);
		// String insert= "insert into user set
		// userName='"+user.getUserName()+"',userPassword='"+user.getUserPassword()+"')";
		// String insert = "insert into user values('"+user.getId()+"',
		// '"+user.getUserName()+"','"+user.getUserPassword()+"')";
		// jdbcTemplate.update(insert);
		return user;
	}

	@Transactional
	public User update(User user) {
		entityManager.merge(user);
		return user;
	}

	@Transactional
	public List<User> seachall() {

		return entityManager.createQuery("from User", User.class).getResultList();

	}
	@Transactional
	public List<User> seachByName(String nome) {

		String jpql = "select c from User c where c.userName like :nome";
		TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
		query.setParameter("nome", "%" + nome + "%");
		return query.getResultList();

	}
	@Transactional
	public void deletar (Integer id) {
		
		User user=entityManager.find( User.class, id );
		deletar(user);
	}
	@Transactional
	private void deletar(User user) {
		 if(!entityManager.contains(user)){
	            user = entityManager.merge(user);
	        }
	        entityManager.remove(user);
		
	}

}
*/

public interface UserRepository extends JpaRepository<User, Integer > {
	/*
    @Query(value = " select * from User c where c.userName like '%:nome%' ", nativeQuery = true)
    List<User> encontrarPorNome( @Param("userName") String nome );

    @Query(" delete from User c where c.userName =:nome ")
    @Modifying
    void deleteByNome(String nome);

    boolean existsByNome(String nome);

    @Query(" select c from User c left join fetch c.pedidos where c.id = :id  ")
    User findClienteFetchPedidos( @Param("id") Integer id );*/


}
