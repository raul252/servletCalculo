package com.raul.calculo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.raul.calculo.business.*;

/**
 * Servlet implementation class servletMates
 */
@WebServlet("/servletMates")
public class servletMates extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servletMates() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@EJB
	private Cilinder cili;
	@EJB
	private Cubo cu;
	@EJB
	private Cono cono;
	@EJB
	private Esfera esfera;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer tipo = Integer.valueOf(request.getParameter("tipo"));
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.append("<html>");
		writer.append("<title>Calculadora de área");
		writer.append("</title>");
		writer.append("<body>");
		PrintWriter out = response.getWriter();
		Integer r = 0;
		Integer h = 0;
		Integer a = 0;
		switch (tipo) {
		case 1:
			try {
				r = Integer.valueOf(request.getParameter("r"));
				h = Integer.valueOf(request.getParameter("h"));
			} catch (Exception e)
			{
				out.println("¡Uno de los datos introducidos no son numéricos!<br>");
			}
			cili.setRadio(r);
			cili.setAltura(h);
			cili.computeArea();
			cili.computeVolume();
			out.println("Es área del Cilindro es "+ cili.computeArea() + "<br>");
			out.println("El volumen del Cilindro es  "+ cili.computeVolume() + "<br>");
			out.println("La descripción del Cilindro es  "+ cili.description() + "<br>");
			break;
		case 2:
			try {
				a = Integer.valueOf(request.getParameter("c"));
			} catch (Exception e)
			{
				out.println("¡Uno de los datos introducidos no es numéricos!<br>");
			}
			cu.setA(a);
			cu.computeArea();
			cu.computeVolume();
			out.println("Es área del Cubo es "+ cu.computeArea() + "<br>");
			out.println("El volumen del Cubo es  "+ cu.computeVolume() + "<br>");
			out.println("La descripción del Cubo es  "+ cu.description() + "<br>");
			break;
		case 3:
			try {
				r = Integer.valueOf(request.getParameter("r"));
				h = Integer.valueOf(request.getParameter("h"));
			} catch (Exception e)
			{
				out.println("¡Uno de los datos introducidos no son numéricos!<br>");
			}
			cono.setRadio(r);
			cono.setAltura(h);
			cono.computeArea();
			cono.computeVolume();
			out.println("Es área del Cono es "+ cono.computeArea() + "<br>");
			out.println("El volumen del Cono es  "+ cono.computeVolume() + "<br>");
			out.println("La descripción del Cono es  "+ cono.description() + "<br>");
			break;
		case 4:
			try {
				r = Integer.valueOf(request.getParameter("r"));
			} catch (Exception e)
			{
				out.println("¡Uno de los datos introducidos no es numéricos!<br>");
			}
			esfera.setRadio(r);
			esfera.computeArea();
			esfera.computeVolume();
			out.println("Es área de la esfera es "+ esfera.computeArea() + "<br>");
			out.println("El volumen de la esfera es  "+ esfera.computeVolume() + "<br>");
			out.println("La descripción de la esfera es  "+ esfera.description() + "<br>");
			break;
		default:
			break;
		}
		writer.append("<a href='../'>Volver al menú</a>");
		writer.append("</body>");
		writer.append("</html>");	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
