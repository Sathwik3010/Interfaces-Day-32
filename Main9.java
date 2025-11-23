package com.codegnan.interfaces;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		Drawable sketch = new Sketch();
		
		for(int i=0;i<n;i++) {
			String line = sc.nextLine();
			String[] parts = line.split(" ");
			String command = parts[0];
			String shape = parts[1];

			if(command.equalsIgnoreCase("draw")) {
				sketch.draw(shape);
			} else if(command.equalsIgnoreCase("erase")) {
				sketch.erase(shape);
			}
		}
		sc.close();
	}

}
