package br.store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.store.domain.entity.Category;
import br.store.domain.entity.User;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
