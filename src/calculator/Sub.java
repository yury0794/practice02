package calculator;

public class Sub extends Arith {

	@Override
	public int calculate() {
		return getlValue() - getrValue();
	}
}