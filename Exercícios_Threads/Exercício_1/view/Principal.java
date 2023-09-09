package view;

import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {
		for (int threadId = 0; threadId < 5; threadId++) {
			
			Thread thread = new ThreadId(threadId);
			int i = (int) thread.getId();
			System.out.println("Thread: "+threadId+" Id: "+i);
		}
	}

}
