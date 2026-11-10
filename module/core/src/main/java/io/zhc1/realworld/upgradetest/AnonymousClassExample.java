package io.zhc1.realworld.upgradetest;

public class AnonymousClassExample {

	public static Runnable createTask() {
		return new Runnable() {
			@Override
			public void run() {
				System.out.println("Running task");
			}
		};
	}

}
