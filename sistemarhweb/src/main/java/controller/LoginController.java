package controller;

import model.UsuarioDAO;
import model.Usuario;

public class LoginController {
	private UsuarioDAO usuarioDAO;

    public LoginController() {
        usuarioDAO = new UsuarioDAO();
    }

    public boolean autenticarUsuario(String nome, String senha) {
    	Usuario usuario = new Usuario(nome, senha); 
    	
    	if (nome.equals("admin") && senha.equals("admin")) {
            
            return true;
        } else {
            return usuarioDAO.autenticarUsuario(usuario);
        }
}}
