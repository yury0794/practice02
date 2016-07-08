package prob1;

public class ArrayParameter {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		printCharArray(c); // 원래 배열 원소 출력
		System.out.println();
		replaceSpace(c); // 공백 문자 바꾸기
		System.out.println();
		printCharArray(c); // 수정된 배열 원소 출력
	}

	static void replaceSpace( char a[] ) {
		for(int i=0;i<a.length;i++){
			if(a[i] == ' '){
				a[i] = ',';
			}
			System.out.print(a[i]);
		}
	}

	static void printCharArray( char a[] ) {
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}
}
