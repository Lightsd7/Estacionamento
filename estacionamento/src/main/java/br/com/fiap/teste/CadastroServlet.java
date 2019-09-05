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

@WebServlet(urlPatterns ="cadastrar")

public class CadastroServlet extends HttpServlet{
	
	
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
		if(bo.validarNome(nome)== true){
			out.println("<html><body><p>Colocar no banco o nome, pois foi correto<p>");
		}else {
			out.println("<p>Não está válido, não colocar no banco</p>");
		}
		
		if(bo.validarSenha(senha) == true) {
			out.println("<html><body><p>Colocar no banco a senha também, pois foi correto<p>");
		}else {
			out.println("<p>Não está válido, não colocar no banco</p>");
		}
	}

}
