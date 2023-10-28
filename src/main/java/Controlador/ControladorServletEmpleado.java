package Controlador;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClassCrudEmpleadoImp;
import model.TblEmpleado;

/**
 * Servlet implementation class ControladorServletEmpleado
 */
public class ControladorServletEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorServletEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String sexo = request.getParameter("sexo");
		String email = request.getParameter("email");
		String fecha = request.getParameter("fecha");
		String telefono = request.getParameter("telefono");
		String dni = request.getParameter("dni");
		
		TblEmpleado empleado = new TblEmpleado();
		ClassCrudEmpleadoImp crud = new ClassCrudEmpleadoImp();
		
		empleado.setNombre(nombre);
		empleado.setApellido(apellido);
		empleado.setSexo(sexo);
		empleado.setEmail(email);
		empleado.setTel(telefono);
		empleado.setDni(dni);
		//Convertir Fecha a SQL
		Date fec = new Date();
		Date fechasql = new Date(fec.getTime());
		//
		empleado.setFechanac(fechasql);

		crud.RegistrarEmpleado(empleado);
		
		List<TblEmpleado> listado = crud.ListadoEmpleado();
		
		request.setAttribute("listado", listado);
		//Redireccionamos
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
