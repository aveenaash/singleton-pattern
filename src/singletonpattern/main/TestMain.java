package singletonpattern.main;

import singletonpattern.RandomService;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomService r1 = RandomService.getInstance();
		
		RandomService r2 = RandomService.getInstance();

	}

}
