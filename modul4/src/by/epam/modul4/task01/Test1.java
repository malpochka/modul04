package by.epam.modul4.task01;

public class Test1 {
	private int x = 1;
	private int y = 3;

	public Test1() {

	}

	public Test1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void change() {
		int tmp = x;
		x = y;
		y = tmp;

	}

	public int summ() {
		return x + y;
	}

	public int max() {
		if (x > y) {
			return x;
		} else
			return y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test1 other = (Test1) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test1 [x=" + x + ", y=" + y + "]";
	}

}
