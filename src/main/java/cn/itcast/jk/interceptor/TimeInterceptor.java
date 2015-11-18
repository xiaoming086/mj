package cn.itcast.jk.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import common.Logger;
//功能：实现对所有类方法执行时间的监控
public class TimeInterceptor implements HandlerInterceptor {
	//引入log4j日志
	private static Logger log = Logger.getLogger(TimeInterceptor.class);
	
	//利用ThreadLocal绑定一个变量，完成线程安全
	NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("startTimeThreadLocal");
	
	//处理类之前，执行preHandler方法
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		long startTime = System.currentTimeMillis();
		startTimeThreadLocal.set(startTime);  //绑定变量
		
		return true;
	}
	
	//处理类之后，执行postHandler方法
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
		long stopTime = System.currentTimeMillis();
		log.info(String.format("%s execute %d ms."
				,request.getRequestURL()
				,stopTime-startTimeThreadLocal.get()));
	}

	//所有的动作完成，执行一些方法
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception exception)
			throws Exception {
		
	}
}
