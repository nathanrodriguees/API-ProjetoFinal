package br.edu.senaisp.API.dto;

import br.edu.senaisp.API.model.Usuario;

public class ToDTO {

	public class UsuarioConverter {
		public static UsuarioDTO toDTO(Usuario usuario) {
			return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail());
		}
	}

}
