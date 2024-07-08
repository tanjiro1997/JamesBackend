package com.james.calculator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstNum = request.getParameter("first-num");
		String operator = request.getParameter("operator");
		String secondNum = request.getParameter("second-num");
		int i = Integer.parseInt(firstNum);
		int j = Integer.parseInt(secondNum);
		int result = 0;
		switch(operator) {
			case "+" : result = i + j; break;
			case "-" : result = i - j; break;
			case "*" : result = i * j; break;
			case "/" : result = i / j; break;
			case "%" : result = i % j; break;
		}
	request.setAttribute("firstNum", firstNum);
	request.setAttribute("operator", operator);
	request.setAttribute("secondNum", secondNum);
	request.setAttribute("result", result); // Object는 모든 클래스의 조상클래스기때문에 업캐스팅에 의해 어떤 타입의 변수든 사용가능하다.
	request.getRequestDispatcher("/calculator/resultCalc.jsp").forward(request, response);
	}


}
