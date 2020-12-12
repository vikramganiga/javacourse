package com.event.geru.hackerank;

import java.util.Scanner;

public class Java1DArray {

	public static boolean CanWinHelper(int leap, int[] game, boolean[] visited, int index) {
		int len = game.length;

		if (index >= len - 1 || (index + leap) >= game.length) {
			return true;
		}

		if (visited[index] == true) {
			return false;
		}

		visited[index] = true;

		if (game[index + 1] == 0 && !visited[index + 1] && CanWinHelper(leap, game, visited, index + 1)) {
			return true;
		}

		if (game[index + leap] == 0 && !visited[index + leap] && CanWinHelper(leap, game, visited, index + leap)) {
			return true;
		}

		if (index > 0 && game[index - 1] == 0 && !visited[index - 1] && CanWinHelper(leap, game, visited, index - 1)) {
			return true;
		}
		return false;
	}

	public static boolean canWin(int leap, int[] game) {
		// Return true if you can win the game; otherwise, return false.

		if (game == null || game.length == 0) {
			return true;
		}

		if (game.length == 1) {
			return false;
		}

		int len = game.length;
		boolean[] visited = new boolean[len];

		return CanWinHelper(leap, game, visited, 0);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}
