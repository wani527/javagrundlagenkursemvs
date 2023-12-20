public class ArraysExercises {
	public static void main (String[] args) {
		String[] names = new String[10];
		names[0] = "Primis";
		names[1] = "wani527";
		names[2] = "Peter";
		names[3] = "Hanspeter";
		names[4] = "Max";
		names[5] = "Ben";
		names[6] = "Peter-Hans";
		names[7] = "Primis-Max";
		names[8] = "Max-Primis";
		names[9] = "Hans";
		System.out.println(names[5]);
		System.out.println(names[1]);
		names[0] = "Primus";
		System.out.println(names.length);
		int i;
		for (i=0; i<=9; i++) {
			System.out.println(names[i]);
		}
	}
}
