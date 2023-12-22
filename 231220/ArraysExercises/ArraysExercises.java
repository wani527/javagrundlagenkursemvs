public class ArraysExercises {
	public static void main (String[] args) {
		NamesArray myNames = new NamesArray();
		myNames.printValueAtindex5();
		myNames.printMyName();
		myNames.printArrayLength();
		myNames.loopThroughArray();
		myNames.foreachLoopThroughArray();
		myNames.printArrayValuesFromTo(4,6);
		myNames.printArrayValuesFromTo(8,2);
		myNames.printArrayValuesFromTo(5,5);
/*		System.out.println(mynames[5]);
		System.out.println(mynames[1]);
		mynames[0] = "Primus";
		System.out.println(names.length);
		int i;
		for (i=0; i<=9; i++) {
			System.out.println(mynames[i]);
		}
		for (String name : mynames) {
			System.out.println(name);
		}
		for (i=2; i<=(mynames.length - 2); i++) {
			System.out.println(mynames[i]);
		} */
	}
}
