package myaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new GenericXmlApplicationContext("Beans.xml");
		MessageBean bean=ctx.getBean("proxy",MessageBean.class);
		bean.sayHello();
	}

}