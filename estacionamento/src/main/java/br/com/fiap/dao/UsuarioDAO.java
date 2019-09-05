package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.Conexao;

public class UsuarioDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;

	public UsuarioDAO() throws Exception {
		con = Conexao.queroConectar();
	}

	public Usuario getUser(int codigo) throws Exception {
		stmt = con.prepareStatement("select * from USUARIO where ID_USUARIO=?");
		stmt.setInt(1, codigo);
		rs = stmt.executeQuery();
		if (rs.next()) {
			return new Usuario(rs.getInt("ID_USUARIO"), rs.getString("NOME"), rs.getString("EMAIL"), rs.getString("SENHA"));
		} else {
			return new Usuario();
		}
	}

	public int killUser(int cod) throws Exception {
		stmt = con.prepareStatement("delete from USUARIO where ID_USUARIO=?");
		stmt.setInt(1, cod);
		return stmt.executeUpdate();
	}

	public int addUser(Usuario u) throws Exception{
		stmt = con.prepareStatement("INSERT INTO USUARIO (ID_USUARIO, NOME, EMAIL, SENHA) VALUES (?,?,?,?)");
		stmt.setInt(1, u.getIDusuario());
		stmt.setString(2, u.getNome());
		stmt.setString(3, u.getEmail());
		stmt.setString(4, u.getSenha());
		return stmt.executeUpdate();
	}

	public void encerrar() throws Exception {
		con.close();
	}
}
