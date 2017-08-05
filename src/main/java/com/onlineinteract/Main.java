package com.onlineinteract;

import java.io.File;

import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListener;

public class Main {
	public static void main(String[] args) {
		System.out.println("Simple test to see if we can tail from a file");

		File file = new File("c:\\tmp\\log.txt");
		
		TailerListener listener = new MyTailerListener();
		Tailer tailer = new Tailer(file, listener, 50L);
		Thread thread = new Thread(tailer);
		// thread.setDaemon(true); // optional
		thread.start();
	}
}