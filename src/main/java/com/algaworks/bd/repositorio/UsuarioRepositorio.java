package com.algaworks.bd.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.algaworks.bd.model.Usuario;

@Repository
public class UsuarioRepositorio {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Usuario> listar() {
		return jdbcTemplate.query("select * from usuario", 
				(rs, rowNum) -> new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
	}
	
	public Usuario buscar(Integer id) {
		return jdbcTemplate.queryForObject("select * from usuario where id = ?", new Object[]{ id }, 
				(rs, rowNum) -> new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
	}
}
