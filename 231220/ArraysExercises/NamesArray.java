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
	public void printValueAtindex5() {
		System.out.println(this.names[5]);
	}
	public void printMyName() {
		System.out.println(this.names[1]);
	}
	public void printArrayLength() {
		System.out.println(this.names.length);
	}
	public void loopThroughArray() {
		int i;
		for (i=0; i<=9; i++) {
			System.out.println(this.names[i]);
		}
	}
	public void foreachLoopThroughArray() {
		for (String name : this.names) {
			System.out.println(name);
		}
	}
	public void printArrayValuesFromTo(int startPos, int endPos) {
		int i;
		for (i=startPos; i<=endPos; i++) {
			System.out.println(this.names[i]);
		}
	}
}
