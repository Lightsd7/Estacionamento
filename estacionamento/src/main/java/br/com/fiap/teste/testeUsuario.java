package br.com.fiap.teste;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.CadastroBO;
@WebServlet(urlPatterns ="/cadastrar")

public class testeUsuario extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String senha = req.getParameter("senha");
		String email = req.getParameter("email");
		PrintWriter out = resp.getWriter();
		
		Usuario u = new Usuario();
		u.setNome(nome);
		u.setSenha(senha);
		u.setEmail(email);
		
		CadastroBO bo = new CadastroBO();
		if(bo.validarNome(nome)== true && bo.validarSenha(senha) == true){
			//adciona usuario e senha ao banco
		}else {
			out.println("<p>Não está válido, não colocar no banco</p>");
			//encaminha usuario à uma página de aviso que algo não está certo, e para refazer o cadastro
		}
	}
	}

