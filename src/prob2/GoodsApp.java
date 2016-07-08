package prob2;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int COUNT_GOODS = 3;

		Goods[] arrayGoods = new Goods[COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {
			String info = scanner.nextLine();
			String[] infos = info.split(" ");

			Goods goods = new Goods();
			goods.setName(infos[0]);
			goods.setPrice(Integer.parseInt(infos[1]));
			goods.setNum(Integer.parseInt(infos[2]));

			arrayGoods[i] = goods;
		}

		System.out.println();

		for (int i = 0; i < COUNT_GOODS; i++) {
			System.out.println(arrayGoods[i].toString());
		}
	}
}