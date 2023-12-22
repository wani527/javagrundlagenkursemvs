public class NamesArray {
	public String[] names = new String[10];
	public NamesArray() {
		this.names[0] = "Primis";
		this.names[1] = "wani527";
		this.names[2] = "Peter";
		this.names[3] = "Hanspeter";
		this.names[4] = "Max";
		this.names[5] = "Ben";
		this.names[6] = "Peter-Hans";
		this.names[7] = "Primis-Max";
		this.names[8] = "Max-Primis";
		this.names[9] = "Hans";
		this.names[0] = "Primus";
	}
	private void printNameByPosition(int position) {
		System.out.println("name: " + this.names[position]);
	}
	public void printValueAtindex5() {
		printNameByPosition(5);
	}
	public void printMyName() {
		printNameByPosition(1);
	}
	public void printArrayLength() {
		System.out.println(this.names.length);
	}
	public void loopThroughArray() {
		int i;
		for (i=0; i<=9; i++) {
			printNameByPosition(i);
		}
	}
	public void foreachLoopThroughArray() {
		for (String name : this.names) {
			System.out.println(name);
		}
	}
	public void printArrayValuesFromTo(int startPos, int endPos) {
		int i;
		if (startPos < endPos) {
			for (i=startPos; i<=endPos; i++) {
				printNameByPosition(i);
			}
		} else if (startPos > endPos) {
			for (i=startPos; i>=endPos; i--) {
				printNameByPosition(i);
			}
		} else {
			System.err.println("Startposition can't be the same as endposition!");
		}
	}
}
