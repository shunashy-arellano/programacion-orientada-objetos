package tablaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimerServlet
 */
@WebServlet("/PrimerServlet") //REGISTRA EL SERVLET PARA TODAS LAS PETICIONES AL SERVIDOR
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//ESPECIFICAMOS FORMATO DE RESPUESTA
		
		PrintWriter salida=response.getWriter();
		
		//GENERAR RESPUESTA DE LA PETICION
		
		salida.println("<html><body>");
		salida.println("<h1 style='text-align:center'>Tablas de multiplicar</h1>");
		salida.println("<br>");
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				salida.println(i + "*" + j + "=" + (i*j) + "<br>");
			}
			salida.println("<br>");
		}
		salida.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
