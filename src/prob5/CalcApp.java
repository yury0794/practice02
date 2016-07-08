package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		while (true) {
			System.out.println("계산식을 입력해주세요. (a + b)");
			Scanner scanner = new Scanner(System.in);
			
			System.out.print(">> ");
			String input = scanner.nextLine();
			
			if (input.equals("quit") == true) {
				break;
			}
			String[] tokens = input.split(" ");

			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);

			switch (tokens[1]) {
			case "+":
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(">> " + add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(">> " + sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(">> " + mul.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(">> " + div.calculate());
				break;
			}
		}
	}
}