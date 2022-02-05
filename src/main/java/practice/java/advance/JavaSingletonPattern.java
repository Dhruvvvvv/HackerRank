package practice.java.advance;

public class JavaSingletonPattern {

	public String str;

	private JavaSingletonPattern() {

	}

	public static JavaSingletonPattern getSingleInstance() {
		return new JavaSingletonPattern();
	}

}
