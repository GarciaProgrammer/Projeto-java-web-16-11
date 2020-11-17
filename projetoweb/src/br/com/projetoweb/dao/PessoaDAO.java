package br.com.projetoweb.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.projetoweb.beans.Pessoa;
import br.com.projetoweb.cnn.ConnectionFactory;

public class PessoaDAO {

	public static ArrayList<Pessoa> listaPessoas() {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "select * from pessoa";
		ArrayList<Pessoa> arPessoas = new ArrayList();

		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			ResultSet rsPessoas = pStm.executeQuery();

			while (rsPessoas.next()) {
				Pessoa pes = new Pessoa(rsPessoas.getLong("id"), rsPessoas.getString("nome"),
						rsPessoas.getString("dt_nascimento"), rsPessoas.getString("cpf"),
						rsPessoas.getString("sexo").charAt(0));
				arPessoas.add(pes);
			}
			cnn.close();
			rsPessoas.close();
			return arPessoas;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int cadastrarPessoa(Pessoa objPessoa) {
		
		return 1;
	}
}
