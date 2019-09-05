package br.com.fiap.teste;

import java.util.Random;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

public class TesteGravarUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuarioDAO dao = null;

		try {
			dao = new UsuarioDAO();

			if (dao.addUser(new Usuario(new Random().nextInt(999),
					JOptionPane.showInputDialog("Digite seu nome: "),
					JOptionPane.showInputDialog("Digite seu e-mail: "),
					JOptionPane.showInputDialog("Digite sua senha: "))) == 0) {
				System.out.println("Não cadastrado!");
			} else {
				System.out.println("Cadastrado com sucesso!");
			}

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
