package com.typ.web.controller;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ControlServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("op");
		if("addCategory".equals(op)){
			addCategory(request,response);
		}else if("showAllCategories".equals(op)){
			showAllCategories(request,response);
		}else if("showAddBookUI".equals(op)){
			showAddBookUI(request,response);
		}else if("addBook".equals(op)){
			try {
				addBook(request,response);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}else if("showAllBooks".equals(op)){
			showAllBooks(request,response);
		}
	}
	//分页显示所有书籍
	private void showAllBooks(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		String num = request.getParameter("num");
		request.getRequestDispatcher("/manage/listBooks.jsp").forward(request, response);
	}
	//添加一本图书
	private void addBook(HttpServletRequest request,
			HttpServletResponse response)throws Exception {
			request.getRequestDispatcher("/manage/addBook.jsp").forward(request, response);
		}
	//显示添加书籍的界面
	private void showAddBookUI(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("/manage/addBook.jsp").forward(request, response);
	}
	//查询所有分类
	private void showAllCategories(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("/manage/listCategory.jsp").forward(request, response);
	}
	//添加一个分类
	private void addCategory(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException  {
		request.getRequestDispatcher("/manage/addCategory.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
