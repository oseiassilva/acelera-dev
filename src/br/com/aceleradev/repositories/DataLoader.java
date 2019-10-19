package br.com.aceleradev.repositories;

import br.com.aceleradev.domain.Usuario;

public class DataLoader {
	private UsuarioRepository ur = new UsuarioRepository();
	
	public void insereUsuario(Usuario usuario) {
		ur.insere(usuario);
	}
	
	//desenvolver a parte de inserção da Disciplina, criar uma classe DisciplinaRepository
}
