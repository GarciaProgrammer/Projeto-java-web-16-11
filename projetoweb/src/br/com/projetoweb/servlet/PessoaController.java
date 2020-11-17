package br.com.projetoweb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetoweb.beans.Pessoa;
import br.com.projetoweb.model.PessoaModel;

/**
 * Servlet implementation class PessoaController
 */
@WebServlet("/pessoa")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PessoaModel pessoaModel = new PessoaModel();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch (request.getParameter("action")) {
		case "listPessoas":
			listaPessoasAction(request, response);
			break;
		case "cadPessoa":
			cadPessoaAction(request, response);
			break;

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void listaPessoasAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Buscar dados do banco
		List<Pessoa> objListaPessoa = new ArrayList<Pessoa>();
		objListaPessoa = pessoaModel.listaPessoas();
		
		request.setAttribute("listaPessoas", objListaPessoa);
		RequestDispatcher rd = request.getRequestDispatcher("listaPessoasAction.jsp");
        rd.forward(request, response);
	}
	
	protected void cadPessoaAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Buscar dados do banco
		
		RequestDispatcher rd = request.getRequestDispatcher("cadPessoaAction.jsp");
        rd.forward(request, response);
	}

}
