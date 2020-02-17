package singletonpattern;

public class RandomService {

	private static RandomService rs;

	private RandomService() {

	}

	public static RandomService getInstance() {
		if (rs == null) {
			rs = new RandomService();
		}
		return rs;
	}

	public void printMe() {
		System.out.println("Meeeeeeee");
	}

}
