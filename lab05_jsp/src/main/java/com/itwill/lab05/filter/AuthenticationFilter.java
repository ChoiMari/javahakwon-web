package com.itwill.lab05.filter;

import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
public class AuthenticationFilter extends HttpFilter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see Filter#destroy()
	 */
	
	
	public void destroy() {
		//필터 객체가 소멸 될때 WAS가 호출하는 메서드
		//할일 없다면 껍데기만 두어도 됨
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		//중요하다고
		// place your code here
		//인증이 필요한 요청 주소들(예: 새 글, 상세보기 등) 로그인이 안되어있으면 못보게 하려고 설정하는 것.
		//로그인이 되어야 보여지게 설정.
		//로그인 여부를 확인하고 로그인이 되어있으면 서블릿(컨트롤러)으로 요청을 전달해서 
		//계속 요청을 처리함.
		//로그인이 되어있지 않으면 컨트롤러로 요청을 전달하지 않고 로그인페이지로 이동한다.
		//로그인 성공하면 SignIn컨트롤러(UserSignInController)에서 로그인 성공 후 최초 요청 주소로 이동.
		//서블릿이 가지고 있는 리퀘스트와 필터가 가지고 있는 리퀘스트 차이점.
		//서블릿은 HttpServletRequest 타입, 필터는 ServletRequest 
		//타입이 다르니까 가지고 있는 메서드도 다르다..
		// ServletRequest 클래스가 부모(상위)클래스. HttpServletRequest가 자식. 자식이 더 메서드가 많다고..
		//서블릿 메서드가 다 안보일때는 캐스팅(강제변환) 다형성 하면 된다고...
		//WAS가 request넣어줌 다형성
		HttpServletRequest req = ((HttpServletRequest)request);
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		//WAS가 필터 객체를 생성한 후 호출되는 메서드
		//초기화 작업이 필요하면 여기서 하면 된다고..
	}

}
