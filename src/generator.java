import java.util.Random;

public class Generator {

	static StringBuilder generate(int len) {

		StringBuilder password = new StringBuilder();
		for (int i = 0; i < len; i++) {
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
		return password;

	}
}
