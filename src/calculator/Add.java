package calculator;

public class Add extends Arith {

	@Override
	public int calculate() {
		return getlValue() + getrValue();
	}
}