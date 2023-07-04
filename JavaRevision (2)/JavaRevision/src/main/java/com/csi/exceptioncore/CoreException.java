package com.csi.exceptioncore;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

class Depat {

	void get() throws SQLException {

	}
}

class Emp extends Depat {
	@Override
	void get() throws ArithmeticException {
		// TODO Auto-generated method stub

	}
}

public class CoreException {

	public static void main(String[] args) {

		try {
			String name = null;
			int res = 10 / 0;
			System.out.println(name.length());

		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("FINTECH CSI PUNE");
		}
		try {
		} finally {

			System.out.println("Always Exceute");
		}

	}

}
