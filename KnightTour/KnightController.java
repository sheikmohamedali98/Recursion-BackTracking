package KnightTour;

/*
 * output *
 * 
 * 0 9 22 13 2 5 18 15 
23 12 1 8 17 14 3 6 
10 55 24 21 4 7 16 19 
29 32 11 56 25 20 47 42 
54 57 28 31 46 41 26 39 
33 30 51 60 27 38 43 48 
58 53 62 35 50 45 40 37 
63 34 59 52 61 36 49 44 

 * @author Windows
 *
 */
public class KnightController {
	static int[] rowPath = { -1, -1, -2, -2, 1, 1, 2, 2 };
	static int[] ColPath = { 2, -2, 1, -1, 2, -2, -1, 1 };
	static KnightTour knightTour = new KnightTour();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int N = 8;
		int[][] matrix = new int[N][N];
		for(int i =0;i<N;i++) {
			for(int j =0;j<N;j++) {
				 matrix[i][j] = -1;
			}
		}
		
		matrix[0][0] = 0;
		
		if(!(knightTour.knightTour(N, 0, 0, 1, matrix, rowPath, ColPath))) {
			System.out.println("solution not Excits");
		}else {
			knightTour.printSolution(matrix);
		}
	}

}
