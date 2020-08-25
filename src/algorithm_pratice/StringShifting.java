package algorithm_pratice;

public class StringShifting {

	public static void main(String[] args) {
		char[] string = new char[] { 'D', 'E', 'E', 'P' };
		char[] stringShift = new char[4];

		shiftByK(string, stringShift, 4, 4);
	}

	public static void shiftByK(char[] c, char[] shiftString, int numberOfShift, int stringLenght) {

		for (int i = 0; i < stringLenght; i++) {
			int shiftPostion = (i + numberOfShift) % stringLenght;
			shiftString[shiftPostion] = c[i];

		}
		int index=0;
		while (index < stringLenght) {
			System.out.println(shiftString[index]);
			index++;
		}
	}

}
