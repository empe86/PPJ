package ppj.git;

public class zadanie_dom_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[][] tab = new int[n][];
		for (int i = 0; i < n; i++) {
			tab[i] = new int[i + 1];
		}
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = j;
				System.out.print(j + ", ");
			}
			System.out.println("");
		}

	}
}
