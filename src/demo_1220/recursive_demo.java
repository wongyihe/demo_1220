package demo_1220;

public class recursive_demo {

	int[][] A = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0 },
			{ 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
			{ 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	void show() {
		int i, j;
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[0].length; j++)
				System.out.print(A[i][j]);
			System.out.println();
		}

	}

	void fill(int i, int j) {

		if (A[i][j] == 0 && j >= 0 && i >= 0 && j < A[0].length && i < A.length) {
			A[i][j] = 2;
			//if (j - 1 >= 0)
				fill(i, j - 1);
			//if (i - 1 >= 0)
				fill(i - 1, j);
			//if (j + 1 < A[0].length)
				fill(i, j + 1);
			//if (i + 1 < A.length)
				fill(i + 1, j);
		}

	}

	public static void main(String[] args) {
		recursive_demo d = new recursive_demo();
		// for (int i = 0; i < 11; i++)
		// System.out.println(i + ":" + d.Fibo(i));
		// d.move(5, 'A', 'B', 'C');
		d.show();
		d.fill(1, 1);
		System.out.println("-----------");
		d.show();

	}

	int Fibo(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return Fibo(n - 1) + Fibo(n - 2);
		}
	}

	void move(int n, char A, char B, char C) {
		if (n == 0)
			return;
		else {
			move(n - 1, A, C, B);
			System.out.println(A + "->" + C);
			move(n - 1, B, A, C);
		}
	}
}
