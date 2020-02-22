class Stack { //LIFO (last in first out)
	private int size;
	private int top;
	private String[] arr;

	public Stack(int size) {
		this.size = size;
		top = -1;
		arr = new String[size];
		Util.init(arr);
	}
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if (top == size - 1) {
			return true;
		}
		return false;
	}
	public void push(String item) {
		if(isFull()) {
			Util.print("Stack is full!");
			return;
		}
		top++;
		arr[top] = item;
	}
	public void pop() {
		if(isEmpty()) {
			Util.print("Stack is empty!");
			return;
		}
		top--;
		return;
	}
	public void reset() {
		Util.init(arr);
		top = -1;
	}
	public void println() {
		Util.println(arr);
	}
	public void print() {
		Util.print(arr);
	}
	public String list() {
		return Util.list(arr);
	}
}