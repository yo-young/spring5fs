package chap02;

public class Greeter {
	private String format;
	
	public String greet(String guest) {
		// String의 문자열 format을 이용하여 새로운 문자열을 생성/반환한다.
		return String.format(format, guest);
	}
	
	public void setFormat(String format) {
		//greet method에서 사용할 문자열 format은 이 method를 이용해서 설정한다.
		this.format = format;
	}
}
