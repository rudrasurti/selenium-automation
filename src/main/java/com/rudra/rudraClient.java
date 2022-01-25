package com.rudra;

import java.net.*;

public class rudraClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.01", 9999);
			System.out.println("Client");
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}