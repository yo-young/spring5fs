package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppContext.class); // AppContext의 설정 정보를 이용하여 Bean 객체를 생성한다.
		Greeter g = ctx.getBean("greeter", Greeter.class); // Bean 객체를 제공한다.
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}
}
