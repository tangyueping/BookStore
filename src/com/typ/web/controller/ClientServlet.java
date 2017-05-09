package com.typ.web.controller;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ClientServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("op");
		if ("showIndex".equals(op)) {
			showIndex(request, response);
		} else if ("showCategoryBooks".equals(op)) {
			showCategoryBooks(request, response);
		} else if ("showBookDetails".equals(op)) {
			showBookDetails(request, response);
		} else if ("buyBook".equals(op)) {
			buyBook(request, response);
		} else if ("changeNum".equals(op)) {
			changeNum(request, response);
		} else if ("delOneItem".equals(op)) {
			delOneItem(request, response);
		} else if ("registCustomer".equals(op)) {
			registCustomer(request, response);
		} else if ("active".equals(op)) {
			active(request, response);
		} else if ("login".equals(op)) {
			login(request, response);
		} else if ("logout".equals(op)) {
			logout(request, response);
		} else if ("genOrders".equals(op)) {
			genOrders(request, response);
		} else if ("showCustomerOrders".equals(op)) {
			showCustomerOrders(request, response);
		} else if ("pay".equals(op)) {
			pay(request, response);
		}
	}

	private void pay(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/sure.jsp").forward(request, response);
	}

	private void showCustomerOrders(HttpServletRequest request,
									HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/listOrders.jsp").forward(request,
				response);
	}

	private void genOrders(HttpServletRequest request,
						   HttpServletResponse response) throws ServletException, IOException {
		// request.getRequestDispatcher("/pay.jsp?orderNum="+orderNum+"&amount="+order.getAmount()).forward(request,
		// response);
	}

	private void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().removeAttribute("customer");
		response.sendRedirect(request.getContextPath());
	}

	private void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

	private void active(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

	private void registCustomer(HttpServletRequest request,
								HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

	private void delOneItem(HttpServletRequest request,
							HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/showCart.jsp");

	}

	private void changeNum(HttpServletRequest request,
						   HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/showCart.jsp");
	}

	private void buyBook(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

	private void showBookDetails(HttpServletRequest request,
								 HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/showDetails.jsp").forward(request,
				response);
	}

	private void showCategoryBooks(HttpServletRequest request,
								   HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/showDetails.jsp").forward(request,
				response);

	}

	private void showIndex(HttpServletRequest request,
						   HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/listAllBooks.jsp").forward(request,
				response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
