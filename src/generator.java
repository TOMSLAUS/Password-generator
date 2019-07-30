import java.util.Random;
import java.util.Scanner;

public class generator {

	static StringBuilder generate() {

		Scanner sc = new Scanner(System.in);
		int len;
		len = sc.nextInt() - 1;
		StringBuilder password = new StringBuilder();
		for (int i = 0; i <= len; i++) {
			Random rnd = new Random();
			double rand = Math.random();
			if (rand > .66) {
				password.append((int) (Math.random() * 8 + 1));
			} else if (rand > .33) {
				password.append((char) (rnd.nextInt(26) + 'a'));
			} else {
				password.append((char) Character.toUpperCase((rnd.nextInt(26) + 'a')));
			}
		}
sc.close();
		return password;

	}

	public static void main(String[] args) {
		System.out.println("Pick your password lenght!");

		
		System.out.println(generate());
	}
}
