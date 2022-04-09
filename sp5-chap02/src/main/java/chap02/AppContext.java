package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 해당 클래스를 스프링 설정 클래스로 지정한다.
public class AppContext {
	@Bean // 스프링이 생성하는 객체를 Bean 객체라고 한다.
	public Greeter greeter() { //Bean 객체의 이름 : greeter, type : Greeter
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g;
	}
}
