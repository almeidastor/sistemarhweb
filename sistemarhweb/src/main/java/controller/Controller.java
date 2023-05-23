package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;


@WebServlet(urlPatterns = {"/Controller","/main", "/insert"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans funcionario = new JavaBeans();


    public Controller() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		System.out.println(action);
		if(action.equals("/main")) {
			funcionario(request,response);
		}else if (action.equals("/insert")) {
			novoFuncionario(request,response);
		} else {
			response.sendRedirect("index.html");
		}
	}
	
	protected void funcionario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("portalfuncionario.jsp");
	}
	
	protected void novoFuncionario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		funcionario.setNome(request.getParameter("nome"));
		funcionario.setCpf(request.getParameter("cpf"));
		funcionario.setTelefone1(request.getParameter("telefone1"));
		
		dao.inserirFuncionario(funcionario);
		response.sendRedirect("main");
	}
	
}
