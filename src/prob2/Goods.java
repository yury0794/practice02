package prob2;

public class Goods {
	private String name;
	private int price;
	private int num;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return name+"(가격:"+price+")이 "+num+"개 입고 되었습니다.";
	}
}