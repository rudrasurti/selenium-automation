package com.rudra;


import java.net.*;

public class rudra {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(9999);
			ss.accept();
			System.out.println("Server");
			
			ss.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}