package com.projeto.p2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.p2.model.Categoria;
import com.projeto.p2.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Iterable<Produto> findByCategoria(Categoria categoria);
	Optional<Produto> findById(Long id);
	
}
