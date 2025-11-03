package sec01.exam04;

public class Outter {
	public void method1(final int arg) {
		final int localVariable = 1;
		class inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
