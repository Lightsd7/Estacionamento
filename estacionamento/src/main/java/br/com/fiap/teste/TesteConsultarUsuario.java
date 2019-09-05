package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

public class TesteConsultarUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuarioDAO dao = null;
		try {
			dao = new UsuarioDAO();
			Usuario u = dao.getUser(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu código: ")));
			System.out.println("Nome: " + u.getNome());
			System.out.println("Senha: " + u.getSenha());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dao.encerrar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
