package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/oi", loadOnStartup=1)
public class OiMundoServelt extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public OiMundoServelt() {
		System.out.println("Criando Oi Mundo Servlet");
	}
 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
			
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("O servlet OiMundoServlet foi chamado!");
		out.print("</body>");
		out.print("</html>");
		
		System.out.println("O servlet OiMundoServlet foi chamado");
	}
}
