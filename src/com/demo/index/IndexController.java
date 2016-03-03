package com.demo.index;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.*;;

/**
 * IndexController
 */

public class IndexController extends Controller {
	@Before(NoUrlPara.class)
	public void index() {
		render("index.html");
	}
	
	public void test(){
		render("test.html");		
	}
}





